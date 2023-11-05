package com.example.movie.movie.service;

import java.util.List;

import com.example.movie.movie.model.User;


public interface IUser {
	List<User> getAllReviews();
	User findById(long id);
	User save(User us);
	void deleteById(long id);
}
