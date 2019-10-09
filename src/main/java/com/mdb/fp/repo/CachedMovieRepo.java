package com.mdb.fp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mdb.fp.model.CachedMovie;

@Repository("cachedMovieRepo")
public interface CachedMovieRepo extends CrudRepository<CachedMovie, String>{

}
