package com.example.movie.movie.service;

import java.util.List;

import com.example.movie.movie.model.Review;

public interface IReview {
	List<Review> getAllReviews();
	Review findById(long id);
	Review save(Review rw);
	void deleteById(long id);
}
