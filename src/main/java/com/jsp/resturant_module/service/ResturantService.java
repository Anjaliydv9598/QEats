package com.jsp.resturant_module.service;

import com.jsp.resturant_module.dto.ResturantRequest;
import com.jsp.user_module.model.dto.LoginRequest;
import com.jsp.user_module.model.dto.UserRequest;
import com.jsp.user_module.model.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface ResturantService {

    ResturantResponse createResturant(ResturantRequest resturantRequest);
    ResturantResponse getResturantById(Integer id);
    ResturantResponse updateResturant(Integer id, ResturantRequest resturantRequest);
    void deleteResturant(Integer id);



}
