#primary key 주기
CREATE INDEX product_id on  product_mst(product_code);

show index from product_mst;

show full tables in db_study3 where table_type like 'VIEW';



#unique 주기
alter table product_mst
add unique product_name(product_name);

alter table product_mst
drop index product_name2;

#index 지우기
alter table product_mst
drop index product_id1;

	