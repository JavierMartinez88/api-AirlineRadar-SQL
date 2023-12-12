package com.nttdata.AirlineRadar.api.controller.maper;

import com.nttdata.AirlineRadar.api.controller.rest.impl.model.FormRest;
import com.nttdata.AirlineRadar.dominio.model.Form;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFormMapper {

    Form mapToEntity (FormRest rest);

    FormRest mapToRest (Form entity);


}
