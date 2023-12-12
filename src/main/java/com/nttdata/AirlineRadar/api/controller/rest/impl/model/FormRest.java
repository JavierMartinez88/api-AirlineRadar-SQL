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
public class FormRest {

    @JsonProperty("id")
    private Long formId;

    @JsonProperty("title")
    private String formTitle;


}
