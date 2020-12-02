package com.saraiev.ocpitraining.api.controller;

import com.saraiev.ocpitraining.api.BaseApiResponse;
import com.saraiev.ocpitraining.api.CommonResponses;
import com.saraiev.ocpitraining.api.DataApiResponse;
import com.saraiev.ocpitraining.model.Connector;
import com.saraiev.ocpitraining.service.ConnectorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/connector")
public class ConnectorController {
    
    private final ConnectorService connectorService;

    public ConnectorController(ConnectorService connectorService) {
        this.connectorService = connectorService;
    }

    @GetMapping
    public DataApiResponse<Connector> get() {
        return new DataApiResponse<>(new Connector());
    }

    @PostMapping
    public DataApiResponse<Connector> create() {
        return new DataApiResponse<>(new Connector());
    }

    @PutMapping
    public DataApiResponse<Connector> update() {
        return new DataApiResponse<>(new Connector());
    }

    @DeleteMapping
    public BaseApiResponse delete() {
        return CommonResponses.successResponse();
    }
    
}
