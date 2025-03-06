package com.eva_galanopoulos.artist_website.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eva_galanopoulos.artist_website.model.Edition;

public interface EditionRepo extends JpaRepository<Edition, Long>{

}
