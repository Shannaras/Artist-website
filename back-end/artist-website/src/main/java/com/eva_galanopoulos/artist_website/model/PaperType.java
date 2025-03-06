package com.eva_galanopoulos.artist_website.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PaperType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_PaperType; 

    private String name;

    private String grain;    

}
