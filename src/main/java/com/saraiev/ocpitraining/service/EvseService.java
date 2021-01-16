package com.saraiev.ocpitraining.service;

import com.saraiev.ocpitraining.model.Evse;
import com.saraiev.ocpitraining.repository.EvseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EvseService implements OcpiService<String, Evse> {

    private final EvseRepository evseRepository;

    @Override
    public Evse get(String id) {
        Optional<Evse> byId = evseRepository.findById(id);
        return byId.orElse(null);
    }

    @Override
    public Evse create(Evse entity) {
        return evseRepository.save(entity);
    }

    @Override
    public Evse update(Evse entity) {
        return evseRepository.save(entity);
    }

    @Override
    public void delete(Evse entity) {
        evseRepository.delete(entity);
    }
}
