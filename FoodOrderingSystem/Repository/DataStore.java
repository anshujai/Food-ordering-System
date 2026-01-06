package com.example.FoodOrderingSystem.Repository;

import com.example.FoodOrderingSystem.Entity.Customer;
import com.example.FoodOrderingSystem.Entity.Order;
import com.example.FoodOrderingSystem.Entity.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DataStore {

    public Map<String, Customer> customers = new HashMap<>();
    public Map<String, Restaurant> restaurants = new HashMap<>();
    public Map<String, Order> orders = new HashMap<>();
}

