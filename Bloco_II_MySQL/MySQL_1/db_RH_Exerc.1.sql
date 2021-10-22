create database db_rh;
use db_rh;

create table tb_funcionario(
id_funcionario bigint  auto_increment,
nome varchar (35) not null,
email varchar(35) not null,
cargo varchar(35) not null,
salario decimal(10,2) not null,

primary key (id_funcionario)
);

insert into tb_funcionario(nome, email, cargo, salario) 
	values ("Dri", "dri@email.com", "Vendedor", 1100.00);
insert into tb_funcionario(nome, email, cargo, salario) 
	values ("Gustavo", "gustavo@email.com", "Gerente", 10000.00);
insert into tb_funcionario(nome, email, cargo, salario) 
	values ("Jeff", "email3@email.com","Supervisor", 3500.00);
insert into tb_funcionario(nome, email, cargo, salario) 
	values ("Leo", "email4@email.com", "Caixa", 1100.00);
insert into tb_funcionario(nome, email, cargo, salario) 
	values("Camilla", "email5@email.com", "TI", 4500.00);
 
select * from tb_funcionario;
 
select * from tb_funcionario where salario > 2000.00;

select * from tb_funcionario where salario < 2000.00;

update tb_funcionario set cargo = "Supervisor de TI", salario = 6000.00 where (id_funcionario = 5);



