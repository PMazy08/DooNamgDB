package com.example.movie.movie.json;

import java.util.ArrayList;
import java.util.List;

import com.example.movie.movie.model.Movie;
import com.example.movie.movie.model.Review;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReviewListJson {
	private Long id;
	private String comment;
	private String username;
	private Movie movie;
	
	public static ReviewListJson packJson(Review review) {
		ReviewListJson rwlj = new ReviewListJson();
		rwlj.setId(review.getId());
		rwlj.setComment(review.getComment());
		rwlj.setUsername(review.getUsername());
		rwlj.setMovie(review.getMovie());
		
		return rwlj;
	}
	
	public static List<ReviewListJson> packJsons(List<Review> reviews) {
		List<ReviewListJson> reviewListJson = new ArrayList<ReviewListJson>();
		for (Review review : reviews) {
			reviewListJson.add(packJson(review));
		}
		return reviewListJson;
	}

}
