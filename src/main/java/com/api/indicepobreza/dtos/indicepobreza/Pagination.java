package com.api.indicepobreza.dtos.indicepobreza;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Pagination {
    public int page;
    public int pages;
    public int per_page;
    public int total;
    public String sourceid;
    public String sourcename;
    public String lastupdated;
}
