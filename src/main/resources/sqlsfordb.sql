CREATE DATABASE student;
USE student;


CREATE TABLE student (
	 id int NOT NULL AUTO_INCREMENT,
    first_name varchar(45) DEFAULT NULL,
	last_name varchar(45) DEFAULT NULL,
    email varchar(45) DEFAULT NULL,
	PRIMARY KEY (id)
) ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DELETE FROM Student WHERE ID>5;
