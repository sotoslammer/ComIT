package com.movies.movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTest {

    @Test
    public void divide_returnsCorrec_whenNumbersAreEvenlyDivisible() {
        int result = Exercise.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void divide_returnsFloor_whenNumbersAreNotEvenlyDivisible() {
        int result = Exercise.divide(7, 3);
        assertEquals(2, result);
    }

    @Test( expected = RuntimeException.class)
    public void divide_throwsException_whenDivisorIsZero() {
        Exercise.divide(7, 0);
    }
}