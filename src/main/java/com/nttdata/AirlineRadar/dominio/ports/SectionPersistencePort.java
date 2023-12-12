package com.nttdata.AirlineRadar.dominio.ports;


import com.nttdata.AirlineRadar.dominio.model.SectionQuestionDomain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SectionPersistencePort {

    public Page<SectionQuestionDomain> retrieveQuestionsBySectionId (Long sectionId, Pageable pageable) throws Exception;

}
