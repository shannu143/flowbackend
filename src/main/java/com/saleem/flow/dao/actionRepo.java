package com.saleem.flow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.saleem.flow.model.action;

@RepositoryRestResource(collectionResourceRel="action",path="action")
public interface actionRepo extends JpaRepository<action,Long>{

}
