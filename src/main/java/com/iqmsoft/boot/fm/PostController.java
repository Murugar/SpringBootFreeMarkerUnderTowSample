package com.iqmsoft.boot.fm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    @GetMapping("/")
    public String index() {
        return "redirect:/form";
    }

    @GetMapping("/form")
    public String formGet() {
        return "form";
    }

    @PostMapping("/form")
    public String formPost(Person user, Model model) {
        model.addAttribute("user", user);
        return "form";
    }
}
