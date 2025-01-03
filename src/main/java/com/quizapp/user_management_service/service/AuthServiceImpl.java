package com.quizapp.user_management_service.service;

import com.quizapp.user_management_service.dto.request.LoginRequestDTO;
import com.quizapp.user_management_service.dto.response.LoginResponseDTO;
import com.quizapp.user_management_service.exception.InvalidCredentialsException;
import com.quizapp.user_management_service.service.AuthService;
import com.quizapp.user_management_service.util.JWTUtil;
import com.quizapp.user_management_service.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private PasswordUtil passwordUtil;

    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {
        // Mock authentication logic (replace with actual logic)
        if (!"admin".equals(loginRequestDTO.getUsername()) ||
                !passwordUtil.verifyPassword(loginRequestDTO.getPassword(), "hashed_password")) {
            throw new InvalidCredentialsException("Invalid username or password");
        }
        String token = jwtUtil.generateToken(loginRequestDTO.getUsername());
        return new LoginResponseDTO(token);
    }
}