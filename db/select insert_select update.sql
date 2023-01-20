select
	*
from
	library_mst
where
/* like는 %~% 사이의 문자열을 포함한 데이터를 가져옴*/
/* in, like를 같이 쓰기 위해선 or를 사용*/
	도서명 like '%나를%';
    
/*================<< select insert >>======================*/
insert into author_mst
	(author_name)
select distinct
	저작자
from
	library_mst
order by
	저작자;
    
select
	*
from
	author_mst;
    
insert into publisher_mst
	(publisher_name)
select distinct
	출판사
from
	library_mst
order by
	출판사;
    
select
	*
from
	publisher_mst;
/*================<< select update >>======================*/

SET SQL_SAFE_UPDATES = 0;

update
	library_mst , author_mst
set 
	저작자 = author_id
where
	저작자 = author_name;

select
	*
from
	library_mst;
    
update
	library_mst, publisher_mst
set 
	출판사 = publisher_id
where
	출판사 = publisher_name;

select
	*
from
	library_mst;
    
select
	*
from
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)
    left outer join publisher_mst pm on(pm.publisher_id = lm.출판사);
    
/*======================================================*/

select * from author_mst;

set profiling = 1;
set profiling_history_size = 30;

select 
	lm.도서관명,
    lm.도서명
from
	library_mst lm
where
	lm.저작자 in (select 
					author_id
				from
					author_mst am
				where
					am.author_name like '%김주%'
				or 	am.author_name like '%김민%');
                    
show profiles;

select 
	lm.도서관명,
    lm.도서명
from
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)
where
	am.author_name like '%김주%';
