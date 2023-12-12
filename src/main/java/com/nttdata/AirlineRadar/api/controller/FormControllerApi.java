package com.nttdata.AirlineRadar.api.controller;

import com.nttdata.AirlineRadar.api.controller.rest.impl.model.AirlineRadarResponsePageRestFormRest;
import com.nttdata.AirlineRadar.api.controller.rest.impl.model.AirlineRadarResponsePageRestSectionRest;
import com.nttdata.AirlineRadar.api.controller.rest.impl.model.FormRest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface FormControllerApi {

   public ResponseEntity<AirlineRadarResponsePageRestFormRest> retrieveForms (final Long page, final Long pageSize, final Pageable pageable) throws Exception;

   public ResponseEntity<AirlineRadarResponsePageRestSectionRest> retrieveSectionsByFormId (@PathVariable Long formId, Long page, Long pageSize, final Pageable pageable) throws Exception;

   public ResponseEntity<FormRest> createForm (@RequestBody FormRest rest) throws Exception;


}
