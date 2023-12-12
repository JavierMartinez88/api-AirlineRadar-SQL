package com.nttdata.AirlineRadar.dominio.model;

import com.nttdata.AirlineRadar.infraestructure.SectionEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SectionQuestionDomain {

    private Long questionId;

    private String questionTitle;

    private SectionEntity section;

}
