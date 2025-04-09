
CREATE DATABASE IF NOT EXISTS proyectoPrimero;
USE proyectoPrimero;

CREATE TABLE IF NOT EXISTS usuarios (
    usuario VARCHAR(50) PRIMARY KEY,
    clave VARCHAR(100) NOT NULL
);

-- Usuario de prueba
INSERT INTO usuarios (usuario, clave) VALUES ('usuario', 'usuario1234')
ON DUPLICATE KEY UPDATE clave = 'usuario1234';

INSERT INTO usuarios (usuario, clave) VALUES ('usuario2', 'usuario1234')
ON DUPLICATE KEY UPDATE clave = 'usuario1234';

select clave from usuarios where usuario = 'usuario2';

select * from usuarios
