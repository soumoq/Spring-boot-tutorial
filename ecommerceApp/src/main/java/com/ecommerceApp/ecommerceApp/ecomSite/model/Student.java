package com.ecommerceApp.ecommerceApp.ecomSite.model;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private double marks;
}
