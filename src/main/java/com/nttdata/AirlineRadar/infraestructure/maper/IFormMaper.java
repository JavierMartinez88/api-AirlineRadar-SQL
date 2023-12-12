package com.nttdata.AirlineRadar.infraestructure.maper;

import com.nttdata.AirlineRadar.dominio.model.Form;
import com.nttdata.AirlineRadar.infraestructure.FormEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IFormMaper {
    FormEntity mapToEntity (Form form);

    Form mapToDomain (FormEntity formEntity);



}
