package com.galvanize.gmdb.gmdb;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ReviewID;
    
    private String ReviewText;
    private Integer LastModified;
    @ManyToOne(fetch = FetchType.LAZY)
    private Movies movies;
    
    public Reviews(String reviewText, Integer lastModified, Movies movies) {
        ReviewText = reviewText;
        LastModified = lastModified;
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) return true ;
    if (!(o instanceof Reviews )) return false ;
    return ReviewID != null && ReviewID.equals(((Reviews) o).getReviewID());
    }

    public Long getReviewID() {
        return ReviewID;
    }

    public String getReviewText() {
        return ReviewText;
    }
    public void setReviewText(String reviewText) {
        ReviewText = reviewText;
    }
    public Integer getLastModified() {
        return LastModified;
    }
    public void setLastModified(Integer lastModified) {
        LastModified = lastModified;
    }
    public Movies getMovies() {
        return movies;
    }
    public void setMovies(Movies movies) {
        this.movies = movies;
    }



}
