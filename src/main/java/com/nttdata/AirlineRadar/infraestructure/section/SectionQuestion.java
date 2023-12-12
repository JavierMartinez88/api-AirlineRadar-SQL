package com.nttdata.AirlineRadar.infraestructure.section;


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
        private String questionId;

        @Column (name = "title")
        private String questionTitle;

        @Transient//Marcar campos que no deban ser persistidos
        private List<ResponseOption> responses = new ArrayList<>();


    }

