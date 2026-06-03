package com.jsp.resturant_module.service.impl;

import com.jsp.resturant_module.dto.ResturantRequest;
import com.jsp.resturant_module.model.Resturant;
import com.jsp.resturant_module.model.service.ResturantService;
import com.jsp.user_module.model.User;
import com.jsp.user_module.model.dao.UserRepository;
import com.jsp.user_module.model.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResturantServiceImpl implements ResturantService {
    private final UserRepository userRepository;

    @Override
    public Resturant createResturant(ResturantRequest resturantRequest) {

        Integer managerId=resturantRequest.getUser_id();

        User user==userRepository.findById(managerId)
                .orElseThrow(()->new UserException("user not found"));

        Resturant resturant=new Resturant();
        resturant.setResturantName(resturantRequest.getResturantName());
        resturant.setPhone(resturant.getPhone());
        resturant.setAddress(resturant.getAddress());
        resturant.setPincode(resturantRequest.getPincode());
        resturant.setImage(rseturant.getImage());


        resturant.setManager(user);
        user.setResturant(resturant);


//        resturant.Repository.save(resturant);         because using cascade

        userRepository.save(user);
        return resturant;
    }
}


//findBy id
//findbyall loc
//findall by name
//findall