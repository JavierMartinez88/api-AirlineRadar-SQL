package com.nttdata.AirlineRadar.dominio.service;


import com.nttdata.AirlineRadar.api.controller.maper.IFormMapper;
import com.nttdata.AirlineRadar.api.controller.rest.impl.model.FormRest;
import com.nttdata.AirlineRadar.dominio.model.Form;
import com.nttdata.AirlineRadar.dominio.model.Section;
import com.nttdata.AirlineRadar.dominio.ports.FormPersistencePort;
import com.nttdata.AirlineRadar.dominio.usecase.FormRetrievalUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class FormService implements FormRetrievalUseCase {

  private final FormPersistencePort formPersistencePort;
  private final IFormMapper iFormMapper;

    @Override
    public Page<Form> retrieveForms(Pageable pageable) throws Exception {
    Page<Form> page = formPersistencePort.retrieveForms(pageable);

    return page;
    }

  @Override
  public Page<Section> retrieveSectionsByFormId(Long formId, Pageable pageable) throws Exception {

    Page<Section> page = formPersistencePort.retrieveSectionsByFormId(formId, pageable);

      return page;
  }

  @Override
  public FormRest createForm (Form formInfra) throws Exception{
   Form form = formPersistencePort.createForm(formInfra);
   FormRest newForm = iFormMapper.mapToRest(form);

   return newForm;
  }


}
