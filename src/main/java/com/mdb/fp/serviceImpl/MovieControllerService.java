package com.mdb.fp.serviceImpl;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mdb.fp.model.Movie;
import com.mdb.fp.repo.JPAMovieRepo;
import com.mdb.fp.service.MovieService;

@Service("movieService")
public class MovieControllerService implements MovieService {

	@Autowired
	@Qualifier(value = "jpaMovieRepo")
	private JPAMovieRepo movieRepository;

	@Override
	public List<Movie> getAllMovies() {

		Instant start = Instant.now();
		//List<Movie> movies = movieRepository.getAll();
		List<Movie> movies = movieRepository.findAll();
		movies = movies.stream()
				.sorted((m1, m2) -> Integer.valueOf(m1.getRating()).compareTo(Integer.valueOf(m2.getRating())))
				.collect(Collectors.toList());
		System.out.println("sort with j8: " + Duration.between(start, Instant.now()).getSeconds());
		
		//return movieRepository.getAll();
		return movieRepository.findAll();
	}

	@Override
	public List<Movie> getMoviesByRating(int rating) {

		return movieRepository.getByRating(rating);
	}

	@Override
	public List<Movie> getMovieByCast(String name) {

		return movieRepository.getByCast(name);
	}

	@Override
	public List<Movie> getMovieByCast(String... names) {
		
		return movieRepository.getByCast(names);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMoviesWith() {
		// TODO Auto-generated method stub
		return null;
	}

}
