package org.example;

public class Hofstadter {
  // Recursive implementation of the Hofstadter G sequence
  public Integer gSequence(Integer index) {
    // Base case: G(0) = 0
    if (index == 0) {
      return 0;
    }
    // Recursive case: G(n) = n - G(G(n-1))
    return index - gSequence(gSequence(index - 1));
  }
}