package com.rpadaApp.controllers;

import com.rpadaApp.domain_model.DataLoader;
import com.rpadaApp.domain_model.Domain;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
//@RequestMapping("/rpda")
public class RpdaController {

    @GetMapping("/domainObject")
    public ResponseEntity<Domain> getDomainObject(@PathVariable String msId) {
        Domain obj= DataLoader.getInstance().getDomainObject(msId);
        return new ResponseEntity<Domain>(obj, HttpStatus.OK);
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        System.out.println("Entry to PING...");
        return new ResponseEntity<String>("PONG", HttpStatus.OK);
    }

}
