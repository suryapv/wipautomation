package com.wip.training.exercise5;

public class Circle {

  public int radius;
  public double pi;


  public Circle() {
    radius = 6;
    pi = 3.142;
  }

  public void area() {
    System.out.println("Area of the circle = " + (pi * radius * radius));

  }
}


