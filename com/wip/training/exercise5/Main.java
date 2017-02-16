package com.wip.training.exercise5;

public class Main {

  public static void main(String[] args) {

    // For Calculator
    Calculator calc = new Calculator();

    calc.add(4, 6);
    calc.mod(5, 2);
    calc.sub(10, 3);
    calc.multiply(13, 2);
    calc.div(20, 5);
    calc.sq(8);

    // For Area of circle
    Circle cir = new Circle(4);
    cir.area();
  }
}
