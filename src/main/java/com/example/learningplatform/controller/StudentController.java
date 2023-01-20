package com.example.learningplatform.controller;

import com.example.learningplatform.ds.Student;
import com.example.learningplatform.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/register-form")
    public String registerForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "registerForm";
    }

    @PostMapping("/save")
    public String saveStudent(Student student) {
        service.saveStudent(student);
        return "student-list";
    }
}
