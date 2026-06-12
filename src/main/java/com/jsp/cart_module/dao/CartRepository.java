package com.jsp.cart_module.dao;

import com.jsp.cart_module.model.Cart;
import com.jsp.user_module.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser(User user);
}
