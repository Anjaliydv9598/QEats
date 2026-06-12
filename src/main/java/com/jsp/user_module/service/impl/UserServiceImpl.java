package com.jsp.user_module.service.impl;

import com.jsp.user_module.dao.UserRepository;
import com.jsp.user_module.dto.LoginRequest;
import com.jsp.user_module.dto.UserRequest;
import com.jsp.user_module.dto.UserResponse;
import com.jsp.user_module.exception.UserException;
import com.jsp.user_module.model.Role;
import com.jsp.user_module.model.User;
import com.jsp.user_module.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponse register(UserRequest userRequest) {

        if (userRepository.existsByEmail(userRequest.getEmail())) {
            throw new UserException("Email already exists");
        }

        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setPhone(userRequest.getPhone());


        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));

        user.setRole(Role.CUSTOMER);
        user.setActive(true);

        User savedUser = userRepository.save(user);

        return new UserResponse(savedUser);
    }

    @Override
    public UserResponse login(LoginRequest login) {

        User user = userRepository.findByEmail(login.getEmail())
                .orElseThrow(() -> new UserException("Invalid email or password"));


        if (!passwordEncoder.matches(login.getPassword(), user.getPassword())) {
            throw new UserException("Invalid email or password");
        }

        return new UserResponse(user);
    }

    @Override
    public UserResponse profile(Integer id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserException("User not found with id: " + id));

        return new UserResponse(user);
    }

    @Override
    public void deleteUser(Integer id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserException("User not found with id: " + id));

        userRepository.delete(user);
    }

    @Override
    public UserResponse changePassword(String email, String oldPassword, String newPassword) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UserException("User not found"));

        if (!passwordEncoder.matches(oldPassword, user.getPassword())) {
            throw new UserException("Old password is incorrect");
        }

        user.setPassword(passwordEncoder.encode(newPassword));

        User updatedUser = userRepository.save(user);

        return new UserResponse(updatedUser);
    }
}