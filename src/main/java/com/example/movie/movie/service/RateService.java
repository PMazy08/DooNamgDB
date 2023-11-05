package com.example.movie.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.movie.movie.model.Rate;
import com.example.movie.movie.repository.RateRepository;

@Service
public class RateService implements IRate{
	
	
	@Autowired
	RateRepository rateRepository;
	
	public RateService(RateRepository rateRepository) {
		this.rateRepository = rateRepository;
	}


	@Override
	public List<Rate> getAllRates() {
		// TODO Auto-generated method stub
		return rateRepository.findAll();
	}

	@Override
	public Rate findById(long id) {
		// TODO Auto-generated method stub
		return rateRepository.findById(id);
	}

	@Override
	public Rate save(Rate rt) {
		// TODO Auto-generated method stub
		return rateRepository.save(rt);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		rateRepository.deleteById(id);
	}
	
	public Optional<Rate> findOptionalById(long id) {
		return rateRepository.findOptionalById(id);
	}

}
