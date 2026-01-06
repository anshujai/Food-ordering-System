package com.example.FoodOrderingSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Customer {
    private String userId;
    private String name;

    // constructor, getters
}

