package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Domain.Movie;

//Fill your code here
@Repository
public interface MovieRepository extends  JpaRepository<Movie,Long>{//Fill your code here {

	//Fill your code here

}
