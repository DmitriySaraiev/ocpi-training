package com.saraiev.ocpitraining.service;

import com.saraiev.ocpitraining.model.OcpiEntity;

public interface OcpiService<P, T extends OcpiEntity<P>> {

    T get(P id);

    T create(T entity);

    T update(T entity);

    void delete(T entity);

}
