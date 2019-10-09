package com.mdb.fp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mdb.fp.model.CachedMovie;
import com.mdb.fp.repo.CachedMovieRepo;
import com.mdb.fp.service.CachedMovieService;

@Service("cachedService")
public class CachedMovieServiceImpl implements CachedMovieService {

	@Autowired
	@Qualifier(value = "cachedMovieRepo")
	private CachedMovieRepo cachedMovieRepository;
	
	@Override
	public List<CachedMovie> getAllMovies() {
		// TODO Auto-generated method stub
		List<CachedMovie> movies = new ArrayList<CachedMovie>();
		Iterable<CachedMovie> iterableMoviesCln = cachedMovieRepository.findAll(); 
		
		iterableMoviesCln.forEach(movies::add);
		
		return movies; 
	}

	@Override
	public CachedMovie add(CachedMovie movie) {
		// TODO Auto-generated method stub
		
		return cachedMovieRepository.save(movie);
	}

}
