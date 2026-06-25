package com.example.QuizzApplication.Repository;

import com.example.QuizzApplication.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDAO  extends JpaRepository<Quiz, Integer> {
}
