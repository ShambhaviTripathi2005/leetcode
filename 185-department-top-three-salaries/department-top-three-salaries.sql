# Write your MySQL query statement below
select (d.name)Department,(e1.name)Employee,e1.Salary from Employee e1 left join Department d
on e1.departmentId  = d.id
where
3>
(select count(distinct e2.salary) from Employee e2
where e2.salary > e1.salary and
e1.departmentId = e2.departmentId )

