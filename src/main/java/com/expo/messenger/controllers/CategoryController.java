package com.expo.messenger.controllers;

import com.expo.messenger.entities.Admin;
import com.expo.messenger.entities.Category;
import com.expo.messenger.models.request.CategoryDTO;
import com.expo.messenger.services.CategoryService;
import com.expo.messenger.services.impl.CategoryServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/add")
    public ResponseEntity<Category> addCategory(@RequestBody CategoryDTO categoryDTO){
        Category category = modelMapper.map(categoryDTO, Category.class);
        return new ResponseEntity<>(categoryService.insertCategory(category),HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Category>> getCategory(){
         return new ResponseEntity<>(this.categoryService.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public void getCategoryWithId(){

    }

    @PutMapping("/update")
    public ResponseEntity<Category> updateCategory(@RequestBody CategoryDTO categoryDTO){
        Category category = modelMapper.map(categoryDTO, Category.class);
        log.info("Here here ==>  "+ category.getCategoryName()+" "+category.getCategoryName()+" "+category.getCategoryDescription());
        return new ResponseEntity<>(categoryService.updateCategory(category),HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public void deleteCategory(){

    }


}
