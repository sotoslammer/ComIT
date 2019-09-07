package com.movies.movies.model.movie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

// creates a bridge between Spring Boot test and JUnit
@RunWith(SpringRunner.class)
// standard setup for testing persistence layer
@DataJpaTest
public class MovieRepositoryTest {
    // Allows interaction with the in-memory database
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private MovieRepository repository;

    @Test
    public void findMovieByTitle() {
        // set up test objects
        Movie movie = new Movie("Star Wars: A New Hope", "Sci-Fi", Rating.E, false);

        // save object in entity manager to test repo
        entityManager.persist(movie);
        entityManager.flush();

        // call method that is being tested
        List<Movie> results = repository.findMovieByTitle("Star Wars");

        // verify results
        assertThat(results.size(), is(1));
        assertEquals(results.get(1), movie);
    }
}