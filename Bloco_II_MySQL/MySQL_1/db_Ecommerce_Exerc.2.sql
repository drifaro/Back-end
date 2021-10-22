create database db_ecommerce;

use db_ecommerce;

create table tb_produto(
id_produto bigint auto_increment,
nome varchar(35),
marca varchar(35),
departamento varchar(35),
preco decimal(10,2),

primary key (id_produto)
);

select * from tb_produto;

insert into tb_produto (nome, marca, departamento, preco)
	values("Batata Palha Tradicional", "Yoki", "Mercearia",3.99);
insert into tb_produto (nome, marca, departamento, preco)
	values("Filé Mignon 1kg", "Friboi", "Açougue", 90.00);
insert into tb_produto (nome, marca, departamento, preco)
	values("Energético Monster Energy", "Monster", "Bebida",6.49);
insert into tb_produto (nome, marca, departamento, preco)
	values("Arroz 5kg", "Tio João", "Mercearia", 24.39);
insert into tb_produto (nome, marca, departamento, preco)
	values("Refrigerante de cola", "Coca-Cola", "Bebida",6.98);
insert into tb_produto (nome, marca, departamento, preco)
	values("Refrigerante de cola", "Pepsi", "Bebida",5.50);
insert into tb_produto (nome, marca, departamento, preco)
	values("Máquina de Lavar 10kg", "Brastemp", "Eletro",1300.00);

select * from tb_produto where preco > 500.00;

select * from tb_produto where preco < 500.00;

update tb_produto set preco = 100.00 where (id_produto = 2);

    
