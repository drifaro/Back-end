create database db_escola;
use db_escola;

create table tb_alunes(
	id_alune bigint (4) auto_increment,
    nome varchar (30) not null,
    dt_nasc date,
    turma enum("Python", "Java", "Pascal"),
    formato enum ("R", "P"),
    nota real,
    stt boolean,
    
    primary key (id_alune)
    );
    
    desc tb_alunes;
    
    insert into tb_alunes (nome, dt_nasc, turma, formato, nota, stt)
	values("Maria",'1990-10-01', "Python", "R", 8.2, true),
			("João",'1992-05-26', "Java", "R", 9.0, false),
			("Judite",'1994-02-15', "Pascal", "P", 7.2, true),
			("Carlito",'1995-06-02', "Java", "p", 3.4, false),
			("Jubileu",'1993-12-10', "Python", "R", 5.6, true),
			("Nala",'1992-10-13', "Pascal", "R", 8.3, true);
	
    select * from tb_alunes;
        
	select * from tb_alunes where nota < 7;
    
    select * from tb_alunes where nota > 7;
    
    update tb_alunes set turma = "Java", nota = 7.2 where (id_alune = 5);
    

	

        
        
    
    

