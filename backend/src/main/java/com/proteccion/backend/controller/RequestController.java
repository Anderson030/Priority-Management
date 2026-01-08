package com.proteccion.backend.controller;

import com.proteccion.backend.dto.RequestCreateDTO;
import com.proteccion.backend.model.Request;
import com.proteccion.backend.service.RequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
@CrossOrigin(origins = "*")
public class RequestController {

    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    public Request create(@RequestBody RequestCreateDTO dto) {

        Request request = new Request();
        request.setTitle(dto.getTitle());
        request.setType(dto.getType());
        request.setManualPriority(dto.getManualPriority());

        return requestService.create(request);
    }


    @GetMapping
    public List<Request> getAll() {
        return requestService.findAllOrderedByPriority();
    }
}
