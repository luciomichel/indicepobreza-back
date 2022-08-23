package com.api.indicepobreza.dtos.paises;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Root {
    @JsonProperty("Paises")
    public ArrayList<Paise> paises;
}
