package com.mycompany.dvdstore;

import com.mycompany.dvdstore.model.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        MovieService movieService = new MovieService();

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
