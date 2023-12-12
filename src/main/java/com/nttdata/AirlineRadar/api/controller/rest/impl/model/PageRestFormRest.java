package com.nttdata.AirlineRadar.api.controller.rest.impl.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageRestFormRest {

    @JsonProperty("content")
    private @Valid List<FormRest> content = null;

    @JsonProperty("page")
    private PaginationInfo page;


}
