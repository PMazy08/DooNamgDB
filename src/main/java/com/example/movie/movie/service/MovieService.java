package com.example.movie.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.movie.model.Movie;
import com.example.movie.movie.repository.MovieRepository;

@Service
public class MovieService implements IMovie{
	@Autowired
	MovieRepository movieRepository;
	
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public Movie findById(long id) {
		// TODO Auto-generated method stub
		return movieRepository.findById(id);
	}

	@Override
	public Movie save(Movie mv) {
		// TODO Auto-generated method stub
		return movieRepository.save(mv);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(id);
	}
	
	public Optional<Movie> findOptionalById(long id) {
		return movieRepository.findOptionalById(id);
	}

}
