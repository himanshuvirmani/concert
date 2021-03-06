package com.concert.web.rest.errors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestErrorHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestErrorHandler.class);

    @ExceptionHandler(AggregateNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handleTodoNotFoundException(AggregateNotFoundException ex) {
        LOGGER.debug(ex.getMessage());
    }
}


