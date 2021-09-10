create database test;

use test;

create table customers (
    ID int(6) NOT NULL AUTO_INCREMENT,
    FirstName varchar(255),
    LastName varchar(255) NOT NULL,
    RewardPoints int,
    PRIMARY KEY (ID)
);

ALTER TABLE customers AUTO_INCREMENT=1;

insert into customers (FirstName, LastName, RewardPoints) VALUES ('Don', 'Dang', 200);
insert into customers (FirstName, LastName, RewardPoints) VALUES ('Dan', 'Vega', 9000);
insert into customers (FirstName, LastName, RewardPoints) VALUES ('Kate', 'Blue', 2000);
insert into customers (FirstName, LastName, RewardPoints) VALUES ('Bob', 'Smith', 500);
insert into customers (FirstName, LastName, RewardPoints) VALUES ('John', 'Red', 600);
insert into customers (FirstName, LastName, RewardPoints) VALUES ('Jim', 'Purple', 600);


create table education (
    EducationID int NOT NULL AUTO_INCREMENT,
    EducationLevel varchar(255),
    PRIMARY KEY (EducationID)
);

ALTER TABLE education AUTO_INCREMENT=1;

INSERT INTO education (EducationLevel) VALUES ("GED");
INSERT INTO education (EducationLevel) VALUES ("High School");
INSERT INTO education (EducationLevel) VALUES ("Associate's");
INSERT INTO education (EducationLevel) VALUES ("Bachelor's");
INSERT INTO education (EducationLevel) VALUES ("Master's");
INSERT INTO education (EducationLevel) VALUES ("Doctorate");

CREATE TABLE course (
    course_id int NOT NULL AUTO_INCREMENT,
    title varchar(80) NOT NULL,
    course_description varchar(500) NOT NULL,
    link varchar(255) NOT NULL,
    PRIMARY KEY (course_id)
);

create table education_relation (
    CustomerID int NOT NULL,
    EducationID int NOT NULL,
    FOREIGN KEY (CustomerID) REFERENCES customers(ID),
    FOREIGN KEY (EducationID) REFERENCES education(EducationID)
);

INSERT INTO education_relation (CustomerID, EducationID) VALUES (1, 1);
INSERT INTO education_relation (CustomerID, EducationID) VALUES (2, 2);
INSERT INTO education_relation (CustomerID, EducationID) VALUES (3, 2);
INSERT INTO education_relation (CustomerID, EducationID) VALUES (3, 3);
INSERT INTO education_relation (CustomerID, EducationID) VALUES (3, 4);
INSERT INTO education_relation (CustomerID, EducationID) VALUES (4, 2);
INSERT INTO education_relation (CustomerID, EducationID) VALUES (5, 2);
INSERT INTO education_relation (CustomerID, EducationID) VALUES (6, 5);
INSERT INTO education_relation (CustomerID, EducationID) VALUES (6, 6);

create table orders (
    OrderID int NOT NULL AUTO_INCREMENT,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES customers(ID)
);

ALTER TABLE orders AUTO_INCREMENT=1;

INSERT INTO orders(OrderNumber, PersonID) values (10, 1);
INSERT INTO orders(OrderNumber, PersonID) values (20, 2);
INSERT INTO orders(OrderNumber, PersonID) values (30, 3);
INSERT INTO orders(OrderNumber, PersonID) values (40, 4);
INSERT INTO orders(OrderNumber, PersonID) values (50, 5);
INSERT INTO orders(OrderNumber, PersonID) values (60, 6);
