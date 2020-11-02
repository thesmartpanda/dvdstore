package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

public class App 
{
    public static void main( String[] args )
    {
        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();

        MovieController controller = new MovieController();

        MovieService movieService = new MovieService();
        movieService.setMovieRepository(movieRepository);

        controller.setMovieService(movieService);
        controller.addUsingConsole();


    }
}
