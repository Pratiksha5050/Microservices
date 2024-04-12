package com.question.QuestionService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.QuestionService.entity.Question;
import com.question.QuestionService.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionService questionService;

	@PostMapping("/createQuestion")
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}

	@GetMapping()
	public List<Question> get() {
		return questionService.get();
	}

	@GetMapping("/{questionId}")
	public Question getAll(@PathVariable Long questionId) {
		return questionService.getOne(questionId);
	}

	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionOfQuiz(@PathVariable Long quizId) {
		return questionService.getQuestionOfQuiz(quizId);
	}

}
