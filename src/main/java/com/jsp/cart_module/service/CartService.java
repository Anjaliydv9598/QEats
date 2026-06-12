package com.jsp.cart_module.service;


import com.jsp.cart_module.dto.CartRequest;
import com.jsp.cart_module.dto.CartResponse;

//createACart
//findByUserId
//addItemToCart
//Increase
//Decrease
public interface CartService {

    CartResponse createCart(CartRequest cartRequest);
    CartResponse findByUserId(Long userId);
    CartResponse addItemToCart(CartRequest cartRequest);
    CartResponse increaseItemQuantity(CartRequest cartRequest);
    CartResponse decreaseItemQuantity(CartRequest cartRequest);
}
