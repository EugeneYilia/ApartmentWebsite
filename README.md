数据库房屋建表的建立
create table room(
area varchar(50),
country varchar(50),
property_status varchar(50),
property_type varchar(50),
bed int(50),
bathroom int(50),
price int(50))default charset=utf8;

对应地区与国家之间的对应的表的建立
create table area_country(
area varchar(50),
country varchar(50)
)default charset=utf8;

