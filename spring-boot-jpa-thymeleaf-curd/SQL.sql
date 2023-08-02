
CREATE TABLE user(
id bigint NOT NULL AUTO_INCREMENT,
age int NOT NULL,
password varchar(100) NOT NULL,
user_name varchar(100) NOT NULL,
PRIMARY KEY (id)
);

insert into user (age,password,user_name) values(20,'aaaaaaaaaaaaaaaaaaa','tony');
insert into user (age,password,user_name) values(21,'bbbbbbbbbbbbbbbbbbb','robin');
insert into user (age,password,user_name) values(22,'ccccccccccccccccccc','wouter');
insert into user (age,password,user_name) values(23,'ddddddddddddddddddd','amy');
insert into user (age,password,user_name) values(24,'eeeeeeeeeeeeeeeeeee','simon');
insert into user (age,password,user_name) values(25,'fffffffffffffffffff','lala');
insert into user (age,password,user_name) values(26,'ggggggggggggggggggg','tom');
insert into user (age,password,user_name) values(27,'hhhhhhhhhhhhhhhhhhh','lisa');
insert into user (age,password,user_name) values(28,'iiiiiiiiiiiiiiiiiii','juli');
insert into user (age,password,user_name) values(29,'jjjjjjjjjjjjjjjjjjj','eni');
insert into user (age,password,user_name) values(30,'kkkkkkkkkkkkkkkkkkk','yuehan');
insert into user (age,password,user_name) values(31,'lllllllllllllllllll','sim');
insert into user (age,password,user_name) values(32,'mmmmmmmmmmmmmmmmmmm','xiaohong');
insert into user (age,password,user_name) values(33,'nnnnnnnnnnnnnnnnnnn','xiaoming');

select * from user;

drop table user;




