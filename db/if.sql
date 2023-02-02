SELECT 
	순번,
    도서관명,
    구분,
    도서명,
    저작자,
    출판사,
    발행연도,
    case
		when 발행연도 is null then '2050'
        when 발행연도 = '' then '2090'
        else 발행연도
    end as 발행연도1,
    if(ifnull(발행연도, '') = '', '2023', 발행연도) as 발행연도2,
    #두개의 값이 같으면 null을 리턴
    nullif(발행연도, '') as 발행연도3,
    #자바의 삼항연산자처럼 사용
    if(청구기호 = '', '기호없음', 청구기호) as 청구기호
FROM 
	library_mst
where
	#%는 여러개, _는 와일드카드로 특정위치를 지정
	# 발행연도 like '200_';
	# null일때만 is를 사용 
    # 발행연도 is not null;
    not 발행연도 = '';
    
update library_mst
set
	발행연도 = ''
where
	발행연도 = '2009';