# Write your MySQL query statement below
select e.name as Employee from Employee e left join Employee m  on  e.managerId=m.Id where e.salary>m.salary;