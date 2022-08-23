package com.api.indicepobreza.dtos.paises;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Adminregion {
    public String id;
    public String iso2code;
    public String value;
}
