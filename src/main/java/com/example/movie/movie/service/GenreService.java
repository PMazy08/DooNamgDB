package com.example.movie.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.movie.model.Genre;
import com.example.movie.movie.repository.GenreRepository;


@Service
public class GenreService implements IGenre{
	
	@Autowired
	GenreRepository genreRepository;
	
	public GenreService(GenreRepository genreRepository) {
		this.genreRepository = genreRepository;
	}


	@Override
	public List<Genre> getAllGenres() {
		// TODO Auto-generated method stub
		return genreRepository.findAll();
	}

	@Override
	public Genre findById(long id) {
		// TODO Auto-generated method stub
		return genreRepository.findById(id);
	}

	@Override
	public Genre save(Genre gnt) {
		// TODO Auto-generated method stub
		return genreRepository.save(gnt);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		genreRepository.deleteById(id);
	}

	public Optional<Genre> findOptionalById(long id) {
		return genreRepository.findOptionalById(id);
	}
}
