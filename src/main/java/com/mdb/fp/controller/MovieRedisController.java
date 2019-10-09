package com.mdb.fp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mdb.fp.model.CachedMovie;
import com.mdb.fp.service.CachedMovieService;

@RestController
@RequestMapping("/cached")
public class MovieRedisController {

	@Autowired
	@Qualifier(value="cachedService")
	private CachedMovieService movieService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<CachedMovie> getMovies() {
	
		return movieService.getAllMovies();
	}
	
	@RequestMapping(value="/addan", method=RequestMethod.POST, consumes = "application/json")
	@CrossOrigin(origins = "http://localhost:8080")
	public CachedMovie addMovie(@RequestBody CachedMovie movie) {
		
		return movieService.add(movie);
	}
}
