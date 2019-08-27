create table cinema_movie(
	cinemaId bigint not null,
    movieId bigint not null,
    primary key (cinemaId, movieId),
    foreign key cinema_fk(cinemaId) references cinema(id),
    foreign key movie_fk(movieId) references movie(id)
);