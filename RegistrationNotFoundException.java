package com.registration.registration.exception;
public class RegistrationNotFoundException extends RuntimeException {
    public RegistrationNotFoundException(Long id) {super("the name does not exist:"+id);}
}