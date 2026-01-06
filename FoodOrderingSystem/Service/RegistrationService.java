package com.example.FoodOrderingSystem.Service;

import com.example.FoodOrderingSystem.Entity.Customer;
import com.example.FoodOrderingSystem.Entity.Restaurant;
import com.example.FoodOrderingSystem.Repository.DataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private DataStore dataStore;

    public void registerCustomer(String userId, String name) {
        dataStore.customers.put(userId, new Customer(userId, name));
    }

    public void registerRestaurant(Restaurant restaurant) {
        dataStore.restaurants.put(restaurant.getName(), restaurant);
    }
}
