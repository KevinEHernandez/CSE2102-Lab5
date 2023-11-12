package com.example.demo.controller;

import com.example.demo.Quiz.model.Question;
import com.example.demo.Quiz.model.QuestionBank;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class QuizController {

    @GetMapping("/quiz")
    public String quizPage(Model model) {
        
        QuestionBank questionBank = new QuestionBank();

        List<Question> questions = questionBank.getQuestions();
        model.addAttribute("questions", questions);

        return "quiz";
    }
}
