--Q1
DESC DEPARTMENTS;
SELECT * FROM DEPARTMENTS;

--Q2
SELECT employee_id,last_name,job_id,hire_date
AS STARTDATE
FROM employees;

--Q3
SELECT DISTINCT job_id
FROM employees;

--Q4
SELECT employee_id AS "Emp #",
last_name AS "Employee",
job_id AS "Job",
hire_date AS "Hire Date"
FROM employees;
      

