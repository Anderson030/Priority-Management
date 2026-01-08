package com.proteccion.backend.rule;

import com.proteccion.backend.model.Request;
import org.springframework.stereotype.Component;

@Component
public class ManualPriorityRule implements PriorityRule {

    @Override
    public int apply(Request request) {
        if (request.getManualPriority() != null) {
            return request.getManualPriority();
        }
        return 0;
    }
}
