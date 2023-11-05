package com.example.movie.movie.payload;


import com.example.movie.movie.model.Movie;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewPayload {
	private String comment;
	private String username;
	private Movie movie;
}
