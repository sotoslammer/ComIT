package com.movies.movies.model.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public Optional<Movie> findMovieById(long id) {
        return movieRepository.findById(id);
    }

    public List<Movie> findMovies() {
        Iterable<Movie> found = movieRepository.findAll();
        List<Movie> movies = new ArrayList<>();
        for (Movie movie: found) {
            movies.add(movie);
        }

        return movies;
    }
}
