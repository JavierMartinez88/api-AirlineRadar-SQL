package com.nttdata.AirlineRadar.infraestructure;

import com.nttdata.AirlineRadar.infraestructure.section.SectionQuestion;
import lombok.*;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "section")
public class SectionEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String sectionId;

    @Column(name = "title")
    private String sectionTitle;

    @ManyToMany(cascade = CascadeType.MERGE, fetch =  FetchType.LAZY)
    @JoinTable(name ="rel_section_form", joinColumns =  {
            @JoinColumn(name = "sectionId", referencedColumnName =  "id") }, inverseJoinColumns = {
            @JoinColumn(name = "formId", referencedColumnName = "id")} )
    private Set<FormEntity> forms;

    @Transient
    private List<SectionQuestion> questions = new ArrayList<>();

}
