package com.quizapp.user_management_service.service;

import com.quizapp.user_management_service.dao.RoleDAO;
import com.quizapp.user_management_service.dto.request.RoleRequestDTO;
import com.quizapp.user_management_service.dto.response.RoleResponseDTO;
import com.quizapp.user_management_service.entity.RoleEntity;
import com.quizapp.user_management_service.service.AdminService;
import com.quizapp.user_management_service.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private MapperUtil mapperUtil;

    @Override
    public RoleResponseDTO createRole(RoleRequestDTO roleRequestDTO) {
        RoleEntity roleEntity = mapperUtil.convertToEntity(roleRequestDTO, RoleEntity.class);
        RoleEntity savedRole = roleDAO.save(roleEntity);
        return mapperUtil.convertToDTO(savedRole, RoleResponseDTO.class);
    }
}