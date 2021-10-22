create database db_acervo35;
drop database db_acervo35;

use db_acervo35;
create table tb_usuario(
id_usuario bigint  auto_increment,
nome varchar (255) not null,
email varchar(255) not null,
data_nascimento date,
senha varchar(255) not null,

primary key (id_usuario)
);

select * from tb_usuario; -- exibir tabela

insert into tb_usuario (nome, email, data_nascimento, senha)
	values ("Lissa", "email@email.com", '1995-01-30', "123456");
    
delete from tb_usuario where id_usuario = 1; -- deleta a linha

update tb_usuario set senha = '987654' where (id_usuario = '1'); -- atualizar linha

alter table tb_usuario add livro varchar(30); -- adicionar coluna



