package com.example.movie.movie.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "Review")
@Table(name = "Review")

public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "comment", nullable = false)
	private String comment;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="movie_id" ,referencedColumnName = "id", nullable = false)
	@Fetch(FetchMode.JOIN)
	private Movie movie;
	
	
    public Review() {
        // Initialize any default values here
    }
	
	
	public Review(String comment,String username, Movie movie) {
		super();
		this.comment = comment;
		this.username = username;
		this.movie = movie;
		
	}
}
