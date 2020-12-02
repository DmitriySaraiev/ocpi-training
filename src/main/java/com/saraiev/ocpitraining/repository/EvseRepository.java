package com.saraiev.ocpitraining.repository;

import com.saraiev.ocpitraining.model.Evse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EvseRepository extends MongoRepository<Evse, String> {
}
