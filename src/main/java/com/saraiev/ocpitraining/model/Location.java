package com.saraiev.ocpitraining.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.saraiev.ocpitraining.model.enums.Facility;
import com.saraiev.ocpitraining.model.enums.LocationType;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class Location {

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("party_id")
    private String partyId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private LocationType locationType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("city")
    private String city;

    @JsonProperty("postal_code")
    private String postalCode;

    @JsonProperty("state")
    private String state;

    @JsonProperty("country")
    private String country;

    @JsonProperty("related_locations")
    private Set<String> relatedLocations;

    @JsonProperty("evses")
    private Set<Evse> evses;

    @JsonProperty("directions")
    private Set<String> directions;

    @JsonProperty("operator")
    private String operator;

    @JsonProperty("suboperator")
    private String suboperator;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("facilities")
    private Set<Facility> facilities;

    @JsonProperty("time_zone")
    private String timeZone;

    @JsonProperty("opening_times")
    private String openingTimes;

    @JsonProperty("charging_when_closed")
    private Boolean chargingWhenClosed;

    @JsonProperty("images")
    private Set<String> images;

    @JsonProperty("energyMix")
    private String energyMix;

    @JsonProperty("last_updated")
    private Date lastUpdated;

}
