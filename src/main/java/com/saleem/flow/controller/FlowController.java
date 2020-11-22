package com.saleem.flow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saleem.flow.model.app;
import com.saleem.flow.model.app_authentication;
import com.saleem.flow.model.flow;

@RestController
public class FlowController {
   
	@Autowired
	public com.saleem.flow.dao.appRepo appRepo;
	   
	@Autowired
	public com.saleem.flow.dao.flowRepo flowRepo;

//    @PostMapping
//    public app_authentication saveConfig(@RequestBody flow map){
//	   app  appref =   appRepo.findById(map.getAppId()).orElseThrow(()->new ResourceNotFoundException("Instructor not found :: " + map.getAppId()));
//	   map.setApp(appref);
//	   return flowRepo.save(map);
//    }
	
}
