package com.wip.training.exercise6;

import java.time.LocalDate;
import java.util.Arrays;

public class MoviesMain {

  public static void main(String[] args) {

    Movie[] movies = new Movie[5];
    movies[0] = new Movie("Die Hard", "Action", LocalDate.of(2004, 05, 24), 120);
    movies[1] = new Movie("Terminator", "Sci-fi", LocalDate.of(2001, 07, 12), 100);
    movies[2] = new Movie("Conjuring", "Horror", LocalDate.of(2013, 12, 22), 110);
    movies[3] = new Movie("Before sunrise", "Romance", LocalDate.of(2007, 04, 07), 100);
    movies[4] = new Movie("The Hangover", "Comedy", LocalDate.of(2010, 06, 16), 120);

    System.out.println(movies);
    
    int movieCount = movies.length;
    for (int i = 0; i < movieCount; i++) {
      movies[i].printInfo();
    }

    int totalTime = totaltime(movies);
    System.out.println("Time taken to watch all movies:  " + totalTime + " mins");

    String latestMovie = latest(movies);
    System.out.println("latest release: " + latestMovie);

    String oldMovie = oldest(movies);
    System.out.println("Oldest release: " + oldMovie);

    int count = allGenre(movies, "Action");
    System.out.println("Movie genre repeat: " + count);

  }

  private static String oldest(Movie[] movies) {

    LocalDate[] Dates = new LocalDate[movies.length];
    for (int i = 0; i < movies.length; i++) {
      Dates[i] = movies[i].getReleaseDate();
    }

    Arrays.sort(Dates);
    for (int i = 0; i < movies.length; i++)
      if (movies[i].getReleaseDate().equals(Dates[0]))
        return movies[i].getTitle();

    return null;

  }

  private static String latest(Movie[] movies) {
    LocalDate[] Dates = new LocalDate[movies.length];
    for (int i = 0; i < movies.length; i++) {
      Dates[i] = movies[i].getReleaseDate();
    }

    Arrays.sort(Dates);
    for (int i = 0; i < movies.length; i++)
      if (movies[i].getReleaseDate().equals(Dates[movies.length - 1]))
        return movies[i].getTitle();

    return null;
  }

  private static int allGenre(Movie[] movies, String genre) {
    int count = 0;
    int moviesCount = movies.length;
    for (int i = 0; i < moviesCount; i++)
      if (movies[i].getGenre().equals(genre))
        count++;

    return count;
  }

  private static int totaltime(Movie[] movies) {
    int sum = 0;
    int moviesCount = movies.length;
    for (int i = 0; i < moviesCount; i++)
      sum += movies[i].movieLength;

    return sum;
  }


}
