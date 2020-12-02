package com.saraiev.ocpitraining.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.saraiev.ocpitraining.model.enums.Capability;
import com.saraiev.ocpitraining.model.enums.Status;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class Evse {

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("evse_id")
    private String evse_id;

    @JsonProperty("status")
    private Status status;

    @JsonProperty("status_schedule")
    private Set<String> statusSchedule;

    @JsonProperty("capabilities")
    private Set<Capability> capabilities;

    @JsonProperty("connectors")
    private Set<Connector> connectors;

    @JsonProperty("floor_level")
    private String floorLevel;

    @JsonProperty("coordinates")
    private String coordinates;

    @JsonProperty("physical_reference")
    private String physicalReference;

    @JsonProperty("directions")
    private Set<String> directions;

    @JsonProperty("parking_restrictions")
    private Set<String> parkingRestrictions;

    @JsonProperty("images")
    private Set<String> images;

    @JsonProperty("last_updated")
    private Date lastUpdated;
}
