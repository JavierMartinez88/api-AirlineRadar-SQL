package com.nttdata.AirlineRadar.dominio.ports;

import com.nttdata.AirlineRadar.dominio.model.Form;
import com.nttdata.AirlineRadar.dominio.model.Section;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FormPersistencePort {

    public Page<Form> retrieveForms (Pageable pageable) throws Exception;

    public Page<Section> retrieveSectionsByFormId (Long formId, Pageable pageable) throws Exception;

    public Form createForm (Form form) throws Exception;

}
