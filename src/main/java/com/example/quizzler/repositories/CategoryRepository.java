package com.example.quizzler.repositories;

import com.example.quizzler.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {

}

