package me.sebastijanzindl.habbittracker.repository;

import me.sebastijanzindl.habbittracker.models.Habit;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HabitRepository extends CrudRepository<Habit, UUID> {
}
