package com.api.indicepobreza.dtos.indicepobreza;

import com.api.indicepobreza.dtos.indicepobreza.Indicatores;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Root {
    @JsonProperty("Indicadores")
    public ArrayList<Indicatores> indicatores;
}
