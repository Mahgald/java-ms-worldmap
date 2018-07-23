package com.surribas.backbone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surribas.backbone.model.Country;


@RestController
@RequestMapping("/microservicesPoc")
public class WorldMapController {

private static List<Country> countries = new ArrayList<>();
	
	@GetMapping("/country")
	public ResponseEntity<List<Country>> getAllCountries() {
		return new ResponseEntity<>(countries,HttpStatus.OK);
	}

	@GetMapping("/country/{id}")
	public ResponseEntity<String> getCountry(@PathVariable("id") Long id) {
		return new ResponseEntity<>(countries.parallelStream().filter(c -> c.getId().equals(id)).findFirst().get().toString(),HttpStatus.OK);
	}
	
	@PostMapping("/country")
	public ResponseEntity<Country> saveNewCountry(@RequestBody Country country){
		countries.add(country);
		return new ResponseEntity<>(country,HttpStatus.OK);
	}
	
		
	
}
