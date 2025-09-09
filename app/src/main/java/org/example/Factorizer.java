package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(int num){
    ArrayList<Integer> primeReturns = new ArrayList<Integer>();

    int counter = 1;
  
    while(counter < num/2){
      counter++;
      if(num % counter == 0){
        primeReturns.add(counter);
      }
    }

    return primeReturns;
  }

  public boolean isPrime(int num){
    if(primeFactors(num).size() == 0){
      return true;
    } else {
      return false;
    }
  }

  public boolean isComposite(int num){
    return !isPrime(num);
  }

  public String reduce(int numerator, int denominator) {
    // Find the greatest common divisor (GCD) using Euclidean algorithm
    int gcd = findGCD(numerator, denominator);
    
    // Reduce the fraction by dividing both numerator and denominator by GCD
    int reducedNumerator = numerator / gcd;
    int reducedDenominator = denominator / gcd;
    
    return reducedNumerator + "/" + reducedDenominator;
  }
  
  private int findGCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return findGCD(b, a % b);
  }
}