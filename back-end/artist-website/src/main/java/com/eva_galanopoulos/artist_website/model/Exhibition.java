package com.eva_galanopoulos.artist_website.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Exhibition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExhibition;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_exhibition", referencedColumnName = "idExhibition")
    private List<ImageFile> fkIdImageFile;

    private boolean collaboration;
    
    private Date date;
    
    private String description;

    private String location;

    private String name;


}
