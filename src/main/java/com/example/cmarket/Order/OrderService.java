package com.example.cmarket.Order;

// OrderServiceImpl 클래스에서 구현
public interface OrderService {
    Order createOrder(Long userId, String itemName, int itemPrice);
}