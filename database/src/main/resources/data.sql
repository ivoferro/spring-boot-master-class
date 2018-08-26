CREATE TABLE PERSON (
  id INTEGER NOT NULL,
  name VARCHAR(255) NOT NULL,
  location VARCHAR(255),
  birthdate TIMESTAMP,
  PRIMARY KEY(id)
);

INSERT INTO PERSON (id, name, location, birthdate)
VALUES (100001, 'Ivo', 'Maia', sysdate());

INSERT INTO PERSON (id, name, location, birthdate)
VALUES (100002, 'Renato', 'Areosa', sysdate());

INSERT INTO PERSON (id, name, location, birthdate)
VALUES (100003, 'Daniel', 'Povoa', sysdate());