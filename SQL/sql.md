[Revising the Select Query I](hackerrank.com/challenges/revising-the-select-query/problem?isFullScreen=false)
select * from city where population >100000 and countrycode = 'USA';

[Revising the Select Query II](https://www.hackerrank.com/challenges/revising-the-select-query-2/problem?isFullScreen=false)
select name from city where countrycode ='USA' and population >120000;

[Select All](https://www.hackerrank.com/challenges/select-all-sql/problem?isFullScreen=false)
select id,name,countrycode,district,population from city;

[Select By ID](https://www.hackerrank.com/challenges/select-by-id/problem?isFullScreen=false)
select * from city where id =1661;

[Japanese Cities' Attributes](https://www.hackerrank.com/challenges/japanese-cities-attributes/problem?isFullScreen=false)
select * from city where countrycode ='JPN';

[Japanese Cities' Names](https://www.hackerrank.com/challenges/japanese-cities-name/problem?isFullScreen=false)
select name from city where countrycode ='JPN';

[Weather Observation Station 1](https://www.hackerrank.com/challenges/weather-observation-station-1/problem?isFullScreen=false)
select city,state from station;

[Weather Observation Station 3](https://www.hackerrank.com/challenges/weather-observation-station-3/problem?isFullScreen=false)
select DISTINCT(city) from (select city, ID row_id from station) where mod(row_id ,2)=0 order by city;

[Weather Observation Station 4](https://www.hackerrank.com/challenges/weather-observation-station-4/problem?isFullScreen=false)

select count(*) - count(distinct(city)) from station;

