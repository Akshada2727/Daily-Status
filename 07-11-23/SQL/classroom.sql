CREATE DATABASE company; 
USE company; 

CREATE TABLE emp(
id Int PRIMARY KEY,
name VARCHAR(20),
salary INT
);

INSERT INTO emp VALUES(1,"adam",2500);
INSERT INTO emp VALUES(2,"bob",30000);
INSERT INTO emp VALUES(3,"casey",4000); 

SELECT * FROM emp;


CREATE TABLE temp1(
id INT UNIQUE
);

INSERT INTO temp1 VALUES(111);
INSERT INTO temp1 VALUES(111);

SELECT * FROM temp1;

DROP DATABASE college;