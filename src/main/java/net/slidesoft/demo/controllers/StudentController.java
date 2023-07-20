package net.slidesoft.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.slidesoft.demo.models.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
    
    private static final List<Student> studentsrepo = new ArrayList<>();
    static {
        studentsrepo.add( new Student("001", "Rachid Alaoui", "00212456789", "info@rachid.com") );
    }

    @GetMapping()
    public String getAllStudents( Model model ){
        model.addAttribute("students", studentsrepo);
        return "students" ;
    }

}
