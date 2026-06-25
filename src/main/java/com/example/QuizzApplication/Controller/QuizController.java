package com.example.QuizzApplication.Controller;


import com.example.QuizzApplication.Entity.QuestionWrapper;
import com.example.QuizzApplication.Entity.Response;
import com.example.QuizzApplication.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quizz")
public class QuizController
{
    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuizz(@RequestParam String category,@RequestParam int numQ,@RequestParam String title)
    {
        return quizService.createQuiz(category,numQ,title);

    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id)
    {
        return quizService.getQuizQuestions(id);
    }


    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable int id,@RequestBody List<Response> responses)
    {
        return quizService.calculateResult(id, responses);
    }
}
