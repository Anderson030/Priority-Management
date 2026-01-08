package com.proteccion.backend.rule;

import com.proteccion.backend.model.Request;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class AgeRule implements PriorityRule {

    @Override
    public int apply(Request request) {
        if (request.getCreatedAt() == null) {
            return 0;
        }

        long hoursOld = Duration.between(
                request.getCreatedAt(),
                LocalDateTime.now()
        ).toHours();

        return (int) Math.min(hoursOld, 20);
    }
}
