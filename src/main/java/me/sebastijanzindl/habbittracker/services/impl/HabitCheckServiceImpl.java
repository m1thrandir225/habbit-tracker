package me.sebastijanzindl.habbittracker.services.impl;

import me.sebastijanzindl.habbittracker.repository.HabitCheckRepository;
import me.sebastijanzindl.habbittracker.services.HabitCheckService;
import org.springframework.stereotype.Service;

@Service
public class HabitCheckServiceImpl implements HabitCheckService {
    private final HabitCheckRepository habitCheckRepository;

    public HabitCheckServiceImpl(final HabitCheckRepository habitCheckRepository) {
        this.habitCheckRepository = habitCheckRepository;
    }
}
