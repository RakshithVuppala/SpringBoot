package org.capg.demo.dao;

import java.util.List;

import org.capg.demo.bean.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jpaRep")
public interface MovieJPARepository extends JpaRepository<Movie, String>{
	public List<Movie> findByMovieGener(String gener);
}
