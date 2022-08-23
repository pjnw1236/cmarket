package com.example.cmarket.user;

// UserServiceImpl 클래스에서 구현
public interface UserService {
    void signup(User user);
    User findUser(Long userId);
}