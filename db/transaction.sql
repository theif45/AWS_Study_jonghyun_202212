show variables like 'AUTOCOMMIT';
set autocommit = 0;

#transaction 시작
start transaction;

#원하는 저장지점을 정함
savepoint sp3;

insert into user_mst
values (0, 'jjj', '1234', '김준일', 'jjj@gmail.com');

select * from user_mst;

#명령을 실행하기 전으로 돌림
rollback to sp1;

#transaction을 끝냄
commit;