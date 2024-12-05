package me.sebastijanzindl.habbittracker.services.impl;

import me.sebastijanzindl.habbittracker.repository.UserRepository;
import me.sebastijanzindl.habbittracker.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
