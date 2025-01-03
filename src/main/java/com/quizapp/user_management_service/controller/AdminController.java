package com.quizapp.user_management_service.controller;

import com.quizapp.user_management_service.dto.request.RoleRequestDTO;
import com.quizapp.user_management_service.dto.response.RoleResponseDTO;
import com.quizapp.user_management_service.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/roles")
    public ResponseEntity<RoleResponseDTO> createRole(@RequestBody RoleRequestDTO roleRequestDTO) {
        return ResponseEntity.ok(adminService.createRole(roleRequestDTO));
    }
}

