package com.mdb.fp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mdb.fp.model.Movie;
import com.mdb.fp.service.MovieService;

@RestController
@RequestMapping(value="/movies")
public class MovieController {

	@Autowired
	@Qualifier(value="movieService")
	private MovieService movieService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Movie> getMovies() {
	
		return movieService.getAllMovies();
	}
	
	@RequestMapping(value="/rated", method=RequestMethod.GET)
	public List<Movie> getMovieByRating(@RequestParam int rating) {
		
		return movieService.getMoviesByRating(rating);
	}
	
	@RequestMapping(value="/byCast", method=RequestMethod.GET)
	public List<Movie> getMoviesWithCast(@RequestParam String cast) {
		
		return movieService.getMovieByCast(cast);
	}
	
	@RequestMapping(value="/byCasts", method=RequestMethod.GET)
	public List<Movie> getMoviesWithCast(@RequestParam String[] casts) {
		
		//System.out.println(casts[0]);
		return movieService.getMovieByCast(casts);
	}
	
	@RequestMapping(value="/ratedabv", method=RequestMethod.GET)
	public List<Movie> getMoviesWithRatingMoreThan(@RequestParam Integer rating) {
		
		//System.out.println(casts[0]);
		return movieService.getMoviesRatedAbove(rating);
	}
	
	@RequestMapping(value="/ratedblw", method=RequestMethod.GET)
	public List<Movie> getMoviesWithRatingLessThan(@RequestParam Integer rating) {
		
		//System.out.println(casts[0]);
		return movieService.getMoviesRatedBelow(rating);
	}
	
	@RequestMapping(value="/musicdr", method=RequestMethod.GET)
	public List<Movie> getMoviesWithMusicDr(@RequestParam String[] names) {
		
		//System.out.println(casts[0]);
		return movieService.getMoviesWithMusicDr(names);
	}
	
	@RequestMapping(value="/with", method=RequestMethod.GET)
	public List<Movie> getMoviesWith(@RequestParam Integer rating) {
		
		//System.out.println(casts[0]);
		return movieService.getMoviesWith();
	}
}
