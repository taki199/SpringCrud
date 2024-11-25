package dev.houcine.runner.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        int id,
        @NotEmpty
        String title,
        LocalDateTime startOn,
        LocalDateTime completedOn,
        @Positive
        int miles,
        Location location
) {
    public Run{
        if(!completedOn.isAfter(startOn)){
            throw new IllegalArgumentException("completed must be after Started On");
        }
    }
}
