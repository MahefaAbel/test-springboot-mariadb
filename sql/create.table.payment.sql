CREATE TABLE payment( 
	id INT NOT NULL AUTO_INCREMENT,
	descr VARCHAR(100) NOT NULL,
	status ENUM('Attente','Validé') NOT NULL,
	PRIMARY KEY ( id )
);