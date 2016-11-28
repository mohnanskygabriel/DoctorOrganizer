CREATE TABLE pazprojekt.doctor
(
id INT NOT NULL auto_increment,
name VARCHAR(10) NOT NULL,
surname VARCHAR(15) NOT NULL,
academic_degree VARCHAR(10) NOT NULL,
email VARCHAR(15) NOT NULL,
password VARCHAR(15) NOT NULL,
PRIMARY KEY (id)
)
;

CREATE TABLE pazprojekt.patient
(
id INT NOT NULL auto_increment,
name VARCHAR(10) NOT NULL,
surname VARCHAR(15) NOT NULL,
adress VARCHAR(100) NOT NULL,
date_of_birth DATE NOT NULL,
id_number BIGINT NOT NULL,
insured_at VARCHAR(15) NOT NULL,
phone_number BIGINT NOT NULL,
email VARCHAR(15) NOT NULL,
password VARCHAR(15) NOT NULL,
PRIMARY KEY (id)
)
;

CREATE TABLE pazprojekt.doctor_office
(
id INT NOT NULL auto_increment,
city VARCHAR(10) NOT NULL,
street VARCHAR(15) NOT NULL,
house_number INT NOT NULL,
hospital VARCHAR(15) NOT NULL,
specialization VARCHAR(10) NOT NULL,
opening_hours VARCHAR(10) NOT NULL,
phone_number BIGINT NOT NULL,
id_doctor INT NOT NULL,
PRIMARY KEY (id)
)
;

CREATE TABLE pazprojekt.term
(
id INT NOT NULL auto_increment,
id_patient INT NOT NULL,
id_doctor_office INT NOT NULL,
date DATE NOT NULL,
reason VARCHAR(100),
term_condition ENUM('schválený', 'neschválený', 'zrušený lekárom', 'zrušený pacientom'),
PRIMARY KEY (id)
)
;

ALTER TABLE doctor_office ADD FOREIGN KEY (id_doctor) REFERENCES doctor(id);
ALTER TABLE term ADD FOREIGN KEY (id_doctor_office) REFERENCES doctor_office(id);
ALTER TABLE term ADD FOREIGN KEY (id_patient) REFERENCES patient(id);

INSERT INTO doctor
VALUES
(1, 'Patrik', 'Rojek', 'MUDr.', 'aaa@gmail.com', '0000'),
(2, 'Gabriel', 'Mohňanský', 'MUDr.', 'bbb@gmail.com', '1234')
;

INSERT INTO patient
VALUES
(1, 'Marián', 'Babic', 'Jesenná 5, 040 01 Košice', '1985-12-12', '8512127987', 'VZP', '0911222333','ccc@gmail.com', '0000'),
(2, 'Gabriel', 'Mohňanský', 'Jesenná 5, 040 01 Košice', '1989-12-12', '8912127864', 'VZP', '0911555666','ddd@gmail.com', '1234')
;

INSERT INTO doctor_office
VALUES
(1, 'Košice', 'Jesenná', '5', 'nemocnicaXY', 'Ortopédia', '8:00-17:00', '0911777888', 2),
(2, 'Košice', 'Jesenná', '5', 'nemocnicaYZ', 'Neurológia', '9:00-12:30','0911999666', 1)
;

INSERT INTO term
VALUES
(1, 1, 2, '2016-11-27', 'bla bla bla', 'neschválený'),
(2, 2, 1, '2016-11-28', 'bla bla bla', 'schválený')
;