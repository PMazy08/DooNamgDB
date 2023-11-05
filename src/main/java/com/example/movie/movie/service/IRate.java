package com.example.movie.movie.service;

import java.util.List;

import com.example.movie.movie.model.Rate;


public interface IRate {
	List<Rate> getAllRates();
	Rate findById(long id);
	Rate save(Rate rt);
	void deleteById(long id);
}
