package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.model.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        MovieController controller = new MovieController();

        controller.addUsingConsole();


    }
}
