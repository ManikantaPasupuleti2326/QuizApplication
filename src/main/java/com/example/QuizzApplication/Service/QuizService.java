package com.example.QuizzApplication.Service;

import com.example.QuizzApplication.Entity.QuestionWrapper;
import com.example.QuizzApplication.Entity.Questions;
import com.example.QuizzApplication.Entity.Quiz;
import com.example.QuizzApplication.Entity.Response;
import com.example.QuizzApplication.Repository.QuestionDAO;
import com.example.QuizzApplication.Repository.QuizDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService
{
    @Autowired
    QuizDAO quizDAO;

    @Autowired
    QuestionDAO questionDAO;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title)
    {

        List<Questions> questions=questionDAO.findrandomQuestionsByCategory(category, numQ);
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDAO.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id)
    {
        Optional<Quiz> quiz=quizDAO.findById(id);
        List<Questions> questionsFromDB=quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser=new ArrayList<>();

        for(Questions q : questionsFromDB)
        {
            QuestionWrapper qw=new QuestionWrapper(q.getQuestionId(), q.getQuestionTitle(), q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
            questionsForUser.add(qw);
        }

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(int id, List<Response> responses)
    {
        Quiz quiz=quizDAO.findById(id).get();
        List<Questions> questions=quiz.getQuestions();
        int right=0;
        int i=0;
        for(Response response : responses)
        {
            if(response.getResponse().equals(questions.get(i).getCorrectAnswer()))
            {
                right++;
            }
            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
