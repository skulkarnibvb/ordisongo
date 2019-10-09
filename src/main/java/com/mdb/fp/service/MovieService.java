package com.mdb.fp.service;

import java.util.List;

import com.mdb.fp.model.Movie;

public interface MovieService {

	List<Movie> getAllMovies();

	List<Movie> getMoviesByRating(int rating);

	List<Movie> getMovieByCast(String name);
	
	List<Movie> getMovieByCast(String... names);
	
	List<Movie> getMoviesRatedAbove(int rating);
	
	List<Movie> getMoviesRatedBelow(int rating);
	
	List<Movie> getMoviesWithMusicDr(String... names);
	
	List<Movie> getMoviesWith();
}
