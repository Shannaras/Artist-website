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
public class Edition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdition;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_edition", referencedColumnName = "idEdition")
    private List<ImageFile> fkIdImageFile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_paper_type")
    private PaperType fkIdPaperType;

    private Date date;
    
    private String description;

    private String location;

    private int pageNumber; 

    private boolean sellable;

    private String technique;

    private String title;

    private double height;

    private double length;

    private double width;

}
