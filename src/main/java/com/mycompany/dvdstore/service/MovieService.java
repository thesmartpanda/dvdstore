package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.model.Movie;
import com.mycompany.dvdstore.repository.IMovieRepository;

public class MovieService implements IMovieService {

    private IMovieRepository movieRepository;

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

    public IMovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
}
