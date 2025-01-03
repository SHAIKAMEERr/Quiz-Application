package com.quizapp.user_management_service.dao;

import com.quizapp.user_management_service.entity.UserEntity;
import java.util.Optional;

public interface UserDAO {
    Optional<UserEntity> findUserByEmail(String email);
    UserEntity saveUser(UserEntity user);
}

