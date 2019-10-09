package com.mdb.fp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mdb.fp.model.Movie;
import com.mdb.fp.repo.MovieRepo;

@Service("mongoFlavor")
public class MovieService implements com.mdb.fp.service.MovieService {

	@Autowired
	@Qualifier(value = "movieRepo")
	private MovieRepo movieRepository;
	
	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMoviesByRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMovieByCast(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMovieByCast(String... names) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMoviesRatedAbove(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMoviesRatedBelow(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMoviesWithMusicDr(String... names) {
		
		return movieRepository.getByMusicDr(names);
	}

	@Override
	public List<Movie> getMoviesWith() {
		// TODO Auto-generated method stub
		return null;
	}

}
