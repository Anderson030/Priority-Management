package com.proteccion.backend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Enumerated (EnumType.STRING)
    private RequestType type;

    private Integer manualPriority;
    private LocalDateTime createdAt;
    private Integer calculatedPriority;





}
