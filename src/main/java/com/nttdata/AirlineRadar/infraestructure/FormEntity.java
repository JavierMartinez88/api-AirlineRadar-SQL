package com.nttdata.AirlineRadar.infraestructure;

import jakarta.persistence.*;
import lombok.*;




@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "form")
public class FormEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formId;

    @Column(name = "title")
    private String formTitle;

}
