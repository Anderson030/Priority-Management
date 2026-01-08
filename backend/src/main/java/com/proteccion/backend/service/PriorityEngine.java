package com.proteccion.backend.service;

import com.proteccion.backend.model.Request;
import com.proteccion.backend.rule.PriorityRule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityEngine {

    private final List<PriorityRule> rules;

    public PriorityEngine(List<PriorityRule> rules) {
        this.rules = rules;
    }

    public int calculate(Request request) {
        int totalPriority = 0;

        for (PriorityRule rule : rules) {
            totalPriority += rule.apply(request);
        }

        return totalPriority;
    }
}
