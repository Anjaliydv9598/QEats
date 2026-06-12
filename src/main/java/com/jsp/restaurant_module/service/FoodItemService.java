package com.jsp.restaurant_module.service;


import com.jsp.restaurant_module.dto.FoodItemRequest;
import com.jsp.restaurant_module.dto.FoodItemResponse;

import java.util.List;

//findAllFoodByRestaurantId
//addFoodItem
//Update stock
public interface FoodItemService {
    FoodItemResponse addFoodItem(FoodItemRequest foodItemRequest);
    FoodItemResponse updateStock(Integer foodItemId, Integer newStock);
    List<FoodItemResponse> foodItemByRestaurantId(Long restaurantId);
}
