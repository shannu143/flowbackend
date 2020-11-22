package com.saleem.flow.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saleem.flow.model.app_authentication;
import com.saleem.flow.model.authJoin;

@CrossOrigin(origins = "*", maxAge = 3600)
@RepositoryRestResource(collectionResourceRel="appConfig",path="appConfig")
public interface appConfigRepo extends JpaRepository<app_authentication,Long>{

	@Query(value="SELECT new authJoin(auth.id,auth.name,auth.credentials,auth.is_active,app.name as app_name,app.rules,app.id as app_id,app.logo,app.type) from app_authentication as auth left join app on auth.app_id = app.id",nativeQuery = true)
    List<authJoin> join();
}
