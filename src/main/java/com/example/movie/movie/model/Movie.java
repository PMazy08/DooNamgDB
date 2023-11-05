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
@Entity(name = "Movie")
@Table(name = "Movie")

public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "video", nullable = false)
	private String video;
	
	@Column(name = "image", nullable = false)
	private String image;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="rate_id" ,referencedColumnName = "id", nullable = false)
	@Fetch(FetchMode.JOIN)
	private Rate rate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="genre_id" ,referencedColumnName = "id", nullable = false)
	@Fetch(FetchMode.JOIN)
	private Genre genre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id" ,referencedColumnName = "id", nullable = false)
	@Fetch(FetchMode.JOIN)
	private User user;
	
    public Movie() {
        // Initialize any default values here
    }
	
	public Movie(String name, String video, String image, Rate rate, Genre genre) {
		super();
		this.name = name;
		this.video = video;
		this.image = image;
		this.rate = rate;
		this.genre = genre;
	}
	

}
