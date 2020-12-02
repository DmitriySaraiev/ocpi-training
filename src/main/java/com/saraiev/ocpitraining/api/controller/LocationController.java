package com.saraiev.ocpitraining.api.controller;

import com.saraiev.ocpitraining.api.BaseApiResponse;
import com.saraiev.ocpitraining.api.CommonResponses;
import com.saraiev.ocpitraining.api.DataApiResponse;
import com.saraiev.ocpitraining.model.Location;
import com.saraiev.ocpitraining.service.LocationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public DataApiResponse<Location> get() {
        return new DataApiResponse<>(new Location());
    }

    @PostMapping
    public DataApiResponse<Location> create() {
        return new DataApiResponse<>(new Location());
    }

    @PutMapping
    public DataApiResponse<Location> update() {
        return new DataApiResponse<>(new Location());
    }

    @DeleteMapping
    public BaseApiResponse delete() {
        return CommonResponses.successResponse();
    }

}
