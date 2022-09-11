package com.mytube.mytube.user.service;

import com.mytube.mytube.user.dao.UserRepository;
import com.mytube.mytube.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void join(User user) {
        userRepository.save(user);
    }
}
