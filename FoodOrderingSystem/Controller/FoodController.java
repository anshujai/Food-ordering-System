package com.example.FoodOrderingSystem.Controller;

import com.example.FoodOrderingSystem.Entity.MenuItem;
import com.example.FoodOrderingSystem.Entity.Order;
import com.example.FoodOrderingSystem.Entity.Restaurant;
import com.example.FoodOrderingSystem.Service.MenuService;
import com.example.FoodOrderingSystem.Service.OrderService;
import com.example.FoodOrderingSystem.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private OrderService orderService;

    @PostMapping("/customer")
    public void registerCustomer(@RequestParam String userId,
                                 @RequestParam String name) {
        registrationService.registerCustomer(userId, name);
    }

    @PostMapping("/restaurant")
    public void registerRestaurant(@RequestBody Restaurant restaurant) {
        registrationService.registerRestaurant(restaurant);
    }

    @PostMapping("/menu/{restaurant}")
    public void addMenuItem(@PathVariable String restaurant,
                            @RequestBody MenuItem item) {
        menuService.addMenuItem(restaurant, item);
    }

    @GetMapping("/menu/{restaurant}")
    public List<MenuItem> searchMenu(@PathVariable String restaurant) {
        return menuService.searchItems(restaurant);
    }

    @PostMapping("/order")
    public Order placeOrder(@RequestParam String userId,
                            @RequestParam String restaurant,
                            @RequestParam String item,
                            @RequestParam int quantity) {
        return orderService.placeOrder(userId, restaurant, item, quantity);
    }

    @GetMapping("/orders/{userId}")
    public List<Order> getOrders(@PathVariable String userId) {
        return orderService.getOrdersByUser(userId);
    }

    @DeleteMapping("/order/{orderId}")
    public void cancelOrder(@PathVariable String orderId) {
        orderService.cancelOrder(orderId);
    }
}
