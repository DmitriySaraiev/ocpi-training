package com.saraiev.ocpitraining.service;

import com.saraiev.ocpitraining.model.Connector;
import com.saraiev.ocpitraining.repository.ConnectorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConnectorService implements OcpiService<String, Connector> {

    private final ConnectorRepository connectorRepository;

    @Override
    public Connector get(String id) {
        Optional<Connector> byId = connectorRepository.findById(id);
        return byId.orElse(null);
    }

    @Override
    public Connector create(Connector entity) {
        return connectorRepository.save(entity);
    }

    @Override
    public Connector update(Connector entity) {
        return connectorRepository.save(entity);
    }

    @Override
    public void delete(Connector entity) {
        connectorRepository.delete(entity);
    }
}
