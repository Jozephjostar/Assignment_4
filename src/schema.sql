CREATE TABLE categories (
                            id SERIAL PRIMARY KEY,
                            name VARCHAR(50) NOT NULL
);

CREATE TABLE songs (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100),
                       duration INT,
                       category_id INT REFERENCES categories(id)
);

INSERT INTO categories(name) VALUES ('Rock'), ('Pop');
INSERT INTO songs(name, duration, category_id)
VALUES ('Gravity', 245, 1);