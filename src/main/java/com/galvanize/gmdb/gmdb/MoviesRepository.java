package com.galvanize.gmdb.gmdb;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<Movies,Long> {
    // List<Movies> getAllMovies();
}
