package me.sebastijanzindl.habbittracker.controller;

import me.sebastijanzindl.habbittracker.services.HabitService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabitController {
    private final HabitService habitService;

    public HabitController(final HabitService habitService) {
        this.habitService = habitService;
    }
}
