package com.expo.messenger.controllers;

import com.expo.messenger.entities.Admin;
import com.expo.messenger.entities.Category;
import com.expo.messenger.services.CategoryService;
import com.expo.messenger.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @PostMapping("/add")
    public void addCategory(@RequestBody Category cat){

    }

    @GetMapping("/get")
    public ResponseEntity<List<Category>> getCategory(){
         return new ResponseEntity<>(this.categoryService.getAllCategories(), HttpStatus.OK);
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
