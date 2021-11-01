package com.waterportabilitydataconsumer.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TransformerModel implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @JsonProperty("DateTime")
    private Long dateTime;
    @JsonProperty("Global_active_power")
    private Float global_active_power;
    @JsonProperty("Global_reactive_power")
    private Float global_reactive_power;
    @JsonProperty("Voltage")
    private Float voltage;
    @JsonProperty("Global_intensity")
    private Float global_intensity;
    @JsonProperty("Sub_metering_1")
    private Integer sub_metering_1;
    @JsonProperty("Sub_metering_2")
    private Integer sub_metering_2;
    @JsonProperty("Sub_metering_3")
    private Integer sub_metering_3;
    @JsonProperty("Temperature")
    private Double temperature;
}
