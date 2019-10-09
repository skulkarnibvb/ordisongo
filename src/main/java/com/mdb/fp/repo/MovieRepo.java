package com.mdb.fp.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mdb.fp.model.Movie;

@Repository
public abstract class MovieRepo implements MongoRepository<Movie,String>{

	public abstract List<Movie> getAll();
	public abstract List<Movie> getByRating(int rating);
	public abstract List<Movie> getByCast(String name);
	public abstract List<Movie> getByMusicDr(String[] names);
	//public abstract List<Movie> getMoviesWith();
}
