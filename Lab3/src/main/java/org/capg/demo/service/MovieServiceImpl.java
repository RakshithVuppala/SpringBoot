package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Movie;
import org.capg.demo.dao.MovieJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ms")
public class MovieServiceImpl implements MovieService{

	@Autowired
	MovieJPARepository mDao;
	@Override
	public List<Movie> getAllMovie() {
		return mDao.findAll();
	}

	@Override
	public List<Movie> deleteMovie(String name) {
		mDao.deleteById(name);
		return mDao.findAll();
	}

	@Override
	public List<Movie> addMovie(Movie m) {
		mDao.saveAndFlush(m);
		return mDao.findAll();
	}

	@Override
	public List<Movie> getMovieByGener(String gener) {
		return mDao.findByMovieGener(gener);
	}

	@Override
	public List<Movie> updateMovie(Movie m) {
		mDao.saveAndFlush(m);
		return mDao.findAll();
	}

}
