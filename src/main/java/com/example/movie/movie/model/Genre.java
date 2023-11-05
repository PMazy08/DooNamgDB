package com.example.movie.movie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "Genre")
@Table(
		name = "Genre",
		uniqueConstraints = {
				@UniqueConstraint(name = "genre_name_unique",columnNames = "name")
		})
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
    public Genre() {
        // Initialize any default values here
    }
	
	
	public Genre(String name) {
		super();
		this.name = name;
	}
}
