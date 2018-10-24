drop table if exists questions;
create table questions(id int primary key, question varchar(255), answer1 varchar(255), answer2 varchar(255), answer3 varchar(255), answer4 varchar(255));
insert into questions values(1, 'Žalios spalvos bangos ilgis', '300nm', '400nm', '500nm', NULL);
insert into questions values(2, 'Kokios dalelės įeina į atomo branduolį', 'elektronas', 'mezonas', 'bizonas', 'kojotas');
insert into questions values(3, 'Kas suskaičiavo iki begalybės du kartus', 'Klintas EastWoodas', 'Alfa vyras', 'Vitalija Katunskytė', NULL);

drop table if exists answers;
create table answers(id int primary key, answer1 varchar(255), answer2 varchar(255),  answer3 varchar(255));