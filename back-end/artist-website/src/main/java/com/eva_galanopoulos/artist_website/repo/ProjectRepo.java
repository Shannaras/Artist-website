package com.eva_galanopoulos.artist_website.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eva_galanopoulos.artist_website.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Long>{

}
