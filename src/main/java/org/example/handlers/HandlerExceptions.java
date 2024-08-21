package org.example.handlers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class HandlerExceptions {
    @ExceptionHandler(IOException.class)
    public ResponseEntity<String> handleIoException(IOException exception) {
        String message = exception.getMessage();

        return new ResponseEntity<>(message, HttpStatus.BAD_GATEWAY);
    }
}
