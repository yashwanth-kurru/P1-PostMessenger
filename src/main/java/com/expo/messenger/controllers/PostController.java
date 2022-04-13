package com.expo.messenger.controllers;


import com.expo.messenger.entities.Category;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping("/add")
    public void addCategory(@RequestBody Category cat){

    }

    @GetMapping("/get")
    public void getPosts(){

    }

    @GetMapping("/get/{id}")
    public void getCategoryWithId(){

    }

    @PutMapping("/update")
    public void updateCategory(){

    }

    @DeleteMapping("/delete")
    public void deleteCategory(){

    }

}
