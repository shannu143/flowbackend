package com.saleem.flow.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saleem.flow.model.app;
import com.saleem.flow.model.app_authentication;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app_config")
public class AppConfigController {

   @Autowired
   public com.saleem.flow.dao.appRepo appRepo;
   
   @Autowired
   public com.saleem.flow.dao.appConfigRepo appConfigRepo;

   @PostMapping
   public app_authentication saveConfig(@RequestBody app_authentication map){
	   app  appref =   appRepo.findById(map.getAppId()).orElseThrow(()->new ResourceNotFoundException("Instructor not found :: " + map.getAppId()));
	   map.setApp(appref);
	   return appConfigRepo.save(map);
   }
   
   @GetMapping
   public String getConfig() {
	   System.out.println(appConfigRepo.join().toString());
	   return "";
   }
   
}
