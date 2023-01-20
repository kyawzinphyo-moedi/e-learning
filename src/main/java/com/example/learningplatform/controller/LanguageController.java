package com.example.learningplatform.controller;

import com.example.learningplatform.dao.LanguageDao;
import com.example.learningplatform.ds.Language;
import com.example.learningplatform.service.LanguageService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LanguageController {
    @Autowired
    private LanguageService service;

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        Language language = new Language("Java", "6 months", 600000);
        service.saveLanguage(language);
        return "success";
    }

    @GetMapping("/home")
    public String text() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/course-form")
    public String addCourse(Model model) {
        Language language = new Language();
        model.addAttribute("language", language);
        return "/languageForm";
    }

    @PostMapping("/save-language")
    public String saveLanguage(Language language){
        service.saveLanguage(language);
        return "/language-list";
    }
}
