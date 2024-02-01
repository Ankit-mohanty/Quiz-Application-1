package com.example.thymleaf;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HElloApp {

    @GetMapping({"/home", "/"})
    public String sayHello(Model model) {// Model class use for backend data send to front data
        var student1 = new Student("Ankit", 1, 12000.21);
        var student2 = new Student("Gyan", 1, 12000.21);
        var student3 = new Student("Rahul", 1, 12000.21);
        var students = List.of(student1, student2, student3);

        // student.setName("Ankit");
        // student.setRoll(1);
        // student.setFee(12000.12);
        model.addAttribute("student", students);// by addadtribute we can bind frontend data to backend data.
                                                 // model.addAttribute("name","roll","fee");
        return "Home";
    }
}
