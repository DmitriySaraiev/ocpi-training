package com.saraiev.ocpitraining.api.controller;

import com.saraiev.ocpitraining.model.Location;
import com.saraiev.ocpitraining.service.OcpiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor
public class LocationController {

    private final OcpiService<String, Location> ocpiService;

    @GetMapping
    public ResponseEntity<Location> get(@RequestParam String id) {
        return new ResponseEntity<>(ocpiService.get(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Location> create(Location location) {
        return new ResponseEntity<>(ocpiService.create(location), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Location> update(Location location) {
        return new ResponseEntity<>(ocpiService.update(location), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(Location location) {
        ocpiService.delete(location);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
