package com.mycomapny.springaccountservice.dao;

import java.util.List;

import com.mycomapny.springaccountservice.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}