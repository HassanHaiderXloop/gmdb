package com.galvanize.gmdb.gmdb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long MovieId;

    private String MovieTitle;
    private Integer YearReleased;
    private String Genre;
    private Integer RunTime;

    // @OneToMany(
    //     mappedBy = "Movies",
    //     cascade = CascadeType.ALL,
    //     orphanRemoval = true)
    // private List<Reviews>  reviews = new ArrayList<>();

    // public List<Reviews> getReviews() {
    //     return reviews;
    // }

    public Movies(String movieTitle, Integer yearReleased, String genre, Integer runTime) {
        MovieTitle = movieTitle;
        YearReleased = yearReleased;
        Genre = genre;
        RunTime = runTime;
    }

    // public void addReview(Reviews review) {
    //     reviews.add(review);
    //     review.setMovies(this);
    // }

    // public List<Reviews> getAllReviews(){
    //     return reviews;
    // }

    public String getMovieTitle() {
        return MovieTitle;
    }


    public void setMovieTitle(String movieTitle) {
        MovieTitle = movieTitle;
    }


    public Integer getYearReleased() {
        return YearReleased;
    }


    public void setYearReleased(Integer yearReleased) {
        YearReleased = yearReleased;
    }


    public String getGenre() {
        return Genre;
    }


    public void setGenre(String genre) {
        Genre = genre;
    }


    public Integer getRunTime() {
        return RunTime;
    }


    public void setRunTime(Integer runTime) {
        RunTime = runTime;
    }


    protected Movies(){};

    
}
