package com.ecommerceApp.ecommerceApp.ecomSite.contoller;

import com.ecommerceApp.ecommerceApp.ecomSite.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class SpringSecurityController {
    private List<Student> students = Arrays.asList(new Student(1, "Ram", 90.1), (new Student(2, "Sam", 92.1)));

    @GetMapping("/student")
    public String testPage(HttpServletRequest httpServletRequest) {
        return "Hello world :" + httpServletRequest.getSession().getId();
    }

}
