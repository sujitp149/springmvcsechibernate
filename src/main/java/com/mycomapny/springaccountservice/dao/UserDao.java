package com.mycomapny.springaccountservice.dao;

import java.util.List;

import com.mycomapny.springaccountservice.model.User;
 
 
public interface UserDao {
 
    User findById(int id);
     
    User findBySSO(String sso);
     
    void save(User user);
     
    void deleteBySSO(String sso);
     
    List<User> findAllUsers();
 
}
