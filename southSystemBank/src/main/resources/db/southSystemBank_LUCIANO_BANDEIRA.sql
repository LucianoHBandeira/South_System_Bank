
CREATE TABLE Pessoa(
	id bigint not null auto_increment,
	score integer not null,
	tipo varchar(2) not null,
    PRIMARY KEY(id)
);

CREATE TABLE pessoa_fisica(
	id bigint not null,
    cpf varchar(14) not null,
    FOREIGN KEY (id) REFERENCES pessoa(id)
);

CREATE TABLE pessoa_juridica(
	id bigint not null,
    cnpj varchar(14) not null,
    FOREIGN KEY (id) REFERENCES pessoa(id)
);

CREATE table Conta(
	id bigint not null auto_increment,
    id_pessoa bigint,
	agencia integer not null,
    numero integer not null,
	tipo varchar(1) not null,
    limite_cheque_especial double,
    limite_cartao_de_credito double,
    PRIMARY KEY(id),
    FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);

CREATE TABLE Limite(
	id bigint not null auto_increment,
	score integer not null,
    limite_cheque_especial double not null,
    limite_cartao_de_credito double not null,
    PRIMARY KEY(id)
);

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (0, 0,0 );

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (1,0 , 0);

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (2,1000 ,200 );

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (3,1000 ,200 );

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (4,1000 ,200);

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (5,1000 ,200);

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (6, 2000, 2000);

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (7,2000 , 2000);

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (8, 2000, 2000);

INSERT INTO Limite (score, limite_cheque_especial,limite_cartao_de_credito)
VALUES (9, 5000,15000 );


commit;



select * from Pessoa;
select * from pessoa_fisica; 
select * from pessoa_juridica; 
select * from Limite; 
select * from conta;

