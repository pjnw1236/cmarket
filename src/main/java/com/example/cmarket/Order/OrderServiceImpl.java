package com.example.cmarket.Order;

import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.discount.DiscountInfo;
import com.example.cmarket.discount.RateDiscountInfo;
import com.example.cmarket.user.User;
import com.example.cmarket.user.UserRepository;
import com.example.cmarket.user.UserRepositoryImpl;

// OrderService 인터페이스를 구현하는 클래스
public class OrderServiceImpl implements OrderService {

//    private final UserRepository userRepository = new UserRepositoryImpl();
//    private final DiscountInfo discountInfo = new CurrentDiscountInfo();
//    private final DiscountInfo discountInfo = new RateDiscountInfo();

    private final UserRepository userRepository;
    private final DiscountInfo discountInfo;

    public OrderServiceImpl(UserRepository userRepository, DiscountInfo discountInfo) {
        this.userRepository = userRepository;
        this.discountInfo = discountInfo;
    }

    @Override
    public Order createOrder(Long userId, String itemName, int itemPrice) {
        User user = userRepository.findByUserId(userId);
        int discountPrice = discountInfo.discount(user, itemPrice);

        return new Order(userId, itemName, itemPrice, discountPrice);
    }
}