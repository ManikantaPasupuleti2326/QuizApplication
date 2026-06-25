package com.example.QuizzApplication.Repository;

import com.example.QuizzApplication.Entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO extends JpaRepository<Questions, Integer>
{

    List<Questions> findByCategory(String category);


    @Query(value = "SELECT * FROM questions WHERE category=:category ORDER BY RAND() LIMIT :numQ",nativeQuery = true)
    List<Questions> findrandomQuestionsByCategory(String category, int numQ);
}
