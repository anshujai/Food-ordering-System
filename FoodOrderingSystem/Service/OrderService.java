package com.example.FoodOrderingSystem.Service;

import com.example.FoodOrderingSystem.Entity.MenuItem;
import com.example.FoodOrderingSystem.Entity.Order;
import com.example.FoodOrderingSystem.Entity.Restaurant;
import com.example.FoodOrderingSystem.Repository.DataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private DataStore dataStore;

    public Order placeOrder(String userId, String restaurantName,
                            String itemName, int quantity) {

        Restaurant restaurant = dataStore.restaurants.get(restaurantName);
        MenuItem item = restaurant.getMenu().get(itemName);

        if (item.getQuantity() < quantity) {
            throw new RuntimeException("Insufficient quantity");
        }

        item.setQuantity(item.getQuantity() - quantity);

        Order order = new Order(
                UUID.randomUUID().toString(),
                userId,
                restaurantName,
                itemName,
                quantity,
                "PLACED"
        );

        dataStore.orders.put(order.getOrderId(), order);
        return order;
    }

    public List<Order> getOrdersByUser(String userId) {
        return dataStore.orders.values()
                .stream()
                .filter(o -> o.getUserId().equals(userId))
                .toList();
    }

    public void cancelOrder(String orderId) {
        Order order = dataStore.orders.get(orderId);
        order.setStatus("CANCELLED");
    }
}

