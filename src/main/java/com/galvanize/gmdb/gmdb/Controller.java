package com.galvanize.gmdb.gmdb;

import java.util.Collection;
import java.util.Optional;

import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    MoviesRepository moviesRepository;

   

    // moviesRepository.save(new Movies("lagan", 2011, "Drama" , 120));
    @GetMapping("/all")
    public Iterable<Movies> getAllMovies(){
        return moviesRepository.findAll();
    }
    
    // @GetMapping("/Movie/")
    // public Optional<Movies> getMovieReviews(@RequestParam Long id){
    //     return moviesRepository.findById(id);
    // }

    //
    // 8. As an Admin
    //    I can add a new movie to the database by providing the data listed in story 1 
    //      (Movie ID should be autogenerated)
    //    so that I can share new movies with the users.

    @PostMapping("/addMovie")
    public void addMovie(@RequestBody Movies movies){
        moviesRepository.save(movies);
    }
    
}