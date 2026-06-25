package com.example.QuizzApplication.Service;

import com.example.QuizzApplication.Entity.Questions;
import com.example.QuizzApplication.Repository.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService
{
    @Autowired
    QuestionDAO questionDAO;


    public ResponseEntity<List<Questions>> getAllQuestions()
    {
       try
       {
           return new ResponseEntity<>(questionDAO.findAll(), HttpStatus.OK);
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Questions> addQuestion(Questions question)
    {
        return new ResponseEntity<>(questionDAO.save(question), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Questions>> getQuestionByCategory(String category)
    {
        return new ResponseEntity<>(questionDAO.findByCategory(category),HttpStatus.OK);
    }

    public ResponseEntity<Questions> updateQuestion(Questions question)
    {
        return new ResponseEntity<>(questionDAO.save(question), HttpStatus.OK);
    }


}
