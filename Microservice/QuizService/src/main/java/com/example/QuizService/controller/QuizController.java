package com.example.QuizService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuizService.Entity.Quiz;
import com.example.QuizService.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	private QuizService quizService;

	public QuizController(QuizService quizService) {
		this.quizService = quizService;
	}
	
	@PostMapping("/create")
	public Quiz create(@RequestBody Quiz quiz)
	{
		return quizService.add(quiz);
	}
	
	@GetMapping()
	public List<Quiz> get()
	{
		return quizService.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable Long id)
	{
		return quizService.get(id);
	}
}
