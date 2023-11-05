package com.example.movie.movie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie.movie.model.Rate;

public interface RateRepository extends JpaRepository<Rate, Long>{
	Rate findById(long id);
	Optional<Rate> findOptionalById(long id);
}
