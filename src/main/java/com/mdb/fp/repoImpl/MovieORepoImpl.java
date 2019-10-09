package com.mdb.fp.repoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mdb.fp.model.MovieO;

//@Repository("movieoRepo")
public class MovieORepoImpl  {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<MovieO> getAll() {

		return entityManager.createQuery("select m from movie m").getResultList();
	}
	
}