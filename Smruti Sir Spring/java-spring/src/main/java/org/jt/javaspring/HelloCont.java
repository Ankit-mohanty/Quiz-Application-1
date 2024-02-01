package org.jt.javaspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Controller
public class HelloCont {
    @GetMapping("/home")
    public String SpringWeb(Model model) {

        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();

        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter myTimeFormat = DateTimeFormatter.ofPattern("HH-mm-ss");

        String date = myDate.format(myDateFormat);
        String time = myTime.format(myTimeFormat);

        String heading = "THIS MY FIRST SPRINGBOOT PROJECT";

        var student1 = new Person("Ankit Mohanty", "B.Sc", "BBSR",
                "Ankit@mail.com", "8249");
        var student2 = new Person("RAM MOHAN", "b.Com", "BBSR",
                "ram@mail.com", "4293");
        var student3 = new Person("GYAN MOHAPATRA", "B.Tech", "BBSR",
                "gyan@mail.com", "8242");

        var course1 = new Course("1", "JAVA", "6MONTH", "24000");
        var course2 = new Course("2", "PHYTHON", "6MONTH", "24000");
        var course3 = new Course("3", "UPSC", "6MONTH", "24000");

        var course = List.of(course1, course2, course3);

        model.addAllAttributes(Map.of("courses", course,
                "student1", student1,
                "student2", student2,
                "student3", student3,
                "heading", heading,
                "date", date,
                "time", time));
        return "home";
    }
}
