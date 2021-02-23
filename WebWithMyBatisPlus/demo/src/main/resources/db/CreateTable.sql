CREATE DATABASE IF NOT EXISTS test;

CREATE USER IF NOT EXISTS 'test'@'localhost' IDENTIFIED BY 'test';

GRANT ALL ON test.* to 'test'@'localhost';

USE test;

CREATE TABLE user
(
    id char(10) primary key ,
    username varchar (30) not null,
    password varchar (30) not null
);
