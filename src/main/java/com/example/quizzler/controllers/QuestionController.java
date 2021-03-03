package com.example.quizzler.controllers;

import com.example.quizzler.models.Question;
import com.example.quizzler.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping(value = "/questions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping(value = "/categories/{id}/questions")
    public List<Question> getQuestionsByCategoryId(@PathVariable String id){
        return questionService.getQuestionsByCategoryId(id);
    }

    @GetMapping(value = "/categories/{category_id}/questions/{id}")
    public Question getQuestion(@PathVariable String id){
        return questionService.getQuestion(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/categories/{category_id}/questions")
    public void addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
    }

}
