package com.quizapp.quizapplication.controller;


import com.quizapp.quizapplication.model.QuestionWrapper;
import com.quizapp.quizapplication.model.Questions;
import com.quizapp.quizapplication.model.Response;
import com.quizapp.quizapplication.service.QuizService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")

public class QuizController {
     @Autowired
    QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
     return new ResponseEntity<>(quizService.createQuiz(category, numQ, title), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@PathVariable Integer id){
        return quizService.getQuizQuestions(id);
    }
    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> response){
         return quizService.calculateResult(id,response);
        }



}
