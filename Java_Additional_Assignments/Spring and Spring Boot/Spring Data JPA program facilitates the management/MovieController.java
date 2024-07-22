package com.springboot.Controller;

import java.util.List;
import java.util.Collections; // Add this import

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Domain.Movie;
import com.springboot.service.MovieService;

@RestController
public class MovieController {

    @Autowired
    MovieService service;

    @GetMapping("/movie/list")
    public List<Movie> getAllMovies() {
        return service.findAll();
    }

    @PostMapping("/movie/add")
    public List<Movie> addMovie(@RequestBody Movie movie) {
        Movie savedMovie = service.save(movie);
        return Collections.singletonList(savedMovie); // Wrap the single movie in a list
    }
}
