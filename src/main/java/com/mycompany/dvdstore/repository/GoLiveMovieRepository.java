package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.model.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository {

    public void add(Movie movie){
        FileWriter writer;
        try{
            writer = new FileWriter("C:\\temp\\movies.txt",true);
            writer.write(movie.getTitle() +";");
            writer.write(movie.getGenre() +"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
