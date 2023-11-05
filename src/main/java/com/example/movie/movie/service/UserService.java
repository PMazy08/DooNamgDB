package com.example.movie.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.movie.model.User;
import com.example.movie.movie.repository.UserRepository;

@Service
public class UserService implements IUser{
	
	@Autowired
	UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllReviews() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public User save(User us) {
		// TODO Auto-generated method stub
		return userRepository.save(us);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
	
	public Optional<User> findOptionalById(long id) {
		return userRepository.findOptionalById(id);
	}

}
