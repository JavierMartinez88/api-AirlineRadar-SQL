package com.nttdata.AirlineRadar.infraestructure.service;

import com.nttdata.AirlineRadar.dominio.model.Form;
import com.nttdata.AirlineRadar.dominio.model.Section;
import com.nttdata.AirlineRadar.dominio.ports.FormPersistencePort;
import com.nttdata.AirlineRadar.infraestructure.FormEntity;
import com.nttdata.AirlineRadar.infraestructure.SectionEntity;
import com.nttdata.AirlineRadar.infraestructure.maper.IFormMaper;
import com.nttdata.AirlineRadar.infraestructure.maper.ISectionMaper;
import com.nttdata.AirlineRadar.infraestructure.repository.FormRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FormPersistenceService implements FormPersistencePort {

    private final FormRepository formRepository;
    private final IFormMaper iFormMaper;
    private final ISectionMaper iSectionMaper;

    @Override
    public Page<Form> retrieveForms(Pageable pageable) throws Exception {
         Page<FormEntity> page = formRepository.findAll(pageable);
         return page.map(iFormMaper::mapToDomain);
    }

    @Override
    public Page<Section> retrieveSectionsByFormId (Long formId, Pageable pageable) throws Exception{

        Page<SectionEntity> page = formRepository.findSectionsByFormId(formId,pageable);
        return page.map(iSectionMaper::mapToDomain);
    }


    @Override
    public Form createForm (Form form) throws Exception{
        FormEntity formEntity = iFormMaper.mapToEntity(form);
        FormEntity newFormEntity = formRepository.save(formEntity);

        return iFormMaper.mapToDomain(newFormEntity);
    }

}
