package com.movies.movies.model.movie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
public class MovieServiceTest {

    @TestConfiguration
    static class MovieServiceTestContextConfiguration {

        @Bean
        public MovieService movieService() {
            return new MovieService();
        }
    }

    @Autowired
    private MovieService service;

    @MockBean
    private MovieRepository movieRepository;


    @Test
    public void findMovieById_returnsOptionaMovie() {
        // Setup Objects to use for the test
        Movie movie = new Movie();

        // Setup Mock return values of mocked objects
        Mockito.when(movieRepository.findById(any())).thenReturn(Optional.of(movie));

        // call test method with controlled arguments
        Optional<Movie> result = service.findMovieById(1);
        // verify the results
        assertTrue(result.isPresent());
        assertThat(result.get(), is(movie));
    }

    @Test
    public void findMovieById_returnsEmptyOptional_whenMovieNotFound() {
        // Setup mock return values
        Mockito.when(movieRepository.findById(any())).thenReturn(Optional.empty());

        // call test method
        Optional<Movie> result = service.findMovieById(1);

        // verify results
        assertFalse(result.isPresent());
    }

}