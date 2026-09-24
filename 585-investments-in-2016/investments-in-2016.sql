# Write your MySQL query statement below
with temp as(

select i1.tiv_2016  from Insurance i1 left join Insurance i2
on i1.tiv_2015 = i2.tiv_2015 
where i1.pid <> i2.pid
and (i1.lat,i1.lon) not in 
(select lat,lon from Insurance
group by lat,lon
having count(pid)>1

)
group by i1.pid)
select round(sum(tiv_2016),2)tiv_2016  from temp;