package com.nttdata.AirlineRadar.infraestructure.maper;

import com.nttdata.AirlineRadar.dominio.model.SectionQuestionDomain;
import com.nttdata.AirlineRadar.infraestructure.section.SectionQuestion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface ISectionQuestionMaper {

    SectionQuestion mapToEntity (SectionQuestionDomain section);

    SectionQuestionDomain mapToDomain (SectionQuestion sectionQuestion);

}
