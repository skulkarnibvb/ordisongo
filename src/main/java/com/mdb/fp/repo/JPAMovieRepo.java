package com.mdb.fp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdb.fp.model.Movie;

//@Repository
public interface JPAMovieRepo extends JpaRepository<Movie,Long>{
	
	List<Movie> findAll();
	List<Movie> getByRating(int rating);
	List<Movie> getByCast(String name);
	List<Movie> getByCast(String... name);

}
