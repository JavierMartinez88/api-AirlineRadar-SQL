package com.nttdata.AirlineRadar.infraestructure.repository;

import com.nttdata.AirlineRadar.infraestructure.FormEntity;
import com.nttdata.AirlineRadar.infraestructure.SectionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface FormRepository extends JpaRepository<FormEntity, Long> {

    @Query("SELECT s FROM SectionEntity s JOIN s.forms f WHERE f.formId = :formId")
    Page<SectionEntity> findSectionsByFormId(Long formId, Pageable pageable);


}
