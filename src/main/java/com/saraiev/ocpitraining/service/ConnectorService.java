package com.saraiev.ocpitraining.service;

import com.saraiev.ocpitraining.repository.ConnectorRepository;
import org.springframework.stereotype.Service;

@Service
public class ConnectorService {

    private final ConnectorRepository connectorRepository;

    public ConnectorService(ConnectorRepository connectorRepository) {
        this.connectorRepository = connectorRepository;
    }
}
