create database db_blog_pessoal;
use db_blog_pessoal;

CREATE TABLE `Temas` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`descricao` varchar(255),
	PRIMARY KEY (`id`)
);

CREATE TABLE `Postagens` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`titulo` varchar(255),
	`texto` varchar(1000),
	`data` TIMESTAMP NOT NULL,
	`id_tema` bigint,
	`id_usuario` bigint NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Usuário` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(255),
	`usuario` varchar(255),
	`senha` varchar(255),
	PRIMARY KEY (`id`)
);

ALTER TABLE `Postagens` ADD CONSTRAINT `Postagens_fk0` FOREIGN KEY (`id_tema`) REFERENCES `Temas`(`id`);

ALTER TABLE `Postagens` ADD CONSTRAINT `Postagens_fk1` FOREIGN KEY (`id_usuario`) REFERENCES `Usuário`(`id`);




