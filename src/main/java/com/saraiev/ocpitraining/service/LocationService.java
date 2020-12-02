package com.saraiev.ocpitraining.service;

import com.saraiev.ocpitraining.repository.LocationRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }
}
