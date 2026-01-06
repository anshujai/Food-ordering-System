package com.example.FoodOrderingSystem.Service;

import com.example.FoodOrderingSystem.Entity.MenuItem;
import com.example.FoodOrderingSystem.Entity.Restaurant;
import com.example.FoodOrderingSystem.Repository.DataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private DataStore dataStore;

    public void addMenuItem(String restaurantName, MenuItem item) {
        Restaurant restaurant = dataStore.restaurants.get(restaurantName);
        if (restaurant == null) {
            throw new RuntimeException("Restaurant not found: " + restaurantName);
        }
        restaurant.getMenu().put(item.getName(), item);
    }


    public List<MenuItem> searchItems(String restaurantName) {
        return dataStore.restaurants.get(restaurantName)
                .getMenu()
                .values()
                .stream()
                .sorted(Comparator.comparingDouble(MenuItem::getPrice))
                .toList();
    }
}
