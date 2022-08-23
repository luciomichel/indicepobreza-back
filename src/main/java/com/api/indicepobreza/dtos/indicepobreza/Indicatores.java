package com.api.indicepobreza.dtos.indicepobreza;

import com.api.indicepobreza.dtos.indicepobreza.Country;
import com.api.indicepobreza.dtos.indicepobreza.Indicator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Indicatores {
    public Indicator indicator;
    public Country country;
    public String countryiso3code;
    public String date;
    public double value;
    public String unit;
    public String obs_status;
    public int decimal;
}
