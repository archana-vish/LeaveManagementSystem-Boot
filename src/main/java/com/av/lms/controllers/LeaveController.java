package com.av.lms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {

    @GetMapping("/")
    public String testRoute() {
        return "LMS App works";
    }
}
