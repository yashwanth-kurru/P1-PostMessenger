package com.expo.messenger.controllers;


import com.expo.messenger.entities.Category;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @PostMapping("/")
    public void addCategory(@RequestBody Category cat){

    }

    @GetMapping("/")
    public void getCategoryWithId(){

    }

    @PutMapping("/")
    public void updateCategory(){

    }

    @DeleteMapping("/")
    public void deleteCategory(){

    }

}
