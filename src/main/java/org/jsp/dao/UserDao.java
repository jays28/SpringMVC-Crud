package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao 
{
	//DAO- Data Access Object
	@Autowired
	EntityManager em;
	
	public User saveUser(User u)
	{
		EntityTransaction tr=em.getTransaction();
		tr.begin();
		em.persist(u);
		tr.commit();
		return u;
	}


	public User verifyUser(long phone, String password) {
		String qry="select u from User u where u.phone=?1 and u.password=?2";
		Query q=em.createQuery(qry);
		q.setParameter(1, phone);
		q.setParameter(2, password);

		List<User> users=q.getResultList();
		if(users.size()>0) 
			return users.get(0);
		return null;
		
	}
	
	public User updateUser(User u)
	{
		EntityTransaction tr=em.getTransaction();
		tr.begin();
		em.merge(u);
		tr.commit();
		return u;
	}
	public User deleteUser(User u)
	{
		EntityTransaction tr=em.getTransaction();
		tr.begin();
		em.remove(u);
		tr.commit();
		return u;
	}
}
