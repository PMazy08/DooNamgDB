package com.example.movie.movie.json;

import java.util.ArrayList;
import java.util.List;

import com.example.movie.movie.model.Genre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenreListJson {
	private Long id;
	private String name;
	
	public static GenreListJson packJson(Genre genre) {
		GenreListJson glj = new GenreListJson();
		glj.setId(genre.getId());
		glj.setName(genre.getName());
		
		return glj;
	}
	
	public static List<GenreListJson> packJsons(List<Genre> genres) {
		List<GenreListJson> genreListJson = new ArrayList<GenreListJson>();
		for (Genre genre : genres) {
			genreListJson.add(packJson(genre));
		}
		return genreListJson;
	}

}
