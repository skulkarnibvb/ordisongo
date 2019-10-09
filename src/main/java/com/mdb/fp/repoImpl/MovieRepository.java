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
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mdb.fp.model.Movie;
import com.mdb.fp.repo.MovieRepo;

@Repository("movieRepo")
public class MovieRepository extends MovieRepo {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public <S extends Movie> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

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
	public <S extends Movie> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Movie> List<S> insert(Iterable<S> entities) {
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
	public Optional<Movie> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Movie> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
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
	public List<Movie> getAll() {

		return findAll();
	}

	@Override
	public List<Movie> getByRating(int rating) {
		Criteria isCriteria = Criteria.where("rating").is(rating);
		Query idQuery = new Query(isCriteria);
		//System.out.println("In repo - id: " + rating);
		List<Movie> movies = mongoTemplate.find(idQuery, Movie.class);

		 Instant start = Instant.now();
		 Query ratingQuery = new Query();
		 ratingQuery.with(new Sort(Direction.ASC, "rating"));
		 movies = mongoTemplate.find(ratingQuery, Movie.class);
		 System.out.println("mongo sort - " + Duration.between(start, Instant.now()).getSeconds());
		return movies;
	}

	@Override
	public List<Movie> getByCast(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Movie> getByMusicDr(String[] names) {
		
		Instant start = Instant.now();
		Criteria inCriteria = Criteria.where("music.director").in(names);
		Query musicDrQuery = new Query(inCriteria);
		List<Movie> movies = mongoTemplate.find(musicDrQuery, Movie.class);
		System.out.println(
				"music director search, time taken: " + Duration.between(start, Instant.now()).getSeconds() + "s");
		
		return movies;
	}

}
