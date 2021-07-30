package animalmodelling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import animalmodelling.response.Response;
import animalmodelling.service.AnimalHelperService;

@RestController
public class AnimalHelperController {
	
	@Autowired
	AnimalHelperService AnimalHelperService;

	@GetMapping(value = "/{animal}/sound/{language}",produces = {MediaType.APPLICATION_JSON_VALUE})  
	public ResponseEntity<Response> getSound(@PathVariable String animal,@PathVariable String language) {
		Response res =  AnimalHelperService.getSound(animal,language);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
