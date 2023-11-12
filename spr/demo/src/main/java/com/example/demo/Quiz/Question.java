package com.example.demo.Quiz.model;

import java.util.UUID;
import java.util.List;

public class Question {

    public UUID uuid;
    public String question;
    public boolean isCorrect;

    public Question(String question, boolean isCorrect) {
        this.question = question;
        this.isCorrect = isCorrect;
    };
}