package com.example.FoodOrderingSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private String name;
    private String gstNumber;
    private String email;
    private String phone;
    private Map<String, MenuItem> menu = new HashMap<>();

    // constructor, getters
}

