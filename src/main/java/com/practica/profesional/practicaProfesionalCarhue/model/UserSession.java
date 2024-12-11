package com.practica.profesional.practicaProfesionalCarhue.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sessionId;

    @Column(unique = true)
    private String token;

    @Column(unique = true)
    private Integer userId;

    private String userType;

    private LocalDateTime sessionStartTime;

    private LocalDateTime sessionEndTime;
}
