package com.example.cmarket.discount;

import com.example.cmarket.user.User;

// CurrentDiscountInfo 클래스에서 구현
public interface DiscountInfo {
    int discount(User user, int price);
}