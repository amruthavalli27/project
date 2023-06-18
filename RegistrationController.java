package com.registration.registration.controller;

import com.registration.registration.exception.RegistrationNotFoundException;
import com.registration.registration.model.Registration;
import com.registration.registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.server.servlet.OAuth2AuthorizationServerProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationRepository registrationRepository;
    @PostMapping("/addregistration")
    Registration newregistration (@RequestBody Registration newRegistration){
        return registrationRepository.save(newRegistration);
    }
    @GetMapping("/getRegistration")
    List<Registration>getRegistration(){return registrationRepository.findAll();}
    @PutMapping("/update/{id}")
    Registration updateRegistration(@RequestBody Registration newRegistration,@PathVariable Long id){
        return registrationRepository.findById(id).map(registration -> {
            registration.setFlightname(newRegistration.getFlightname());
            registration.setSeatsavailable(newRegistration.getSeatsavailable());
            registration.setArrival(newRegistration.getArrival());
            registration.setDeparture(newRegistration.getDeparture());
            registration.setPrice(newRegistration.getPrice());
            return registrationRepository.save(registration);
        }).orElseThrow(() -> new RegistrationNotFoundException(id));
    }
    @DeleteMapping("/delete/{id}")
    String deleteRegistration(@PathVariable long id) {
        if (!registrationRepository.existsById(id)) {
            throw new RegistrationNotFoundException(id);
        }
        registrationRepository.deleteById(id);
        return "Registration with id"+id+"has been deleted";
    }
}
