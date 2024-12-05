package me.sebastijanzindl.habbittracker.controller;

import me.sebastijanzindl.habbittracker.services.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }
}
