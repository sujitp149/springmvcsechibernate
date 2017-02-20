package com.mycomapny.springaccountservice.service;

import java.util.List;

import com.mycomapny.springaccountservice.model.UserProfile;
 
 
public interface UserProfileService {
 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}
