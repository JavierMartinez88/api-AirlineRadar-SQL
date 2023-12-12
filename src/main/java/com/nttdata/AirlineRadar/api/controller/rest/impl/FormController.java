package com.nttdata.AirlineRadar.api.controller.rest.impl;

import com.nttdata.AirlineRadar.api.controller.FormControllerApi;
import com.nttdata.AirlineRadar.api.controller.maper.IFormMapper;
import com.nttdata.AirlineRadar.api.controller.maper.ISectionMapper;
import com.nttdata.AirlineRadar.api.controller.rest.impl.model.*;
import com.nttdata.AirlineRadar.dominio.model.Form;
import com.nttdata.AirlineRadar.dominio.model.Section;
import com.nttdata.AirlineRadar.dominio.usecase.FormRetrievalUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("${airline-radar.form.base}")
@RequiredArgsConstructor
public class FormController implements FormControllerApi {

    private final FormRetrievalUseCase formRetrievalUseCase;
    private final IFormMapper iFormMapper;
    private final ISectionMapper iSectionMapper;


    @Override
    @GetMapping("${airline-radar.form.retrieveForms}")
    public ResponseEntity<AirlineRadarResponsePageRestFormRest> retrieveForms(Long page, Long pageSize, final Pageable pageable) throws Exception {
        final Page<Form> formPage = formRetrievalUseCase.retrieveForms(pageable);

        Page<FormRest> formRestPage = formPage.map(form -> iFormMapper.mapToRest(form));

        AirlineRadarResponsePageRestFormRest responsePage = new AirlineRadarResponsePageRestFormRest();
        responsePage.setStatus(HttpStatus.OK.toString());
        responsePage.setCode(String.valueOf(HttpStatus.OK.value()));
        responsePage.setMessage("Ok");
        if (responsePage.getData() == null) {
            responsePage.setData(new PageRestFormRest());
        }
        responsePage.getData().setContent(formRestPage.getContent());


        return new ResponseEntity<>(responsePage,HttpStatus.OK);
    }

    @Override
    @GetMapping("${airline-radar.form.retrieveSectionsByFormId}")
    public ResponseEntity<AirlineRadarResponsePageRestSectionRest> retrieveSectionsByFormId(@PathVariable Long formId, Long page, Long pageSize, final Pageable pageable) throws Exception {
        final Page<Section> sectionPage = formRetrievalUseCase.retrieveSectionsByFormId(formId, pageable);

        Page<SectionRest> sectionRestPage = sectionPage.map(section -> iSectionMapper.mapToRest(section));

        AirlineRadarResponsePageRestSectionRest responsePage = new AirlineRadarResponsePageRestSectionRest();
        responsePage.setStatus(HttpStatus.OK.toString());
        responsePage.setCode(String.valueOf(HttpStatus.OK.value()));
        responsePage.setMessage("Ok");
        if (responsePage.getData() == null) {
            responsePage.setData(new PageRestSectionRest());
        }
        responsePage.getData().setContent(sectionRestPage.getContent());

        return new ResponseEntity<>(responsePage,HttpStatus.OK);
    }

    @Override
    @PostMapping("${airline-radar.form.createForm}")
    public ResponseEntity<FormRest> createForm(@RequestBody FormRest form) throws Exception {
       Form formController = iFormMapper.mapToEntity(form);
       final FormRest formRest = formRetrievalUseCase.createForm(formController);

        return new ResponseEntity<>(formRest, HttpStatus.CREATED);
    }
}
