package com.saraiev.ocpitraining.api.controller;

import com.saraiev.ocpitraining.api.BaseApiResponse;
import com.saraiev.ocpitraining.api.CommonResponses;
import com.saraiev.ocpitraining.api.DataApiResponse;
import com.saraiev.ocpitraining.model.Evse;
import com.saraiev.ocpitraining.service.EvseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evse")
public class EvseController {
    
    private final EvseService evseService;

    public EvseController(EvseService evseService) {
        this.evseService = evseService;
    }

    @GetMapping
    public DataApiResponse<Evse> get() {
        return new DataApiResponse<>(new Evse());
    }

    @PostMapping
    public DataApiResponse<Evse> create() {
        return new DataApiResponse<>(new Evse());
    }

    @PutMapping
    public DataApiResponse<Evse> update() {
        return new DataApiResponse<>(new Evse());
    }

    @DeleteMapping
    public BaseApiResponse delete() {
        return CommonResponses.successResponse();
    }
}
