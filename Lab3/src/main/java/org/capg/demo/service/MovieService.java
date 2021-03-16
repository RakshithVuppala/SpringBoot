package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Movie;

public interface MovieService {
	
	public List<Movie> getAllMovie();
	public List<Movie> deleteMovie(String name);
	public List<Movie> addMovie(Movie m);
	public List<Movie> getMovieByGener(String gener);
	public List<Movie> updateMovie(Movie m);
}
