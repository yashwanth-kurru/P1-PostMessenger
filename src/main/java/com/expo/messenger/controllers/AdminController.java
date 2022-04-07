package com.expo.messenger.controllers;

import com.expo.messenger.entities.Admin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @PostMapping("/")
    public void addAdmin(@RequestBody Admin admin){

    }

    @GetMapping("/")
    public void getAdminWithId(){

    }

    @PutMapping("/")
    public void updateAdmin(){

    }

    @DeleteMapping("/")
    public void deleteCategory(){

    }



}
