package com.leixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.leixin.dao.UserDAO;
import com.leixin.model.User;
import com.leixin.service.UserService;
 
 
 
@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    @Qualifier("userDAO")
    private UserDAO userDAO;
     
    public int insertUser(User user) {
        // TODO Auto-generated method stub
        return userDAO.insertUser(user);
    }

    public User findUser(String name) {
        // TODO Auto-generated method stub
        return userDAO.findUser(name);
    }

    public User findUserByNameAndPassword(User user) {
        // TODO Auto-generated method stub
        return userDAO.findUserByNameAndPassword(user);
    }
 
}