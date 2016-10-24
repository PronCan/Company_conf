select * from DEPARTMENTS;

select * from tab;

select last_name, salary
from EMPLOYEES
where salary>12000;

select last_name, department_id
from EMPLOYEES
where EMPLOYEE_ID = 176;

select last_name, salary
from employees
where salary not between 5000 and 12000;

select sysdate "Date"
from dual;

select employee_id, last_name, salary,
round(salary * 1.15, 0) "New Salary"
from employees;

select last_name, department_name
from employees, departments
where employees.department_id = departments.department_id;

select e.last_name, d.department_name, e.department_id
from employees e, departments d
where e.department_id = d.department_id;

select e.last_name, d.department_name, e.department_id
from employees e, departments d
where e.department_id = d.department_id and e.salary > 10000;

select e.last_name, d.department_name, e.department_id
from employees e inner join departments d  /*또는 join */
on e.department_id = d.department_id and e.salary > 10000;

select e.last_name, d.department_name
from employees e FULL OUTER JOIN departments d
on e.department_id = d.department_id;

select employee_id, last_name, manager_id
from employees;

select last_name, department_name
from employees natural join departments;

select city, department_name
from locations natural join departments;

select last_name, salary
from employees
where salary > (select salary from employees where last_name='Abel');

select last_name, salary
from employees
where salary > (select salary from employees where last_name='AAA');

select last_name, salary
from employees
where salary IN (4200, 6000, 9000); /* in 은 = any 와 같다. */

select last_name, salary
from employees
where salary = any (4200, 6000, 9000);

select last_name, salary
from employees
where salary < any (4200, 6000, 9000);

select last_name, salary
from employees
where salary < all (4200, 6000, 9000);

select last_name, salary
from employees
where salary < any (select max(salary) from employees);

select last_name
from employees
where employee_id in (select manager_id from employees);

select last_name
from employees
where employee_id not in (select manager_id from employees);

select last_name
from employees
where employee_id not in (select manager_id from employees where manager_id is not null);
