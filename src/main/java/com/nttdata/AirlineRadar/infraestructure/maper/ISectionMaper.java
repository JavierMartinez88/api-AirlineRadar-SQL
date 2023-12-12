package com.nttdata.AirlineRadar.infraestructure.maper;

import com.nttdata.AirlineRadar.dominio.model.Section;
import com.nttdata.AirlineRadar.infraestructure.SectionEntity;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring" )
public interface ISectionMaper {

    SectionEntity mapToEntity (Section section);

    Section mapToDomain (SectionEntity sectionEntity);

    List<Section> mapToDomain (List<SectionEntity> sectionEntity);
}
