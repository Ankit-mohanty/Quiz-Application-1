package com.quize.quzeeapp.control;

import com.quize.quzeeapp.model.QuestionWrapper;
import com.quize.quzeeapp.model.Respo;
import com.quize.quzeeapp.serve.QuizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Quize")
@RequiredArgsConstructor
public class Quizecontroller {
    private final QuizeService sz;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title) {
        return sz.createQuize(category, numQ, title);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable Integer id) {
        return sz.getQuizQuestion(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuize(@PathVariable Integer id, @RequestBody List<Respo> res) {
        return sz.calculateresult(id, res);
    }
}
