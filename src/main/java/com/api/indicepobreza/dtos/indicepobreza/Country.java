package com.api.indicepobreza.dtos.indicepobreza;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter

public class Country {
    public String id;
    public String value;
}
