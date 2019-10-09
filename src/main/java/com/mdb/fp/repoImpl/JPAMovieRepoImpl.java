package com.mdb.fp.repoImpl;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mdb.fp.model.Movie;
import com.mdb.fp.repo.JPAMovieRepo;

@Repository("jpaMovieRepo")
public class JPAMovieRepoImpl implements JPAMovieRepo {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<Movie> findAll() {
		
		return mongoTemplate.findAll(Movie.class);
	}

	@Override
	public List<Movie> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Movie> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Movie> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Movie> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Movie getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Movie> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Movie> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Movie> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Movie> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Movie> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Movie entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Movie> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Movie> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Movie> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Movie> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Movie> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Movie> getByRating(int rating) {
		
		Instant start1 = Instant.now();
		Criteria equalsCriteria = Criteria.where("rating").is(Integer.valueOf(rating));
		Query queryByRating = new Query(equalsCriteria);
		Instant start2 = Instant.now();
		System.out.println("Build Query in s" + Duration.between(start1, start2).getSeconds());
		List<Movie> movies = mongoTemplate.find(queryByRating, Movie.class);
		Instant end = Instant.now();
		System.out.println("Execute Query in s" + Duration.between(start1, end).getSeconds());
		System.out.println("Only Execute Query in s" + Duration.between(start2, end).getSeconds());
		return movies;
		
	}

	@Override
	public List<Movie> getByCast(String name) {
		
		Instant start1 = Instant.now();
		Criteria inCriteria = Criteria.where("cast").in(name);
		Query queryByRating = new Query(inCriteria);
		List<Movie> movies = mongoTemplate.find(queryByRating, Movie.class);
		Instant end = Instant.now();
		System.out.println("Execute Query in s" + Duration.between(start1, end).getSeconds());
		
		return movies;
	}

	@Override
	public List<Movie> getByCast(String... name) {
		
		Instant start1 = Instant.now();
		Criteria inCriteria = Criteria.where("cast").in(name);
		
		Query queryByRating = new Query(inCriteria);
		List<Movie> movies = mongoTemplate.find(queryByRating, Movie.class);
		Instant end = Instant.now();
		System.out.println("Execute Query in s" + Duration.between(start1, end).getSeconds());
		
		return movies;
	}

}
