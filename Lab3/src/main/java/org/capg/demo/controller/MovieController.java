package org.capg.demo.controller;

import java.util.List;

import org.capg.demo.bean.Movie;
import org.capg.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService mService;
	
	@GetMapping("/all")
	public List<Movie> getAllMovie(){
		return mService.getAllMovie();
	}
	
	@PostMapping("/create")
	public List<Movie> addMovie(@RequestBody Movie m){
		return mService.addMovie(m);
	}
	
	@DeleteMapping("/delete/{name}")
	public List<Movie> removeMovie(@PathVariable String name){
		return mService.deleteMovie(name);
	}
	
	@GetMapping("/get/{name}")
	public List<Movie> getMovieByGener(@PathVariable String name){
		return mService.getMovieByGener(name);
	}
	
	@PutMapping("/update")
	public List<Movie> updateMovie(@RequestBody Movie m){
		return mService.updateMovie(m);
	}
}
