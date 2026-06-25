package com.example.QuizzApplication.Controller;


import com.example.QuizzApplication.Entity.Questions;
import com.example.QuizzApplication.Service.QuestionService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController
{
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }


    @PostMapping("addQuestion")
    public ResponseEntity<Questions> addQuestion(@RequestBody Questions question)
    {
        return questionService.addQuestion(question);
    }


    @GetMapping("/category/{category}")
    public ResponseEntity<List<Questions>> getQuestionByCategory(@PathVariable String category)
    {
        return questionService.getQuestionByCategory(category);
    }

    @PutMapping("updateQuestion")
    public ResponseEntity<Questions> updateQuestion(@RequestBody Questions question)
    {
        return questionService.updateQuestion(question);
    }



}
