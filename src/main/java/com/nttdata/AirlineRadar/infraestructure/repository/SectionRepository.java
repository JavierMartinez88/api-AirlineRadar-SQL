package com.nttdata.AirlineRadar.infraestructure.repository;

import com.nttdata.AirlineRadar.infraestructure.SectionEntity;
import com.nttdata.AirlineRadar.infraestructure.section.SectionQuestion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository <SectionEntity, Long> {

    @Query("SELECT s FROM SectionQuestion s JOIN s.section f WHERE f.sectionId = :sectionId")
    Page<SectionQuestion> findSectionQuestionsBySectionId (Long sectionId, Pageable pageable);
}
