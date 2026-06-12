package com.jsp.cart_module.dto;


import com.jsp.cart_module.model.CartItem;
import com.jsp.restaurant_module.model.Category;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartResponse {
    private Integer quantity;
    private Double price;
    private String foodName;
    private String description;
    private String imageUrl;
    @Enumerated(EnumType.STRING)
    private Category category;
    private double totalPrice;
    private List<CartItem> items;
}
