package me.sebastijanzindl.habbittracker.controller;

import me.sebastijanzindl.habbittracker.services.HabitCheckService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabitCheckController {
    private final HabitCheckService habitCheckService;

    public HabitCheckController(final HabitCheckService habitCheckService) {
        this.habitCheckService = habitCheckService;
    }
}
