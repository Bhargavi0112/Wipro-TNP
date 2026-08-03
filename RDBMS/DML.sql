-- Q1
create table my_employee as
select employee_id,first_name,last_name,department_id,salary
from employees
where 1 = 2;

-- Q2
desc my_employee;

-- Q3
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(201, 'Michael', 'Hartstein', 20, 13000);
select * from my_employee;

-- Q4
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(202, 'Pat', 'Fay', 20, NULL);
SELECT * FROM my_employee;

-- Q5
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(203, 'Susan', 'Mavris', 40,NULL);
SELECT * FROM my_employee;

-- Q6
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(205, 'Shelley', 'Higgins', 110, 12000);
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(100, 'Steven', 'King', 90, 24000);
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(101, 'Neena', 'Kochhar', 90, 17000);
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(102, 'Lex', 'De Haan', 90, 17000);
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(111, 'Ismael', 'Sciarra', 100, 7700);
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(112, 'Jose Manuel', 'Urman', 100, 7800);
INSERT INTO my_employee
(employee_id, first_name, last_name, department_id, salary)
VALUES
(204, 'Hermann', 'Baer', 70, 10000);
SELECT * FROM my_employee;

-- Q7
UPDATE my_employee
SET salary = salary * 1.10
WHERE department_id = 90;
SELECT * FROM my_employee;

-- Q8
UPDATE my_employee
SET last_name = 'Higgins'
WHERE employee_id = 202;
SELECT * FROM my_employee;

-- Q9
DELETE FROM my_employee
WHERE first_name LIKE '%man%'
   OR last_name LIKE '%man%';
SELECT * FROM my_employee;  

