CREATE TABLE book
(
    id     SERIAL PRIMARY KEY,
    name   VARCHAR(255)   NOT NULL,
    author VARCHAR(255)   NOT NULL,
    price  NUMERIC(10, 2) NOT NULL
);