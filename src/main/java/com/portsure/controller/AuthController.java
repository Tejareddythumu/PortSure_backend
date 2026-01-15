package com.portsure.controller;

import org.springframework.web.bind.annotation.*;
import com.portsure.service.AuthService;
import com.portsure.dto.RegisterRequest;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }
}
