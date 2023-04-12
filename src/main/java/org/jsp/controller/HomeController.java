package org.jsp.controller;

import javax.servlet.http.HttpSession;

import org.jsp.dto.User; 
import org.jsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(names = {"user"})
public class HomeController 
{
	@Autowired
	UserService service;
	
	@RequestMapping("/load")
	public ModelAndView load(ModelAndView mv)
	{
		mv.addObject("user",new User());
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping(value="/reg" , method=RequestMethod.POST)
	public ModelAndView reg(@ModelAttribute User u,ModelAndView mv)
	{
		u=service.saveUser(u);
		mv.addObject("message","User registered with id : "+u.getId());
		mv.setViewName("registered");
		return mv;
	}
	
	
	@RequestMapping(value="/login")
	public ModelAndView login(ModelAndView mv,@RequestParam(name="phone") long phone,@RequestParam(name="password") String password)
	{
		User u=service.verifyUser(phone, password);
		if(u!=null)
		{
			mv.addObject("user",u);
			mv.setViewName("home");
			return mv;
		}
		else
		{
			mv.addObject("message","Invalid phone number or password. please try again");
			mv.setViewName("login");
			return mv;
		}
		
	}
	
	
	
	
	
	
	
	

	@RequestMapping(value="/profile")
	public ModelAndView profile(ModelAndView mv)
	{
		mv.setViewName("profile");
		return mv;
	}
	@RequestMapping(value="/edit")
	public ModelAndView edit(ModelAndView mv,HttpSession ss)
	{
		User u=(User)ss.getAttribute("user");
		mv.addObject("myuser",u);
		mv.setViewName("edit");
		return mv;
	}
	@RequestMapping(value="/up",method =RequestMethod.POST)
	public ModelAndView up(@ModelAttribute User u,ModelAndView mv)
	{
		u=service.updateUser(u);
		mv.addObject("message",u.getName()+" details updated successfully");
		mv.setViewName("updated");
		return mv;
	}
	@RequestMapping(value="/delete")
	public ModelAndView delete(ModelAndView mv,HttpSession ss)
	{
		User u=(User)ss.getAttribute("user");
		String name=u.getName();
		service.deleteUser(u);
		mv.addObject("message",name+" account deleted successfully");
		mv.setViewName("deleted");
		return mv;
	}
	@RequestMapping(value="/logout")
	public ModelAndView logout(ModelAndView mv,HttpSession ss)
	{
		ss.invalidate();
		mv.setViewName("login");
		return mv;
	}
}
