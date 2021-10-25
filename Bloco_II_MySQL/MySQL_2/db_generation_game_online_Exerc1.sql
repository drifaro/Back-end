create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe (
	id_classe bigint auto_increment, 
	tipo varchar (35) not null,
	vida int,
    
    primary key (id_classe)  
);

create table tb_personagem (
	id_personagem bigint(3) auto_increment, 
    nome varchar(35) not null,                 
    arma varchar (35) not null,   
	ult varchar (35) not null, 
    escudo int,
    
	key_classe bigint,
    primary key (id_personagem),       
    foreign key (key_classe) references tb_classe(id_classe) 
); 

select * from tb_classe; 

insert into tb_classe (tipo, vida) 
	values  ("Duelista", 100),    
			("Sentinela", 100),          
			("Controlador", 100),             
			("Iniciador", 100);    
            
select * from tb_personagem; 

insert into tb_personagem (nome, arma, ult, escudo, key_classe)
	values 	("Viper", "Judge", "Poço Peçonhento", 50, 3),
			("Reyna", "Spectre","Imperatriz", 0, 1),
			("Breach", "Vandal", "Trovão Giratório", 50, 4),
			("Sage", "Phantom", "Ressureição", 25, 2),
			("Omen", "Phantom", "Salto das Sombras", 50, 3),
            ("Jett", "Operator", "Tormenta de Aço", 25, 1),
            ("Skye", "Odin", "Rastreadores", 0, 4);

-- personagens com maior escudo (ou seja, com mais vida) decrescente/crescente
select * from tb_personagem where escudo order by escudo desc;
select * from tb_personagem where escudo order by escudo;
 
select * from tb_personagem where escudo > 25;
select * from tb_personagem where escudo between 10 and 30;

-- personagens que iniciam com a letra S
select * from tb_personagem where nome like "S%";


select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.key_classe
	order by id_personagem;

select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.key_classe 
	where tb_classe.tipo = "Duelista" 
	order by id_personagem;
    
select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.key_classe 
	where tb_classe.tipo = "Sentinela" 
	order by id_personagem;

select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.key_classe 
	where tb_classe.tipo = "Controlador" 
	order by id_personagem;
    
select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.key_classe 
	where tb_classe.tipo = "Iniciador" 
	order by id_personagem;
