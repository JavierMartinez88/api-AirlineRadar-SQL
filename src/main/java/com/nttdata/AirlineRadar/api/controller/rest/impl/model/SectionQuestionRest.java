package com.nttdata.AirlineRadar.api.controller.rest.impl.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nttdata.AirlineRadar.infraestructure.SectionEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionQuestionRest {

    @JsonProperty("id")
    private Long questionId;

    @JsonProperty("title")
    private String questionTitle;

    @JsonProperty("section")
    private SectionRest section;

}
