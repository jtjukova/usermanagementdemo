DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  surname VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

INSERT INTO user (name, surname, email) VALUES
  ('Michael', 'Green', 'm.green@test.com'),
  ('Rachel', 'Red', 'r.red@test.com'),
  ('Ivan', 'Brown', 'i.brown@test.com');