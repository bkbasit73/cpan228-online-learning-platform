package ca.humber.cpan228.online_learning_platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Online Learning Platform");
        model.addAttribute("message", "Welcome to the Online Learning Platform!");
        return "home"; // this will load templates/home.html
    }

    @GetMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("title", "Courses");
        return "courses"; // templates/courses.html
    }
}
