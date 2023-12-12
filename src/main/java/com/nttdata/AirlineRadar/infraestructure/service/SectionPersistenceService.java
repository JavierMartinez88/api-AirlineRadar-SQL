package com.nttdata.AirlineRadar.infraestructure.service;

import com.nttdata.AirlineRadar.dominio.model.Section;
import com.nttdata.AirlineRadar.dominio.model.SectionQuestionDomain;
import com.nttdata.AirlineRadar.dominio.ports.SectionPersistencePort;
import com.nttdata.AirlineRadar.infraestructure.maper.ISectionMaper;
import com.nttdata.AirlineRadar.infraestructure.maper.ISectionQuestionMaper;
import com.nttdata.AirlineRadar.infraestructure.repository.SectionRepository;
import com.nttdata.AirlineRadar.infraestructure.section.SectionQuestion;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SectionPersistenceService implements SectionPersistencePort {

    private final ISectionQuestionMaper iSectionQuestionMaper;
    private final SectionRepository sectionRepository;


    @Override
    public Page<SectionQuestionDomain> retrieveQuestionsBySectionId(Long sectionId, Pageable pageable) throws Exception {

        Page<SectionQuestion> page = sectionRepository.findSectionQuestionsBySectionId(sectionId, pageable);

        return page.map(iSectionQuestionMaper::mapToDomain);
    }
}
