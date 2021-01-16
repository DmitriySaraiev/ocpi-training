package com.saraiev.ocpitraining.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.saraiev.ocpitraining.model.enums.ConnectorFormat;
import com.saraiev.ocpitraining.model.enums.ConnectorType;
import com.saraiev.ocpitraining.model.enums.PowerType;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Builder
public class Connector implements OcpiEntity<String>{

    @JsonProperty("id")
    private String id;

    @JsonProperty("standard")
    private ConnectorType standard;

    @JsonProperty("format")
    private ConnectorFormat format;

    @JsonProperty("power_type")
    private PowerType powerType;

    @JsonProperty("max_voltage")
    private Integer maxVoltage;

    @JsonProperty("max_amperage")
    private Integer maxAmperage;

    @JsonProperty("max_electric_power")
    private Integer maxElectricPower;

    @JsonProperty("tariff_ids")
    private Set<String> tariffIds;

    @JsonProperty("terms_and_conditions")
    private String termsAndConditions;

    @JsonProperty("last_updated")
    private Date lastUpdated;

    @Override
    public String getId() {
        return id;
    }

}
