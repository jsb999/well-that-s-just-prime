package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
  Factorizer factorizer;
  @BeforeEach
  void setUp(){
    factorizer = new Factorizer();
  }
  
  @Test
  void itReturnsAnEmptyListForZero() {
assertEquals(factorizer.primeFactors(0), new ArrayList<Integer>());
  }

  @Test
  void itReturnsAnEmptyListForOne(){
    assertEquals(factorizer.primeFactors(1), new ArrayList<Integer>());
  }

  @Test
  void itReturnsListForFifty(){
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(5);
    expected.add(10);
    expected.add(25);

    assertEquals(factorizer.primeFactors(50), expected);
  }

  @Test
  void itReturnsTrueForPrime(){
    assertTrue(factorizer.isPrime(43));
  }

  @Test
  void itReturnsFalseForComposite(){
    assertFalse(factorizer.isComposite(43));
  }
}
