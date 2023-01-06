package dev.shaneholland.demo.jpasecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER)")
    public String user() {
        return "Hello user";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN)")
    public String admin() {
        return "Hello admin";
    }

}
