package blog.mo.MoBlog;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BlogController {
    private final List<Blog> blogs;

    public BlogController() {
        blogs = new ArrayList<>();
    }

    @GetMapping({"/", "blogs"})
    public String blogs(Model model) {
        model.addAttribute("blogs", blogs);
        return "blogs";
    }

    @GetMapping("/blog")
    public String blog(@RequestParam int id, Model model) {// git add.
        var blog = blogs.get(id);
        model.addAttribute("blog", blog);
        return "blog"; // git commit -m "controller desing add"
    }

    @GetMapping("/add-blog")
    public String addblog() {
        return "/add-blog";
    }

    @PostMapping("/add-blog") // if give same pathto method get and post both then by default it called get
    // request.
    // public String addblog(HttpServletRequest request, PrintWriter pw) {
    //public void addblog(@RequestParam String heading, @RequestParam String description, PrintWriter pw) {
    //public void addblog(@ModelAttribute Blog blog, PrintWriter pw) { // if we wnat to send single data we are using request param.If we sent multipledat we are using model atribute.
    public String addblog(@ModelAttribute Blog blog) {// here we redirect addblog to blogs.here we called one controler to another controller.
        // String heading= request.getParameter("heading");
        // String description= request.getParameter("description");
        //pw.println(blog);
        blogs.add(blog);
        //pw.println(description);
        return "redirect:/blogs";
    }
}

