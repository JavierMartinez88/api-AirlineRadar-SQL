package com.nttdata.AirlineRadar.dominio.usecase;

import com.nttdata.AirlineRadar.api.controller.rest.impl.model.FormRest;
import com.nttdata.AirlineRadar.dominio.model.Form;
import com.nttdata.AirlineRadar.dominio.model.Section;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FormRetrievalUseCase {

    public Page<Form> retrieveForms(Pageable pageable) throws Exception;

    public Page<Section> retrieveSectionsByFormId (Long id, Pageable pageable) throws Exception;

    public FormRest createForm (Form formInfra) throws Exception;

}
