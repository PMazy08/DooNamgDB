package com.example.movie.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.movie.movie.model.Review;

import com.example.movie.movie.repository.ReviewRepository;

@Service
public class ReviewService implements IReview{
	@Autowired
	ReviewRepository reviewRepository;

	public ReviewService(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}
	
	@Override
	public List<Review> getAllReviews() {
		// TODO Auto-generated method stub
		return reviewRepository.findAll();
	}

	@Override
	public Review findById(long id) {
		// TODO Auto-generated method stub
		return reviewRepository.findById(id);
	}

	@Override
	public Review save(Review rw) {
		// TODO Auto-generated method stub
		return reviewRepository.save(rw);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		reviewRepository.deleteById(id);
	}
	public Optional<Review> findOptionalById(long id) {
		return reviewRepository.findOptionalById(id);
	}

}
