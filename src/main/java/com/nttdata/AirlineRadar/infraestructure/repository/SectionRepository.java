package com.nttdata.AirlineRadar.infraestructure.repository;

import com.nttdata.AirlineRadar.infraestructure.SectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository <SectionEntity, Long> {



}
