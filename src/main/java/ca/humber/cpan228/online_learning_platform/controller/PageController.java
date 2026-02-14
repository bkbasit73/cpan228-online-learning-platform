package ca.humber.cpan228.online_learning_platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Online Learning Platform");
        return "home";
    }

    @GetMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("title", "Courses");
        return "courses";
    }

    @GetMapping("/courses/new")
    public String createCourseForm(Model model) {
        model.addAttribute("title", "Create Course");
        return "course-form";
    }

    @PostMapping("/courses/new")
    public String handleCreateCourse(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String category,
            Model model
    ) {
        model.addAttribute("createdTitle", title);
        model.addAttribute("createdDescription", description);
        model.addAttribute("createdCategory", category);
        return "course-created";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Login");
        return "login";
    }
}
