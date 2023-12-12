package com.nttdata.AirlineRadar.dominio.usecase;

import com.nttdata.AirlineRadar.dominio.model.Section;
import com.nttdata.AirlineRadar.dominio.model.SectionQuestionDomain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SectionRetrievalUseCase {

    public Page<SectionQuestionDomain> retrieveQuestionsBySectionId(Long sectionId, Pageable pageable) throws Exception;

}
