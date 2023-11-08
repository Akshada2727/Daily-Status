CREATE DATABASE practice;

CREATE TABLE payment(
customer_id INT PRIMARY KEY,
customer VARCHAR(20),
mode VARCHAR(20),
city VARCHAR(10)
);

INSERT INTO payment
(customer_id,customer,mode,city)
VALUES
(101 , "Ava Patel", "Netbanking", "Pune"),
(102 , "Akansha Patil", "Credit Card", "Thane"),
(103 , "Aditi Patel", "Debit Card", "Mumbai"),
(104 , "Aditya More", "Netbanking", "Shirdi");

SELECT * FROM payment;

Select mode,Count(customer) FROM payment
Group By mode;








