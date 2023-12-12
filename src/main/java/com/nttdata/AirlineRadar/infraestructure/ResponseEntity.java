package com.nttdata.AirlineRadar.infraestructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ResponseEntity {


    private String userId;


    private String formId;


    private String sectionId;


    private String questionId;


    private String responseId;


}
