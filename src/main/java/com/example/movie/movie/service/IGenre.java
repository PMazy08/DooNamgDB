package com.example.movie.movie.service;

import java.util.List;

import com.example.movie.movie.model.Genre;

public interface IGenre {
	List<Genre> getAllGenres();
	Genre findById(long id);
	Genre save(Genre gnt);
	void deleteById(long id);
}
