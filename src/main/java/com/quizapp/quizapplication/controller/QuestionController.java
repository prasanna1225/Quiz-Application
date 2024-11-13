package com.quizapp.quizapplication.controller;

import com.quizapp.quizapplication.model.Questions;

import com.quizapp.quizapplication.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/getallQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){
        return new ResponseEntity<>(questionService.getAllQuestions(), HttpStatus.OK);
    }

    @GetMapping("/getQuestionByCategory/{category}")
    public List<Questions> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionBycategory(category);
    }
    @PostMapping("/addQuestion")
    public String addNewQuestion(@RequestBody Questions questions){
        return questionService.addNewQuestion(questions);
    }

}
