package com.saraiev.ocpitraining.service;

import com.saraiev.ocpitraining.model.Location;
import com.saraiev.ocpitraining.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LocationService implements OcpiService<String, Location>{

    private final LocationRepository locationRepository;

    @Override
    public Location get(String id) {
        Optional<Location> byId = locationRepository.findById(id);
        return byId.orElse(null);
    }

    @Override
    public Location create(Location entity) {
        return locationRepository.save(entity);
    }

    @Override
    public Location update(Location entity) {
        return locationRepository.save(entity);
    }

    @Override
    public void delete(Location entity) {
        locationRepository.delete(entity);
    }
}
