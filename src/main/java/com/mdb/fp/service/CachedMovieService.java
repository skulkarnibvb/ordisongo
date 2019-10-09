package com.mdb.fp.service;

import java.util.List;

import com.mdb.fp.model.CachedMovie;

public interface CachedMovieService {

	List<CachedMovie> getAllMovies();
	CachedMovie add(CachedMovie movie);
}
