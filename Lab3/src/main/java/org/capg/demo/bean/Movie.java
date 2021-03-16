package org.capg.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private String movieName;
	private float movieRating;
	private String movieGener;
	
	public Movie() {
		
	}

	public Movie(String movieName, int movieRating, String movieGener) {
		super();
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.movieGener = movieGener;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(float movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieGener() {
		return movieGener;
	}

	public void setMovieGener(String movieGener) {
		this.movieGener = movieGener;
	}
	
	
}
