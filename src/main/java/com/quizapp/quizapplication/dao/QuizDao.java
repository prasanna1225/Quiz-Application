package com.quizapp.quizapplication.dao;

import com.quizapp.quizapplication.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
