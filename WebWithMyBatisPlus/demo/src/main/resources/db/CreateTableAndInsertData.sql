CREATE DATABASE IF NOT EXISTS test;

USE test;

CREATE TABLE user
(
    id BIGINT PRIMARY KEY,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(30) NOT NULL
);

INSERT INTO user(id,username,password) VALUES (1,'username1','password1'),(2,'username2','password2');
