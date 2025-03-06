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
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArtwork;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_artwork_type")
    private ArtworkType fkIdArtworkType;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_artwork", referencedColumnName = "idArtwork")
    private List<Exhibition> fkIdExhibition;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_artwork", referencedColumnName = "idArtwork")
    private List<ImageFile> fkIdImageFile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_project")
    private Project fkIdProject;

    private Date date;
    
    private String description;

    private String location;

    private boolean sellable;

    private String technique;

    private String title;

    private double height;

    private double length;

    private double width;


}
