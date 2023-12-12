package com.nttdata.AirlineRadar.dominio.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Section {

    private Integer sectionId;

    private String sectionTitle;

    private String description;
}
