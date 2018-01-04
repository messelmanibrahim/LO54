USE LO54;

SET FOREIGN_KEY_CHECKS = 0;  
truncate course_session;
truncate client;
truncate course;
truncate location;
SET FOREIGN_KEY_CHECKS = 1;

-- ************ Courses ***************
insert into course(code, title) values("LO54","Java Enterprise Applications Architectures and Development Frameworks");
insert into course(code, title) values("LO51","Administration des bases de données");
insert into course(code, title) values("BD51","Business intelligence & data warehouse");
insert into course(code, title) values("IA54","Systèmes multi-agents et résolution distribuée de problèmes");
insert into course(code, title) values("LO43","Bases fondamentales de la programmation orientée objet");

-- ************ Locations ***************
insert into location(city) values("Belfort");
insert into location(city) values("Paris");
insert into location(city) values("Toulouse");
insert into location(city) values("Lyon");
insert into location(city) values("Strasbourg");

-- ************ Courses Sessions ***************
insert into course_session(start,end,location_id,course_code) values('2017-12-01','2018-05-01',1,"BD51");
insert into course_session(start,end,location_id,course_code) values('2018-01-01','2018-05-01',2,"LO54");
insert into course_session(start,end,location_id,course_code) values('2018-02-15','2018-07-01',3,"LO51");
insert into course_session(start,end,location_id,course_code) values('2018-03-20','2018-09-01',4,"LO43");
insert into course_session(start,end,location_id,course_code) values('2018-04-05','2018-11-01',5,"IA54");
insert into course_session(start,end,location_id,course_code) values('2017-12-01','2018-05-01',5,"BD51");
insert into course_session(start,end,location_id,course_code) values('2018-01-01','2018-05-01',4,"LO54");
insert into course_session(start,end,location_id,course_code) values('2018-02-15','2018-07-01',3,"LO51");
insert into course_session(start,end,location_id,course_code) values('2018-03-20','2018-09-01',2,"LO43");
insert into course_session(start,end,location_id,course_code) values('2018-04-05','2018-11-01',1,"IA54");

-- ************ Clients ***************

INSERT INTO client(LASTNAME, FIRSTNAME, ADDRESS, PHONE, EMAIL, SESSION_ID) 
VALUES ("YASSINE", "Mohamad", "90000 Belfort", "06 12 34 56 78", "mohamad.yassine@utbm.fr", 1);

INSERT INTO client(LASTNAME, FIRSTNAME, ADDRESS, PHONE, EMAIL, SESSION_ID) 
VALUES ("MESSELMANI", "Ibrahim", "90000 Belfort", "07 45 65 87 21","ibrahim.messelmani@utbm.fr", 1);
