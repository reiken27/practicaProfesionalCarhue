package com.practica.profesional.practicaProfesionalCarhue.exceptions;

import java.time.LocalDateTime;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorDetails {
	private LocalDateTime timestamp;
	private String message;
	private String details;
}