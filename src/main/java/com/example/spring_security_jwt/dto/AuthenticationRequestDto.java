package com.example.spring_security_jwt.dto;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
    public String username;
    public String password;
}
