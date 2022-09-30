package com.commerce.commercebankfundraiser.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    public final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getUser(){
        return userRepo.findAll();
    }
}
