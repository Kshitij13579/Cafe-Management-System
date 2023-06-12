create database cafesystem;

use cafesystem;

create table category (
       	id integer not null auto_increment,
        name varchar(255),
        primary key (id)
);


create table product (
       id integer not null auto_increment,
        description varchar(255),
        name varchar(255),
        price integer,
        status varchar(255),
        category_fk integer not null,
        primary key (id)
);


alter table product 
       add constraint FK275nu1ncohhfur6qhxiwrm3go 
       foreign key (category_fk) 
       references category (id);