package com.nttdata.AirlineRadar.api.controller.rest.impl.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionRest {

    @JsonProperty("id")
    private Integer sectionId;

    @JsonProperty("title")
    private String sectionTitle;

    @JsonProperty("description")
    private String description;

}
