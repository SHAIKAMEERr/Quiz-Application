package com.quizapp.user_management_service.service;

import com.quizapp.user_management_service.dto.request.RoleRequestDTO;
import com.quizapp.user_management_service.dto.response.RoleResponseDTO;

public interface AdminService {
    RoleResponseDTO createRole(RoleRequestDTO roleRequestDTO);
}
