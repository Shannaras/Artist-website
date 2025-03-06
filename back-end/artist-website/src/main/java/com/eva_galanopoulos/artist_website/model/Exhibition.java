package com.eva_galanopoulos.artist_website.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Exhibition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exhibition;

    private String name;

    private Date date;

    private String location;

    private boolean collaboration;

    private String description;

}
