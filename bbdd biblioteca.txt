CREATE DATABASE biblioteca_bbdd;

CREATE TABLE categorias (
	codigo int auto_increment primary key,
	nombre VARCHAR(50) UNIQUE
);

CREATE TABLE editoriales (
	nit VARCHAR(20) primary key,
	nombre VARCHAR(100) UNIQUE,
	telefono VARCHAR(15),
	direccion VARCHAR(100),
	email VARCHAR(100),
	sitioweb VARCHAR(100)
);

CREATE TABLE libros (
	isbn VARCHAR(20) primary key,
	titulo VARCHAR(100) not null,
	descripcion VARCHAR(255),
	nombre_autor VARCHAR(100),
	publicacion date,
	fecha_registro datetime,
	codigo_categoria int,
	nit_editorial VARCHAR(20),
	foreign key(codigo_categoria) references categorias(codigo),
	foreign key(nit_editorial) references editoriales(nit)
)