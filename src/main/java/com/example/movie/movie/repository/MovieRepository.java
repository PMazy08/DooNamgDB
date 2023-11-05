package com.example.movie.movie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie.movie.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	Movie findById(long id);
	Optional<Movie> findOptionalById(long id);
}
