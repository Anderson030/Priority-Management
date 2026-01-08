package com.proteccion.backend.rule;

import com.proteccion.backend.model.Request;
import com.proteccion.backend.model.RequestType;
import org.springframework.stereotype.Component;

@Component
public class IncidentRule implements PriorityRule {

    @Override
    public int apply(Request request) {
        if (request.getType() == RequestType.INCIDENT) {
            return 50;
        }
        return 0;
    }
}
