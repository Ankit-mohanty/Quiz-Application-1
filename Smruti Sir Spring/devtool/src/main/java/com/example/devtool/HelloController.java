package com.example.devtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.PrintWriter;

@Controller
public class HelloController {

    @GetMapping("/home")
    public void getHomeMethod(PrintWriter pw) {
        pw.print("Ankit Mohanty");
    }
}
