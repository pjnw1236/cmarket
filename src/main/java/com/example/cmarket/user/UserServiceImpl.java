package com.example.cmarket.user;

// UserService 인터페이스를 구현하는 클래스
public class UserServiceImpl implements UserService {

//    private final UserRepository userRepository = new UserRepositoryImpl();
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) { this.userRepository = userRepository; }

    @Override
    public void signup(User user) { userRepository.saveUser(user); }

    @Override
    public User findUser(Long userId) { return userRepository.findByUserId(userId); }
}