package com.expo.messenger.controllers;

import com.expo.messenger.entities.User;
import com.expo.messenger.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/")
    public void addUser(@RequestBody User user){

    }

    @GetMapping("/get")
    public ResponseEntity<List<User>> getUser()
    {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/")
    public void getUserWithId(){

    }

    @PutMapping("/update")
    public void updateUser(){

    }

    @DeleteMapping("/delete")
    public void deleteUser(){

    }

}
