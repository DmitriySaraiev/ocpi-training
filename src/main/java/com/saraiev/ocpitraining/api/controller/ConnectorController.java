package com.saraiev.ocpitraining.api.controller;

import com.saraiev.ocpitraining.model.Connector;
import com.saraiev.ocpitraining.service.OcpiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/connector")
@RequiredArgsConstructor
public class ConnectorController {

    private final OcpiService<String, Connector> ocpiService;

    @GetMapping
    public ResponseEntity<Connector> get(@RequestParam String id) {
        return new ResponseEntity<>(ocpiService.get(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Connector> create(Connector connector) {
        return new ResponseEntity<>(ocpiService.create(connector), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Connector> update(Connector connector) {
        return new ResponseEntity<>(ocpiService.update(connector), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(Connector connector) {
        ocpiService.delete(connector);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
