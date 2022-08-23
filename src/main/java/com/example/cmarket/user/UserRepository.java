package com.example.cmarket.user;

// UserRepositoryImpl 클래스에서 구현
public interface UserRepository {
    void saveUser(User user);
    User findByUserId(Long userId);
}