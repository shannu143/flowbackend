package com.saleem.flow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.saleem.flow.model.trigger;

@RepositoryRestResource(collectionResourceRel="trigger",path="trigger")
public interface triggerRepo extends JpaRepository<trigger,Long>{

}
