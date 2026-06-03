package com.jsp.user_module.model.service;

import com.jsp.user_module.model.dto.LoginRequest;
import com.jsp.user_module.model.dto.UserRequest;
import com.jsp.user_module.model.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponse register(UserRequest user);
    UserResponse login(LoginRequest login);
    UserResponse profile(Integer id);
    void deleteUser(Integer id);
    UserResponse changePassword(String email, String oldPassword, String newPassword);

}
