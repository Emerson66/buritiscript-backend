CREATE TABLE user_table (
    id SERIAL,
    username VARCHAR(15) UNIQUE NOT NULL,
    password VARCHAR(25) NOT NULL,
    name VARCHAR(40) NOT NULL,
    about VARCHAR(500),
    sexo CHAR(1),
    email VARCHAR(40) UNIQUE NOT NULL,
    website VARCHAR(50),
    github VARCHAR(50),
    telegram VARCHAR(50),
    twitter VARCHAR(50),
    instagram VARCHAR(50),
    linkedin VARCHAR(50),
    PRIMARY KEY(id)
);