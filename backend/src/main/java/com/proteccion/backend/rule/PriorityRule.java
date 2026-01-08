package com.proteccion.backend.rule;

import com.proteccion.backend.model.Request;

public interface PriorityRule {

    int apply(Request request);

}
