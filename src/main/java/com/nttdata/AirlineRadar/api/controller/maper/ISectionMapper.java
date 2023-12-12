package com.nttdata.AirlineRadar.api.controller.maper;

import com.nttdata.AirlineRadar.api.controller.rest.impl.model.SectionQuestionRest;
import com.nttdata.AirlineRadar.api.controller.rest.impl.model.SectionRest;
import com.nttdata.AirlineRadar.dominio.model.Section;
import com.nttdata.AirlineRadar.dominio.model.SectionQuestionDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISectionMapper {

    Section mapToEntity (SectionRest rest);

    SectionRest mapToRest (Section entity);

    SectionQuestionRest mapToRestPost (SectionQuestionDomain sectionQuestionDomain);

    List<Section> mapToDomain (List<SectionRest> sectionRest);

}
