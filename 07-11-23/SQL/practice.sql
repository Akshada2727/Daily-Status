CREATE DATABASE college;
USE college; 

CREATE TABLE student(
rollno INT PRIMARY KEY,
name VARCHAR(20),
marks INT NOT NULL,
grade VARCHAR(1),
city VARCHAR(20)
);

INSERT INTO student
(rollno,name,marks,grade,city)
VALUES
(101,"akshada", 78 , "A", "Pune"),
(102,"ankita", 70 , "B", "Mumbai"),
(103,"kadambari", 80 , "A", "Thane"),
(104,"akansha", 51 , "C", "Delhi"),
(105,"anuja", 12 , "F", "Pune");

SELECT name,marks FROM student;
SELECT * FROM student;
SELECT DISTINCT city FROM student;
SELECT * FROM student WHERE marks > 70;  
SELECT * FROM student WHERE city = "Pune";
SELECT * FROM student WHERE marks = 80;
SELECT * FROM student WHERE marks > 70 AND city = "Pune";
SELECT * FROM student WHERE marks > 70 OR city = "Pune";
SELECT * FROM student WHERE marks BETWEEN  70 AND 80; 
SELECT * FROM student WHERE city IN ("Pune", "Mumbai", "Gurgaon");
SELECT * FROM student WHERE city IN ("Shirdi", "Gurgaon");
SELECT * FROM student WHERE city NOT IN ("Pune", "Mumbai");
SELECT * FROM student LIMIT 3;
SELECT * FROM student WHERE city NOT IN ("Pune", "Mumbai");
SELECT * FROM student WHERE marks > 70 LIMIT 1;

SELECT * FROM student ORDER BY city ASC;
SELECT * FROM student ORDER BY city DESC;
SELECT * FROM student ORDER BY marks ASC;
SELECT * FROM student ORDER BY marks DESC LIMIT 3;  


SELECT marks FROM student; 
SELECT MAX(marks) FROM student;
SELECT MIN(marks) FROM student;
SELECT AVG(marks) FROM student;
SELECT COUNT(rollno) FROM student; 
SELECT SUM(marks) FROM student; 


SELECT city 
FROM student
GROUP BY city;

SELECT city, COUNT(rollno) 
FROM student
GROUP BY city;

SELECT city,name, COUNT(rollno) 
FROM student
GROUP BY city,name;

SELECT city, AVG(marks) 
FROM student
GROUP BY city;

SELECT city, AVG(marks)
FROM student
GROUP BY city
ORDER BY city;

SELECT city, AVG(marks)
FROM student
GROUP BY city
ORDER BY city DESC;

CREATE TABLE payment(
customer_id INT PRIMARY KEY,
customer VARCHAR(20),
mode VARCHAR(20),
city VARCHAR(10)
);

SELECT * FROM payment;

INSERT INTO payment
(customer_id,customer,mode,city)
VALUES
(101 , "Ava Patel" , "Netbanking" , "Pune"),
(102 , "Aditi Patil" , "Credit Card" , "Thane"),
(103 , "Avani Patel" , "Debit Card" , "Shirdi"),
(104 , "Ayush Patel" , "Netbanking" , "Mumbai");