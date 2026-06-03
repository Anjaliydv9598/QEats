package com.jsp.resturant_module.model.service;


import com.jsp.resturant_module.model.Resturant;
import com.jsp.resturant_module.dto.ResturantRequest;
import org.springframework.stereotype.Service;

@Service
public interface ResturantService {

    Resturant createResturant(ResturantRequest resturantRequest);

}
