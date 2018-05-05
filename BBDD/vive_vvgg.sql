CREATE Database vive_valle_grande;

CREATE OR REPLACE TABLE tb_empresa (
	id int(20) NOT NULL AUTO_INCREMENT,
	nombre varchar(100) DEFAULT NULL,
	rubro varchar(100) DEFAULT NULL,
	pagina_web varchar(100) DEFAULT NULL,
	tags varchar(100) DEFAULT NULL,
	descripcion varchar(100) DEFAULT NULL,
	PRIMARY KEY (id),
  	KEY (id)
);