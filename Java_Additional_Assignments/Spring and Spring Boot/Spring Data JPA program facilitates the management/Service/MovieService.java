package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Domain.Movie;
import com.springboot.Repository.MovieRepository;

//Fill your code here
@Service
public class MovieService {

	//Fill your code here
	@Autowired
	MovieRepository repo;

	public List<Movie> findAll() {
		//Fill your code here
		return (List<Movie>) repo.findAll();
	}

	public Movie save(Movie movie) {
		//Fill your code here
		return repo.save(movie);
	}

}
