package com.example.QuizService.service;

import java.util.List;

import com.example.QuizService.Entity.Quiz;

public interface QuizService {
	Quiz add(Quiz quiz);
	List<Quiz> get();
	Quiz get(Long id);
}
