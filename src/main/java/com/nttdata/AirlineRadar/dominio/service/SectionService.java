package com.nttdata.AirlineRadar.dominio.service;

import com.nttdata.AirlineRadar.dominio.model.SectionQuestionDomain;
import com.nttdata.AirlineRadar.dominio.ports.SectionPersistencePort;
import com.nttdata.AirlineRadar.dominio.usecase.SectionRetrievalUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SectionService implements SectionRetrievalUseCase {

    private final SectionPersistencePort sectionPersistencePort;

    @Override
    public Page<SectionQuestionDomain> retrieveQuestionsBySectionId(Long sectionId, Pageable pageable) throws Exception {

        Page<SectionQuestionDomain> page = sectionPersistencePort.retrieveQuestionsBySectionId(sectionId, pageable);

        return page;
    }
}
