package com.zmattos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmattos.dsmovie.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
