package com.mdb.fp.service;

import java.util.List;

import com.mdb.fp.model.MovieO;

public interface MovieOService {

	List<MovieO> getAllMovies();
	MovieO add(MovieO movie);
}
