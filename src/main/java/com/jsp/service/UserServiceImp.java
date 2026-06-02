package com.jsp.service;

import com.jsp.dto.LoginRequest;
import com.jsp.dto.UserRequest;
import com.jsp.dto.UserResponse;
import com.jsp.exception.UserException;
import com.jsp.model.Role;
import com.jsp.model.User;
import com.jsp.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse register(UserRequest userRequest) {

        if(userRepository.existsByEmail(userRequest.getEmail())){
            throw new UserException("Email already exists");
        }
        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setName(userRequest.getName());
        user.setPhone(userRequest.getPhone());
        user.setPassword(userRequest.getPassword());

        user.setRole(Role.CUSTOMER);

//        SAVE TO DATABASE
        User savedUser=userRepository.save(user);
//        STORE IN USER RESPONSE
        UserResponse response=new UserResponse(user);

        return response;

    }

    @Override
    public UserResponse login(LoginRequest login){
        return null;
    }

    @Override
    public UserResponse profile(String id){
        return null;
    }





















//    public UserService(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }
//
//    public List<User> getAllUsers(){
//        return userRepository.findAll();
//    }
//
//    public Optional<User> getUserById(Integer id) {
//        return userRepository.findById(id);
//    }

//    public User updateUser(Integer id,User updateUser){
//        return userRepository.findById(id).map(user->{
//            user.setName(updateUser.getName());
//            user.setEmail(updateUser.getEmail());
//            user.setPassword(updateUser.getPassword());
//            user.setRole(updateUser.getRole());
//            return userRepository.save(user);
//        }).orElseThrow(()->new RuntimeException("User not found"));
//    }
//
//    public void deleteUser(Integer id){
//        userRepository.deleteById(id);
//    }
//
////    to register
//    public User register(User user){
//        user.setRole("CUSTOMER");
//        return userRepository.save(user);
//    }
//
////    to login
//    public User login(String email , String password){
//        User user=userRepository.findByEmail(email).orElseThrow(()->new RuntimeException("Invalid email"));
//        if(!user.getPassword().equals(password)){
//            throw new RuntimeException("Invalid password");
//        }
//        return user;
//    }

}
