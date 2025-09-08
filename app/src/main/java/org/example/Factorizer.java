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
  }
