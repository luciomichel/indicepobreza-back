package com.api.indicepobreza.dtos.paises;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Paise {
    public String id;
    public String iso2Code;
    public String name;
    public Region region;
    public Adminregion adminregion;
    public IncomeLevel incomeLevel;
    public LendingType lendingType;
    public String capitalCity;
    public String longitude;
    public String latitude;
}
