package com.example.movie.movie.json;

import java.util.ArrayList;
import java.util.List;

import com.example.movie.movie.model.Genre;
import com.example.movie.movie.model.Movie;
import com.example.movie.movie.model.Rate;
import com.example.movie.movie.model.User;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieListJson {
	private Long id;
	private String name;
	private String video;
	private String image;
	private Rate rate;
	private Genre genre;
	private User user;
	
	public static MovieListJson packJson(Movie movie) {
		MovieListJson mlj = new MovieListJson();
		mlj.setId(movie.getId());
		mlj.setName(movie.getName());
		mlj.setVideo(movie.getVideo());
		mlj.setImage(movie.getImage());
		mlj.setRate(movie.getRate());
		mlj.setGenre(movie.getGenre());
		mlj.setUser(movie.getUser());
		
		return mlj;
	}
	

	public static List<MovieListJson> packJsons(List<Movie> movies) {
		List<MovieListJson> movieListJson = new ArrayList<MovieListJson>();
		for (Movie movie : movies) {
			movieListJson.add(packJson(movie));
		}
		return movieListJson;
	}
}
