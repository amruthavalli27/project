package com.registration.registration.controller;

import com.registration.registration.exception.RegistrationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice

public class RegistrationNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(RegistrationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    Map<String, String> exceptionHnadler(RegistrationNotFoundException e) {

        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Error Message:", e.getMessage());
        return errorMap;
    }


}
