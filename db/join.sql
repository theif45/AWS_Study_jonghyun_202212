SELECT 
    *
FROM
    library_mst;
    
SELECT 
    *
FROM
    author_mst;
    
select
    순번,
    도서관명,
    구분,
    도서명,
    저작자,
    (select
		author_name
	from
		author_mst
	where
		author_id = 저작자) as 저작자명,
	출판사,
    (select
		publisher_name
	from
		publisher_mst
	where
		publisher_id = 출판사) as 출판사명,
	 (select
		publisher_year
	from
		publisher_mst
	where
		publisher_id = 출판사) as 출판사설립일,
    발행연도,
    청구기호
from
	library_mst;

show profiles;

/*============================================================*/

insert into library_mst
values (0, '테스트도서관', '999(테스트)', '테스트도서명', '9999', '9999', '2023', '999.9-테99ㅌ');

-- inner 의 경우 on 내용의 조건이 맞는 경우에만 데이터를 출력하고 일치하지 않을 경우 출력하지 않음
-- left outer의 경우 기준 내용은 모두 출력하지만 조건에 해당하는 내용이 없을 경우 null값으로 출력함

-- 기준 데이터에서 교집합 데이터를 제외한 데이터를 출력
SELECT 
    *
FROM
    library_mst lm
        LEFT OUTER JOIN publisher_mst pm ON (pm.publisher_id = lm.출판사)
WHERE
    pm.publisher_id IS NULL
ORDER BY 
	lm.순번 DESC;

set profiling = 1;
set profiling_history_size = 30;

SELECT 
    lm.순번,
    lm.도서관명,
    lm.구분,
    lm.도서명,
    lm.출판사,
    pm.publisher_name,
    pm.publisher_year
FROM
    library_mst lm
	LEFT OUTER JOIN publisher_mst pm ON (pm.publisher_id = lm.출판사)
ORDER BY 
	lm.순번 DESC;
    
show profiles

 