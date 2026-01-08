package com.proteccion.backend.dto;


import com.proteccion.backend.model.RequestType;
import lombok.Data;

@Data
public class RequestCreateDTO {
    private String title;
    private RequestType type;
    private Integer manualPriority;
}
