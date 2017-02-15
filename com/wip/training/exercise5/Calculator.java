package com.wip.training.exercise5;

import java.util.Scanner;

public class Calculator {
  void operate() {
    int num1 = 4;
    int num2 = 6;
    Scanner scan = new Scanner(System.in);
    System.out.print("What operation?(+,*,-,/,%,*2):");
    String operation = scan.next();
    scan.close();

    if (operation.equals("+")) {
      System.out.println(num1 + num2);
    }

    else if (operation.equals("-")) {
      System.out.println(num1 - num2);
    }

    else if (operation.equals("*")) {
      System.out.println(num1 * num2);
    }

    else if (operation.equals("/")) {
      System.out.println(num1 / num2);
    }

    else if (operation.equals("%")) {
      System.out.println(num1 % num2);
    }

    else if (operation.equals("*2")) {
      System.out.println(num1 * num1);
    }

    else {
      System.out.println("The operation is not valid.");

    }

  }

}

