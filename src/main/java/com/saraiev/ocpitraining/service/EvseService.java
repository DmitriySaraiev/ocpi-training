package com.saraiev.ocpitraining.service;

import com.saraiev.ocpitraining.repository.EvseRepository;
import org.springframework.stereotype.Service;

@Service
public class EvseService {

    private final EvseRepository evseRepository;

    public EvseService(EvseRepository evseRepository) {
        this.evseRepository = evseRepository;
    }
}
