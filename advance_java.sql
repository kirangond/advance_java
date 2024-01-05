use user_registration;

show tables;

select * from crud;

insert into crud values ('pavan','hyd','pavan@gmail.com','9620933293');

create table user_details(email varchar(20), password varchar(20));

select * from user_details;

insert into user_details values('kiran@gmail.com','123');
insert into user_details values('pavan@gmail.com','124');
insert into user_details values('rahul@gmail.com','143');

create table register(name varchar(10),city varchar(10),email varchar(20),phone varchar(10));
select * from register;

create table registration(firstname varchar(10),lastname varchar(10),email varchar(25),city varchar(10));

select * from registration;