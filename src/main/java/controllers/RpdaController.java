package controllers;

import domain_model.DataLoader;
import domain_model.Domain;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
//@RequestMapping("/rpda")
public class RpdaController {

//    @GetMapping("/domainObject")
//    public Domain getDomainObject(@PathVariable String msId) {
//        return DataLoader.getInstance().getDomainObject(msId);
//    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        System.out.println("Entry to PING...");
        return new ResponseEntity<String>("PONG", HttpStatus.OK);
    }

}
