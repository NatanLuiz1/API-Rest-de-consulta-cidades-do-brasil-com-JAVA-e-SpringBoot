package com.github.natanluiz1.citiesapi.states;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {
	
	
	private StateRepository repository;
	
	public StateResource(final StateRepository repository) {
	    this.repository = repository;
	}

	  @GetMapping
	  public List<State> states() {
		  
	    return repository.findAll();
	  }

}
