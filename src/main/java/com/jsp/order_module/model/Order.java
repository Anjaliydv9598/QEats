package com.jsp.order_module.model;

import com.jsp.restaurant_module.model.Restaurant;
import com.jsp.user_module.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrderItem> orderItems = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private OrderStatus status;  // PENDING, CONFIRMED, PREPARING, READY, DELIVERED, CANCELLED

    private LocalDateTime orderDateTime;
    private LocalDateTime estimatedDeliveryTime;
    private LocalDateTime deliveredDateTime;

    private Double totalAmount;
    private Double tax;
    private Double deliveryCharges;
    private Double discount;

    private String deliveryAddress;
    private String specialInstructions;
    private String paymentMethod;  // CASH, CARD, ONLINE

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;  // PENDING, COMPLETED, FAILED
}
