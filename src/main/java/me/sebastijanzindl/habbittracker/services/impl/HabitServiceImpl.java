package me.sebastijanzindl.habbittracker.services.impl;

import me.sebastijanzindl.habbittracker.repository.HabitRepository;
import me.sebastijanzindl.habbittracker.services.HabitService;
import org.springframework.stereotype.Service;

@Service
public class HabitServiceImpl implements HabitService {
    private final HabitRepository habitRepository;

    public HabitServiceImpl(final HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }
}
