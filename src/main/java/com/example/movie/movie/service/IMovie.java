package com.example.movie.movie.service;

import java.util.List;

import com.example.movie.movie.model.Movie;


public interface IMovie {
	List<Movie> getAllMovies();
	Movie findById(long id);
	Movie save(Movie mv);
	void deleteById(long id);
}
