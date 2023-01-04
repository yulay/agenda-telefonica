--
-- Create schema AgendaTelefonica
--

CREATE DATABASE IF NOT EXISTS AgendaTelefonica;
USE AgendaTelefonica;

--
-- Definition of table `AgendaTelefonica`.`Persona`
--

DROP TABLE IF EXISTS `AgendaTelefonica`.`Persona`;
CREATE TABLE  `AgendaTelefonica`.`Persona` (
  `Id` int(10) unsigned NOT NULL auto_increment,
  `Nombres` varchar(100) collate utf8_spanish_ci NOT NULL,
  `Apellidos` varchar(100) collate utf8_spanish_ci NOT NULL,
  `Direccion` varchar(150) collate utf8_spanish_ci NOT NULL,
  `Departamento` enum('Boaco','Carazo','Chinandega','Chontales','Estelí','Granada','Jinotega','León','Madriz','Managua','Masaya','Matagalpa','Nueva Segovia','Rivas','Río San Juan','RAAN','RAAS') collate utf8_spanish_ci NOT NULL,
  `Municipio` varchar(50) collate utf8_spanish_ci NOT NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Definition of table `AgendaTelefonica`.`Telefono`
--

DROP TABLE IF EXISTS `AgendaTelefonica`.`Telefono`;
CREATE TABLE  `AgendaTelefonica`.`Telefono` (
  `Id` int(10) unsigned NOT NULL,
  `Tipo` enum('Casa','Fax','Movil','Oficina','Otro') collate utf8_spanish_ci NOT NULL default 'Casa',
  `Telefono` varchar(7) collate utf8_spanish_ci NOT NULL,
  PRIMARY KEY  USING BTREE (`Id`,`Tipo`),
  CONSTRAINT `Id-Telefono-Id-Persona` FOREIGN KEY (`Id`) REFERENCES `Persona` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idTelefono-idPersona` FOREIGN KEY (`Id`) REFERENCES `Persona` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idTelefono_idPersona` FOREIGN KEY (`Id`) REFERENCES `Persona` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci ROW_FORMAT=DYNAMIC;
