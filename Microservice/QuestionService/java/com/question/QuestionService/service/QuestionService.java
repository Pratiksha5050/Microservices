package com.question.QuestionService.service;

import java.util.List;

import com.question.QuestionService.entity.Question;

public interface QuestionService {
	Question create(Question question);

	List<Question> get();

	Question getOne(Long id);
	 List<Question> getQuestionOfQuiz(Long quizId);
}
