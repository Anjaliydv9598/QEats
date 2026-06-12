package com.jsp.restaurant_module.service;


import com.jsp.restaurant_module.dto.RestaurantRequest;
import com.jsp.restaurant_module.dto.RestaurantResponse;

import java.util.List;

//findById
//findAll by loc
//findAll by name
//findAll
//update manager
public interface RestaurantService {
    RestaurantResponse createRestaurant(RestaurantRequest restaurantRequest);
    List<RestaurantResponse> getAllRestaurants();
    List<RestaurantResponse> getRestaurantsByLocation(String location);
    List<RestaurantResponse> getRestaurantsByName(String name);
    RestaurantResponse updateManager(Long restaurantId, Integer managerId);
    RestaurantResponse getRestaurantById(Long restaurantId);
}