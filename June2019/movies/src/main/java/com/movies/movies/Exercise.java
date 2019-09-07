package com.movies.movies;

public class Exercise {
    public static int divide(int numerator, int divisor) {
      if (divisor == 0) {
          throw new RuntimeException("NOT GOOD");
      }

      return numerator / divisor;
    }
}
