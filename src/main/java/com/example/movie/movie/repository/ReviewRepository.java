package com.example.movie.movie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie.movie.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
	Review findById(long id);
	Optional<Review> findOptionalById(long id);
}
