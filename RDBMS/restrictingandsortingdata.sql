-- Q1
SELECT last_name, salary
FROM employees
WHERE salary>12000;

-- Q2
select last_name,department_id
from employees
where employee_id = 176;

-- Q3
select last_name,salary
from employees
where salary not between 5000 and 12000;

-- Q4
select last_name,job_id,hire_date
from employees
where last_name in ('Matos','Taylor')
order by hire_date ASC;

-- Q5
select last_name,department_id
from employees
where department_id in(20,50)
order by last_name ASC;

-- Q6
select last_name,salary from employees
where salary between 5000 and 12000
and department_id in (20,50);

-- Q7
select last_name, hire_date from employees
where hire_date between '01-JAN-94' and '31-DEC-94';

-- Q8
select last_name,job_id from employees
where manager_id is NULL;

-- Q9
select last_name,salary,commission_pct from employees
where comission_pct is not null
order by salary desc,
commission_pct desc;

-- Q10
SELECT last_name, salary
FROM employees
WHERE salary > &salary_value;

-- Q11
SELECT employee_id,last_name,salary,department_id
FROM employees
WHERE manager_id = &manager_id
ORDER BY &sorted_by;

-- Q12
select last_name from employees
where last_name like '__a%';

-- Q13
select last_name from employees
where last_name like '%a%'
and last_name like '%e%';
