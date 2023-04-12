package org.jsp.service;

import org.jsp.dao.UserDao;
import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
	@Autowired
	UserDao dao;
	
	public User saveUser(User u)
	{
		return dao.saveUser(u);
	}
	
	public User verifyUser(long phone,String password)
	{
		return dao.verifyUser(phone, password);
	}

	public User deleteUser(User u)
	{
		return dao.deleteUser(u);
	}

	public User updateUser(User u)
	{
		return dao.updateUser(u);
	}
}
