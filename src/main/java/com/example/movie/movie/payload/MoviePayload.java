package com.example.movie.movie.payload;


import com.example.movie.movie.model.Genre;
import com.example.movie.movie.model.Rate;
import com.example.movie.movie.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoviePayload {
	private String name;
	private String video;
	private String image;
	private Rate rate;
	private Genre genre;
	private User user;
}
