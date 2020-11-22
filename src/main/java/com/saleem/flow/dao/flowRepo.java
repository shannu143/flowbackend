package com.saleem.flow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.saleem.flow.model.flow;

@RepositoryRestResource(collectionResourceRel="flow",path="flow")
public interface flowRepo extends JpaRepository<flow,Long>{

}
