package com.nttdata.AirlineRadar.api.controller.rest.impl;

import com.nttdata.AirlineRadar.api.controller.SectionControllerApi;
import com.nttdata.AirlineRadar.api.controller.maper.ISectionMapper;
import com.nttdata.AirlineRadar.api.controller.rest.impl.model.*;
import com.nttdata.AirlineRadar.dominio.model.SectionQuestionDomain;
import com.nttdata.AirlineRadar.dominio.usecase.SectionRetrievalUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${airline-radar.section.base}")
@RequiredArgsConstructor
public class SectionController implements SectionControllerApi {

    private final SectionRetrievalUseCase sectionRetrievalUseCase;
    private final ISectionMapper iSectionMapper;

    @Override
    @GetMapping("${airline-radar.section.retrieveQuestionsBySectionId}")
    public ResponseEntity<AirlineRadarResponsePageRestSectionQuestionRest> retrieveQuestionsBySectionId(Long sectionId, Long page, Long pageSize, Pageable pageable) throws Exception {

        final Page<SectionQuestionDomain> sectionQuestionPage = sectionRetrievalUseCase.retrieveQuestionsBySectionId(sectionId,pageable);

        Page<SectionQuestionRest> sectionRestPage = sectionQuestionPage.map(sectionQuestionDomain -> iSectionMapper.mapToRestPost(sectionQuestionDomain));

        AirlineRadarResponsePageRestSectionQuestionRest responsePage = new AirlineRadarResponsePageRestSectionQuestionRest();
        responsePage.setStatus(HttpStatus.OK.toString());
        responsePage.setCode(String.valueOf(HttpStatus.OK.value()));
        responsePage.setMessage("Ok");
        if (responsePage.getData() == null) {
            responsePage.setData(new PageRestSectionQuestion());
        }
        responsePage.getData().setContent(sectionRestPage.getContent());


        return new ResponseEntity<>(responsePage,HttpStatus.OK);
    }
}
