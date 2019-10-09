package com.mdb.fp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mdb.fp.model.ActorO;
import com.mdb.fp.model.MovieO;
import com.mdb.fp.service.ActorOService;
import com.mdb.fp.service.MovieOService;

@RestController
@RequestMapping(value="/")
public class MovieControllerOf {

	@Autowired
	@Qualifier(value="movieoService")
	private MovieOService movieService;
	
	@Autowired
	@Qualifier(value="actorOService")
	private ActorOService actorOService;
	
	@RequestMapping(value="/movieso/all", method=RequestMethod.GET)
	public List<MovieO> getMovies() {
	
		return movieService.getAllMovies();
	}
	
	@RequestMapping(value="/actorso/all", method=RequestMethod.GET)
	public List<ActorO> getActors() {
	
		return actorOService.getAllActors();
	}
	
	@RequestMapping(value="/movieso/add", method=RequestMethod.GET)
	public MovieO createMovie(@RequestBody MovieO movie) {
	
		return movieService.add(movie);
	}
}
