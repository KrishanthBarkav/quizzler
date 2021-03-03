package com.example.quizzler.repositories;

import com.example.quizzler.models.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, String> {
    public List<Question> findByCategoryId(String id);
}
