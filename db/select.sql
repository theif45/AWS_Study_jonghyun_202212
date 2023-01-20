/*================<< select >>================*/

select * from student_mst;

/* 전체 컬럼 조회 */
select
	*
from
	student_mst;
    
/* 지정 컬럼 조회 */
select
	student_id,
    student_name,
    mentor_id
from
	student_mst;
    
/* 임시 컬럼 추가 */
select
	1 as num,
    '김준일' as name;
    
select
	student_id,
    student_name,
    '김준일' as instructor_name
from
	student_mst;
    
/*  컬럼명을 임시로 바꾸는 방법 as(alias) 알리아스 */
/*  생략 가능하나 보통 컬럼에는 생략하지 않고 테이블은 생략함 */
/*  자바와의 변수명 매칭을 위해 사용 */
select
	sm.student_id as studentId
from
	student_mst sm;

/*  조회조건 where */
select
	*
from
	student_mst
where
	mentor_id = 1;
/*  서브쿼리 */
select
	*
from
	student_mst
where
	mentor_id = (select
					mentor_id
				from
					mentor_mst
				where
					mentor_name = '문자영');

select
	student_id,
    student_name,
    mentor_id,
    (select
		mentor_name 
	from
		mentor_mst 
	where
		mentor_id = student_mst.mentor_id) as mentor_name
from
	student_mst;

/* 그룹으로 묶어서 조회하기 */
/* 연산 시 사용 */
select
	count(mentor_id),
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
	mentor_id
from
	student_mst
group by
	mentor_id;
    
/* 중복 제거 */
select distinct
	mentor_id
from
	student_mst;

/* 그룹으로 조회한 결과에 조건주는 방법 */
select
	count(mentor_id) as mentor_count,
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
	mentor_id
from
	student_mst
group by
	mentor_id
/* group으로 묶인 것에 조건을 줄 때 사용*/
having
	mentor_count = 5;
    
/* 정렬 */
select
	*
from
	student_mst
/* 기본은 오름차순 정렬, desc를 사용시 내림차순 정렬 */
order by
	mentor_id,
    student_id desc;
    
/* 전체 조합 실습 */
select
	count(*) as student_count,
	mentor_id
from
	student_mst
where
	student_id > 2
group by
	mentor_id
having
	student_count = 1
order by
	mentor_id desc;
    
