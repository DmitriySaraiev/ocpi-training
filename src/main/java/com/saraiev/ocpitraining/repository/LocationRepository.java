package com.saraiev.ocpitraining.repository;

import com.saraiev.ocpitraining.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {
}
