package org.example;

public class App {
  public static void main(String[] args) {
    Hofstadter h = new Hofstadter();

    // Test the Hofstadter sequence for the first 10 terms
    for (int i = 0; i <= 10; i++) {
      System.out.println("G(" + i + ") = " + h.gSequence(i));
    }
  }
}