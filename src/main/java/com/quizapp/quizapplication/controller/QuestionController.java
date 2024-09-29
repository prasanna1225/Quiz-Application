package com.quizapp.quizapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @GetMapping("/getallQuestions")
    public String getAllQuestions(){
        return "Hi here my questions";
    }
}
