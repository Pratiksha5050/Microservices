package com.question.QuestionService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.QuestionService.entity.Question;

public interface QuestionRepository extends JpaRepository<Question,Long>{

	List<Question> findByQuizId(Long quizId);
}
