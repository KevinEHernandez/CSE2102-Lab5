package com.example.demo.Quiz.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private List<Question> questionList = new ArrayList<>();

    public QuestionBank() {
        questionList.add(new Question("Two + two = 5", false));
        questionList.add(new Question("11 is prime", true));
        questionList.add(new Question("1729 is prime", false));
    }

    public List<Question> getQuestions() {
        return questionList;
    }
}
