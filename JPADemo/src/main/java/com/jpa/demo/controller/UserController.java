package com.jpa.demo.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpa.demo.dao.UserDAO;
import com.jpa.demo.model.User;
import com.jpa.demo.service.UserService;

import java.util.List; 
@Controller
//@RestController
public class UserController {
	
	@Autowired
	UserDAO userdao;
	@Autowired
	UserService userService;
	
	@RequestMapping("index")
	public String user() {
		
		return "index.jsp";
	}
	@RequestMapping("addUser")
	public String addUser(User user) {
		userdao.save(user);
		return "index.jsp";
	}
	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam int id) {
		
		ModelAndView mav = new ModelAndView("showUser.jsp");
		User user = userdao.findById(id).get();
		
		mav.addObject(user);
		return mav;
	}
	@RequestMapping("getAllUser")
	public List<User> getAllUser() {
		
		
//		ModelAndView mav = new ModelAndView("getAllUser.jsp");
//		userService = null;
//		List<User> users = userService.findAll();
		System.out.println("calling");
//		mav.addObject(users);
		return userService.findAll();
	}
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id) {
		
		ModelAndView mav = new ModelAndView("deleteUser.jsp");
		User user = userdao.findById(id).orElse(new User());
		userdao.deleteById(id);
		mav.addObject(user);
		return mav;
	}
	@RequestMapping("updateUser")
	public ModelAndView updateUser(User user) {
		
		ModelAndView mav = new ModelAndView("updateUser.jsp");
		user = userdao.findById(user.getId()).orElse(new User());
		userdao.deleteById(user.getId());
		mav.addObject(user);
		return mav;
	}
}
