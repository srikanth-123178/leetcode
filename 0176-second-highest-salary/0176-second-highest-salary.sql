# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary
from Employee
WHERE Salary<(SELECT MAX(Salary) from Employee);
