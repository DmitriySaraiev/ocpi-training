package com.saraiev.ocpitraining.api.controller;

import com.saraiev.ocpitraining.model.Evse;
import com.saraiev.ocpitraining.service.OcpiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evse")
@RequiredArgsConstructor
public class EvseController {

    private final OcpiService<String, Evse> ocpiService;

    @GetMapping
    public ResponseEntity<Evse> get(@RequestParam String id) {
        return new ResponseEntity<>(ocpiService.get(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Evse> create(Evse evse) {
        return new ResponseEntity<>(ocpiService.create(evse), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Evse> update(Evse evse) {
        return new ResponseEntity<>(ocpiService.update(evse), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(Evse evse) {
        ocpiService.delete(evse);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
