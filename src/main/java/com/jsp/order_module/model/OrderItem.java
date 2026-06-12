package com.jsp.order_module.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jsp.restaurant_module.model.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Order order;

    private Long foodItemId;
    private String foodName;
    private Integer quantity;
    private Double price;  // Price per unit
    private Double totalPrice;  // Quantity * Price

    private String description;
    @Enumerated(EnumType.STRING)
    private Category catogry;
    private String imageUrl;
}







