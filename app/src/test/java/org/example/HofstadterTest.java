package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HofstadterTest {
  @Test
  void itReturnsTheZerothElementInTheSequence() {
    Hofstadter h = new Hofstadter();
    assertEquals(0, h.gSequence(0));
  }

  @Test
  void itReturnsTheFirstElementInTheSequence() {
    Hofstadter h = new Hofstadter();
    assertEquals(1, h.gSequence(1));
  }

  @Test
  void itReturnsTheSecondElementInTheSequence() {
    Hofstadter h = new Hofstadter();
    assertEquals(1, h.gSequence(2));
  }

  @Test
  void itReturnsTheThirdElementInTheSequence() {
    Hofstadter h = new Hofstadter();
    assertEquals(2, h.gSequence(3));
  }

  @Test
  void itReturnsTheTenthElementInTheSequence() {
    Hofstadter h = new Hofstadter();
    assertEquals(6, h.gSequence(10));
  }
}