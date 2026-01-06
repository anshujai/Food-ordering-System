package com.example.FoodOrderingSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String userId;
    private String restaurantName;
    private String itemName;
    private int quantity;
    private String status; // PLACED, CANCELLED

    // constructor, getters, setters
}

