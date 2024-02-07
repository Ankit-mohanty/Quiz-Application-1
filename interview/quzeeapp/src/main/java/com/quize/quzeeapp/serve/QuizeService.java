package com.quize.quzeeapp.serve;

import com.quize.quzeeapp.dao.Questiondao;
import com.quize.quzeeapp.dao.QuizeDao;
import com.quize.quzeeapp.model.QuestionWrapper;
import com.quize.quzeeapp.model.Questions;
import com.quize.quzeeapp.model.Quize;
import com.quize.quzeeapp.model.Respo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuizeService {
    private final Questiondao qd;
    private final QuizeDao qz;

    public ResponseEntity<String> createQuize(String category, int numQ, String title) {
        List<Questions> questions = qd.findRandomQuestionsByCategory(category, numQ);
        Quize quize = new Quize();
        quize.setTitle(title);
        quize.setQuestions(questions);
        qz.save(quize);
        return new ResponseEntity<>("SUCESS", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer id) {
        Optional<Quize> qu = qz.findById(id);
        List<Questions> questionsFormDb = qu.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        for (Questions q : questionsFormDb) {
            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionsForUser.add(qw);
        }
        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateresult(Integer id, List<Respo> res) {
        Quize quize = qz.findById(id).get();
        List<Questions> questions = quize.getQuestions();
        int right = 0;
        int i = 0;
        for (Respo rs : res) {
            if (rs.getResponse().equals(questions.get(i).getRightAns()))

                right++;
            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}

