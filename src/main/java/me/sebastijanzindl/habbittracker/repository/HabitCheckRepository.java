package me.sebastijanzindl.habbittracker.repository;

import me.sebastijanzindl.habbittracker.models.HabitCheck;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HabitCheckRepository extends CrudRepository<HabitCheck, UUID> {
}
