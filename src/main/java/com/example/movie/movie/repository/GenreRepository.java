package com.example.movie.movie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie.movie.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	Genre findById(long id);
	Optional<Genre> findOptionalById(long id);
	
}
