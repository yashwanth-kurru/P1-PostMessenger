package com.expo.messenger.services.impl;

import com.expo.messenger.entities.User;
import com.expo.messenger.repositories.UserRepo;
import com.expo.messenger.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    public User insertUser(User user){
        return userRepo.save(user);
    }

    public List<User> getAllUsers()
    {
        return (List<User>) this.userRepo.findAll();
    }

}
