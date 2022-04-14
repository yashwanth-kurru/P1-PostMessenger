package com.expo.messenger.controllers;

import com.expo.messenger.entities.User;
import com.expo.messenger.entities.User;
import com.expo.messenger.models.request.UserDTO;
import com.expo.messenger.services.impl.UserServiceImpl;
import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody UserDTO userDto){
        User user = modelMapper.map(userDto, User.class);
        return new ResponseEntity<>(userService.insertUser(user),HttpStatus.OK);
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
