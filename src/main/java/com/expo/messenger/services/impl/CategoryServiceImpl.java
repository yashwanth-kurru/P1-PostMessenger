package com.expo.messenger.services.impl;

import com.expo.messenger.entities.Category;
import com.expo.messenger.repositories.CategoryRepo;
import com.expo.messenger.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> getAllCategories(){
        return (List<Category>) categoryRepo.findAll();
    }

    public Category insertCategory(Category category){
        return this.categoryRepo.save(category);
    }

    public Category updateCategory(Category category)
    {
        return this.categoryRepo.save(category);
    }

    public Optional<Category> getCategoryById(int id)
    {
        return this.categoryRepo.findById(id);
    }

    public void deleteCategory(Category category){
        categoryRepo.delete(category);
    }

}
