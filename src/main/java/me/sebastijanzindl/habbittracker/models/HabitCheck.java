package me.sebastijanzindl.habbittracker.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "habit_checks")
public class HabitCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="check_date",nullable = false)
    private LocalDateTime checkDate;

    @Column(name = "is_checked", nullable = false)
    private Boolean isChecked;

    @ManyToOne
    @JoinColumn(name = "habit_id", nullable = false)
    private Habit habit;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
