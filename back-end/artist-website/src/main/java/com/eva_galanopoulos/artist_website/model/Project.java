package com.eva_galanopoulos.artist_website.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProject;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_image_file")
    private ImageFile fkIdImageFile;

    private String name;

}
