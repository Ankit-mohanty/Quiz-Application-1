package com.quize.quzeeapp.serve;

import com.quize.quzeeapp.dao.Questiondao;
import com.quize.quzeeapp.model.Questions;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ServiceQuestion {

    private final Questiondao qd;

    public ResponseEntity<List<Questions>> getAllQuestion() {
        try {
            return new ResponseEntity<>(qd.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Questions>> getQuestionByCategory(String category) {
        try {
            return new ResponseEntity<>(qd.findByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<String> addQuestion(Questions que) {
        qd.save(que);
        return new ResponseEntity<>("SUCESS", HttpStatus.CREATED);
    }
}
