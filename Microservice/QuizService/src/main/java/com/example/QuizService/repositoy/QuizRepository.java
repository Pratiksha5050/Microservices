package com.example.QuizService.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.QuizService.Entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Long>{

	}


