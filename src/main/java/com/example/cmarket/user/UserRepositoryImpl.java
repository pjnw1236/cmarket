package com.example.cmarket.user;

import java.util.HashMap;
import java.util.Map;

// UserRepository 인터페이스를 구현하는 클래스
public class UserRepositoryImpl implements UserRepository {

    private static Map<Long, User> users = new HashMap<>();

    @Override
    public void saveUser(User user) { users.put(user.getId(), user); }

    @Override
    public User findByUserId(Long userId) { return users.get(userId); }
}
