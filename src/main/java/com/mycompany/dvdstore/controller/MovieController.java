package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.model.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private MovieService movieService = new MovieService();

    public void addUsingConsole(){
        System.out.println("Title: ");
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();

        System.out.println("Genre: ");
        String genre = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }

}
