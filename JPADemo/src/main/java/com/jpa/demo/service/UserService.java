package com.jpa.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.dao.UserDAO;
import com.jpa.demo.model.User;
import java.util.List; 

@Service
public class UserService {
	
	@Autowired
	UserDAO userdao;
	
	public List<User> findAll(){
		System.out.println("Calling Service "+userdao.findAll());
		return  (List<User>) userdao.findAll();
	}
	
}
