package com.example.FoodOrderingSystem;

public class FlowOfTheProjectUnderstanding {
}
//✅ OPTION 1 (BEST for Machine Coding): Test via REST APIs
//
//Since you’re using Spring Boot, the fastest + cleanest way is to hit APIs.
//
//        1️⃣ Run the Application
//
//Make sure you have:
//
//@SpringBootApplication
//public class FoodOrderingSystemApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(FoodOrderingSystemApplication.class, args);
//    }
//}
//
//
//▶ Click Run in IntelliJ
//Server should start at:
//
//http://localhost:8080
//
//        2️⃣ Use Postman / IntelliJ HTTP Client / Curl
//
//I’ll give ready-to-use API calls.
//
//🧑 Register Customer
//
//POST
//
//http://localhost:8080/api/customer?userId=u1&name=Rahul
//
//
//Expected:
//
//        200 OK
//
//🏪 Register Restaurant
//
//POST
//
//http://localhost:8080/api/restaurant
//
//
//Body (JSON):
//
//        {
//        "name": "KFC",
//        "gstNumber": "GST123",
//        "email": "kfc@mail.com",
//        "phone": "9999999999"
//        }
//
//        🍽️ Add Menu Items
//
//        POST
//
//http://localhost:8080/api/menu/KFC
//
//
//Body:
//
//        {
//        "name": "Burger",
//        "price": 120,
//        "quantity": 10
//        }
//
//
//Add one more item:
//
//        {
//        "name": "Fries",
//        "price": 80,
//        "quantity": 20
//        }
//
//        🔍 Search Menu (Sorted by Price)
//
//GET
//
//http://localhost:8080/api/menu/KFC
//
//
//Expected Response:
//
//        [
//        {
//        "name": "Fries",
//        "price": 80,
//        "quantity": 20
//        },
//        {
//        "name": "Burger",
//        "price": 120,
//        "quantity": 10
//        }
//        ]
//
//
//        👉 Tell interviewer: “Search results are sorted by price as required.”
//
//        🛒 Place Order
//
//POST
//
//http://localhost:8080/api/order?userId=u1&restaurant=KFC&item=Burger&quantity=2
//
//
//Expected:
//
//        {
//        "orderId": "a1b2c3",
//        "userId": "u1",
//        "restaurantName": "KFC",
//        "itemName": "Burger",
//        "quantity": 2,
//        "status": "PLACED"
//        }
//
//        📄 Fetch Orders by User
//
//GET
//
//http://localhost:8080/api/orders/u1
//
//        ❌ Cancel Order (Bonus)
//
//DELETE
//
//http://localhost:8080/api/order/{orderId}
//
//
//Expected:
//
//status = CANCELLED
