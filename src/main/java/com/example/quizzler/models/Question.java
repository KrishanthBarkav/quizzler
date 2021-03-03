package com.example.quizzler.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question {

    @Id
    private String id;

    private String question;

    private String answer;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Question(){

    }

    public String getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
