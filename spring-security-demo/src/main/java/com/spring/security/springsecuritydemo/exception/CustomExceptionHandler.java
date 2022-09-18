package com.spring.security.springsecuritydemo.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    
    private static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Request Body validation
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CustomErrorTemplate> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex) {

        CustomErrorTemplate err = new CustomErrorTemplate();
        LocalDateTime currentTime = LocalDateTime.now();

        err.setDate(currentTime.format(format));
        err.setErrorMessage(ex.getBindingResult().getAllErrors().stream()
                                .map(e -> e.getDefaultMessage()).collect(Collectors.toList()));
        err.setErrorCode(HttpStatus.BAD_REQUEST.value());

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);

    }
}
