package com.example.FoodOrderingSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
    private String name;
    private double price;
    private int quantity;

    // constructor, getters, setters
}

