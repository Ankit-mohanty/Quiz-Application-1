package com.quize.quzeeapp.control;

import com.quize.quzeeapp.model.Questions;
import com.quize.quzeeapp.serve.ServiceQuestion;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class QueController {

    private final ServiceQuestion sq;
    @GetMapping("/allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){
        return sq.getAllQuestion() ;
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Questions>> getQuestionsBy(@PathVariable String category){
        return sq.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Questions questions){
        return sq.addQuestion(questions);
    }
}
