package com.mdb.fp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdb.fp.model.MovieO;
import com.mdb.fp.repo.MovieORepo;
import com.mdb.fp.service.MovieOService;

@Service("movieoService")
public class MovieOServiceImpl implements MovieOService {

	@Autowired
	//@Qualifier(value="movieoRepo")
	private MovieORepo movieORepo;
	@Override
	public List<MovieO> getAllMovies() {
		// TODO Auto-generated method stub
		return movieORepo.findAll();
	}
	@Override
	public MovieO add(MovieO movie) {

		return movieORepo.save(movie);
	}

}
