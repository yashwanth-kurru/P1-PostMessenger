package com.expo.messenger.controllers;

import com.expo.messenger.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("/")
    public void addUser(@RequestBody User user){

    }

    @GetMapping("/")
    public void getUserWithId(){

    }

    @PutMapping("/")
    public void updateUser(){

    }

    @DeleteMapping("/")
    public void deleteUser(){

    }

}
