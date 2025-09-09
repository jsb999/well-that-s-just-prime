package org.example;

public class App {
  public static void main(String[] args) {
    Factorizer prime = new Factorizer();

    System.out.println("What are the prime factors?");
    System.out.println("0: " + prime.primeFactors(0));
    System.out.println("1: " + prime.primeFactors(1));
    System.out.println("2: " + prime.primeFactors(2));
    System.out.println("43: " + prime.primeFactors(43));
    System.out.println("10: " + prime.primeFactors(10));
    System.out.println("100: " + prime.primeFactors(100));

    System.out.println("\nAre these primes?");
    System.out.println("0: " + prime.isPrime(0));
    System.out.println("1: " + prime.isPrime(1));
    System.out.println("2: " + prime.isPrime(2));
    System.out.println("43: " + prime.isPrime(43));
    System.out.println("10: " + prime.isPrime(10));
    System.out.println("100: " + prime.isPrime(100));

    System.out.println("\nAre these composite?");
    System.out.println("0: " + prime.isComposite(0));
    System.out.println("1: " + prime.isComposite(1));
    System.out.println("2: " + prime.isComposite(2));
    System.out.println("43: " + prime.isComposite(43));
    System.out.println("10: " + prime.isComposite(10));
    System.out.println("100: " + prime.isComposite(100));

    System.out.println("\nReduce these fractions:");
    System.out.println("1/1: " + prime.reduce(1, 1));
    System.out.println("1/2: " + prime.reduce(1, 2));
    System.out.println("1/3: " + prime.reduce(1, 3));
    System.out.println("2/3: " + prime.reduce(2, 3));
    System.out.println("2/4: " + prime.reduce(2, 4));
    
  }
}
