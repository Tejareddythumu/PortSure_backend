package com.portsure.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String emailOrId;
    private String password;
    private String role;
}
