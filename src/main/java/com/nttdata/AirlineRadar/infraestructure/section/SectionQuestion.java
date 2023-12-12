package com.nttdata.AirlineRadar.infraestructure.section;


import com.nttdata.AirlineRadar.infraestructure.SectionEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Builder
    @Entity
    @Table(name = "sectionquestion")
    public class SectionQuestion {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long questionId;

        @Column (name = "title")
        private String questionTitle;

        @ManyToOne
        @JoinColumn(name = "section_id")
        private SectionEntity section;

        @Transient//Marcar campos que no deban ser persistidos
        private List<ResponseOption> responses = new ArrayList<>();


    }

