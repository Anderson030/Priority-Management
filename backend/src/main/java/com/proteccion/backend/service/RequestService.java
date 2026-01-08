package com.proteccion.backend.service;

import com.proteccion.backend.model.Request;
import com.proteccion.backend.repository.RequestRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RequestService {

    private final RequestRepository requestRepository;
    private final PriorityEngine priorityEngine;

    public RequestService(RequestRepository requestRepository, PriorityEngine priorityEngine) {
        this.requestRepository = requestRepository;
        this.priorityEngine = priorityEngine;
    }

    public Request create(Request request) {
        request.setCreatedAt(LocalDateTime.now());

        int priority = priorityEngine.calculate(request);
        request.setCalculatedPriority(priority);

        return requestRepository.save(request);
    }


    public List<Request> findAllOrderedByPriority() {
        return requestRepository.findAll(
                Sort.by(Sort.Direction.DESC, "calculatedPriority")
        );
    }
}
