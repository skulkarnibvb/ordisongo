package com.mdb.fp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdb.fp.model.MovieO;

@Repository
public interface MovieORepo extends JpaRepository<MovieO, Long>{

	//List<MovieO> getAll();
}
