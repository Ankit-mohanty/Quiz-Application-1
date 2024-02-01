package com.example.SECOEND;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.PrintWriter;

@Controller
public class hELLOCONTROLLER {
    @GetMapping("/home")
    public void getHomeMethod(PrintWriter pw){
        pw.print("Ankit");
    }
}
