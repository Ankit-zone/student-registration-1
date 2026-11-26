package com.example.studentregistration;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @PostMapping("/register")
    public String registerStudent(
            @RequestParam String studentName,
            @RequestParam String rollNumber,
            @RequestParam String email,
            @RequestParam String course) {

        return "<h2>Registration Successful!</h2>" +
               "<p>Student Name: " + studentName + "</p>" +
               "<p>Roll Number: " + rollNumber + "</p>" +
               "<p>Email: " + email + "</p>" +
               "<p>Course: " + course + "</p>" +
               "<a href='/'>Register Another Student</a>";
    }
}