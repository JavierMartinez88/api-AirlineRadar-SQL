package com.nttdata.AirlineRadar.api.controller;

import com.nttdata.AirlineRadar.api.controller.rest.impl.model.AirlineRadarResponsePageRestSectionQuestionRest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface SectionControllerApi {

    public ResponseEntity<AirlineRadarResponsePageRestSectionQuestionRest> retrieveQuestionsBySectionId (@PathVariable Long sectionId, Long page, Long pageSize, final Pageable pageable) throws Exception;

}
