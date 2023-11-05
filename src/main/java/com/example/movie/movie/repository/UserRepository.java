package com.example.movie.movie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie.movie.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findById(long id);
	Optional<User> findOptionalById(long id);
}
