package com.example.quizzler.controllers;

import com.example.quizzler.models.Category;
import com.example.quizzler.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/categories/{id}")
    public Category getTopic(@PathVariable String id){
        return categoryService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/categories")
    public void addTopic(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/categories")
    public void updateTopic(@RequestBody Category category){
        categoryService.updateCategory(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/categories/{id}")
    public void deleteTopic(@PathVariable String id){
        categoryService.deleteCategory(id);
    }

}
