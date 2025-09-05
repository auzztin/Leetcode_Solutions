# Write your MySQL query statement below
select b.unique_id,a.name from Employees a left Join EmployeeUNI b on b.id=a.id;