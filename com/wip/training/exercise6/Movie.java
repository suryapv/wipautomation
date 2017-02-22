package com.wip.training.exercise6;

import java.time.LocalDate;

public class Movie {

  String title;
  String genre;
  LocalDate releaseDate;
  int movieLength;


  public String getTitle() {
    return title;
  }

  public String getGenre() {
    return genre;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }


  public int getMovieLength() {
    return movieLength;
  }

  public void printInfo() {
    System.out.println("Movie title: " + getTitle());
    System.out.println("Movie genre: " + getGenre());
    System.out.println("Movie release date: " + getReleaseDate());
    System.out.println("Movie length: " + getMovieLength() + "  mins");

  }

  public Movie(String title, String genre, LocalDate releaseDate, int movieLength) {

    this.title = title;
    this.genre = genre;
    this.movieLength = movieLength;
    this.releaseDate = releaseDate;

  }

}
