package com.quizapp.quizapplication.service;

import com.quizapp.quizapplication.dao.QuestionDao;
import com.quizapp.quizapplication.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

//in this layer we write business logic
public class QuestionService {
     @Autowired
    QuestionDao questionDao;

    public List<Questions> getAllQuestions() {
     return questionDao.findAll();

    }

    public List<Questions> getQuestionBycategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addNewQuestion(Questions questions) {
        questionDao.save(questions);
        return "Success";

    }
}