package com.rpadaApp.controllers;

import com.rpadaApp.domain_model.DataLoader;
import com.rpadaApp.domain_model.Domain;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/rpda")
public class RpdaController {

    //URL : http://localhost:8081/rpda/9EfnEpevW2KN9uuH5Cj5
    //dZZN6Gjn8sjPa6JTFDrf
    //URL format = http://localhost:8081/rpda/{EntityId}

    @GetMapping(path="/{msId}")
    public ResponseEntity<Domain> getDomainObject(@PathVariable("msId") String msId) {
        Domain obj= DataLoader.getInstance().getDomainObject(msId);
        return new ResponseEntity<Domain>(obj, HttpStatus.OK);
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        System.out.println("Entry to PING...");
        return new ResponseEntity<String>("PONG", HttpStatus.OK);
    }

}
