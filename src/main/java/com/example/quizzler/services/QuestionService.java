package com.example.quizzler.services;

import com.example.quizzler.models.Question;
import com.example.quizzler.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        List<Question> questions = new ArrayList<>();
        questionRepository.findAll()
                .forEach(questions::add);
        return questions;
    }

    public List<Question> getQuestionsByCategoryId(String id){
        List<Question> questions = new ArrayList<>();
        questionRepository.findByCategoryId(id)
                .forEach(questions::add);
        return questions;
    }

    public Question getQuestion(String id){
        return questionRepository.findById(id).get();
    }

    public void addQuestion(Question question){
        questionRepository.save(question);
    }

}
