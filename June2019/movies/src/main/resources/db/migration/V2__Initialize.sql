create table cinema(
	id bigint not null auto_increment,
    address varchar(255) not null,
    city varchar(255) not null,
    name varchar(255) not null,
    province varchar(255) not null,
    primary key(id)
);

create table theater_room (
	id bigint not null,
    `number` integer not null,
    capacity integer not null,
    `rows` integer not null,
    cinema_id bigint not null,
    primary key (id),
    foreign key cinema_fk(cinema_id) references cinema(id),
    Unique(cinema_id, `number`)
);

create table movie (
    id bigint auto_increment,
    title varchar(255),
    genre varchar(100),
    primary key (id)
);
