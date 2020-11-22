package com.saleem.flow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saleem.flow.model.app;

@CrossOrigin(origins = "*", maxAge = 3600)
@RepositoryRestResource(path="apps")
public interface appRepo extends JpaRepository<app,Long>{

}
