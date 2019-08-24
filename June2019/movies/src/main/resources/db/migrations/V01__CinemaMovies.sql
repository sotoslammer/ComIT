create table cinema_movie(
	cinemaId integer not null,
    movieId integer not null,
    primary key (cinemaId, movieId),
    foreign key cinema_fk(cinemaId) references cinema(id),
    foreign key movie_fk(movieId) references movie(id)
);