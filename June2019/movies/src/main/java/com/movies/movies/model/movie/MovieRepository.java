package com.movies.movies.model.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query(value = "select m from Movie m where m.title like :title")
    public List<Movie> findMovieByTitle(@Param("title") String title);

}
