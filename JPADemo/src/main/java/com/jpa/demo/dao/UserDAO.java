package com.jpa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.demo.model.User;

public interface UserDAO extends CrudRepository<User,Integer > {

}
