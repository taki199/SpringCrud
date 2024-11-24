package dev.houcine.runner.run;

import java.time.LocalDateTime;

public record Run(
        int id,
        String title,
        LocalDateTime startOn,
        LocalDateTime completedOn,
        int miles,
        Location location) {
}
