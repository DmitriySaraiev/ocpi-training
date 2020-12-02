package com.saraiev.ocpitraining.repository;

import com.saraiev.ocpitraining.model.Connector;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConnectorRepository extends MongoRepository<Connector, String> {
}
