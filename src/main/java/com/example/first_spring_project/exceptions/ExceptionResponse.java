package com.example.first_spring_project.exceptions;

import java.io.Serializable;
import java.util.Date;

public record ExceptionResponse(
        Date timestamp,
        String message,
        String details) implements Serializable {
}
