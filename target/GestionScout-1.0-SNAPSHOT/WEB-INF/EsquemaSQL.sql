DROP TABLE Responsables;
DROP TABLE Scouts;
DROP TABLE Usuarios;
DROP TABLE Grupos;
DROP TABLE Users;
DROP TABLE Roles;

CREATE TABLE Grupos (
    id              INTEGER NOT NULL PRIMARY KEY,
    activo          BOOLEAN,
    nombre          VARCHAR(100),
    diocesana       VARCHAR(50),
    fecha_creacion  DATE,
    direccion       VARCHAR(50),
    cp              INTEGER,
    localidad       VARCHAR(50),
    provincia       VARCHAR(50),
    telefono        INTEGER,
    email           VARCHAR(50),
    web             VARCHAR(50)
);

create table Responsables (
    id          INTEGER NOT NULL PRIMARY KEY,
    usuario     VARCHAR(50),
    rol         VARCHAR(50),
    idgrupo     INTEGER,

CONSTRAINT FK_idGrupoResponsables FOREIGN KEY(idGrupo) REFERENCES Grupos ON DELETE CASCADE
);

CREATE TABLE Scouts (
    id          INTEGER NOT NULL PRIMARY KEY,
    nombre      VARCHAR(25),
    edad        INTEGER,
    sexo        BOOLEAN,
    idgrupo     INTEGER,

CONSTRAINT FK_idGrupoScouts FOREIGN KEY(idGrupo) REFERENCES Grupos ON DELETE CASCADE
);

CREATE TABLE Usuarios (
    id          INTEGER NOT NULL PRIMARY KEY,
    usuario     VARCHAR(50),
    pass        VARCHAR(50),
    idgrupo       INTEGER,

CONSTRAINT FK_idGrupoUsuarios FOREIGN KEY(idGrupo) REFERENCES Grupos ON DELETE CASCADE

);

CREATE TABLE Users (
    usuario     VARCHAR(50) NOT NULL PRIMARY KEY,
    clave       VARCHAR(50) NOT NULL 
);

CREATE TABLE Roles (
    usuario     VARCHAR(50) NOT NULL,
    rol         VARCHAR(50) NOT NULL
);

insert into Grupos values (1, TRUE, 'San Bartolomé', 'SCJA', '1992-09-15', 'Plaza San Bartolomé', 23004, 'Jaén', 'Jaén', 953123123, 'gscsanbartolome@gmail.com', 'scoutsanbartolome.es');
insert into Grupos values (2, TRUE, 'Al-Yabala', 'SCJA', '2005-10-20', 'Parroquia de Villares', 23400, 'Los Villares', 'Jaén', 953789789, 'gscalyabala@gmail.com', 'al-yabala.es');

insert into Usuarios values (1, 'dml',   '123', 1);
insert into Usuarios values (2, 'jfaf',  '555', 2);
insert into Usuarios values (3, 'af',    '666', 1);

insert into Users values ('dml',     '123');
insert into Users values ('jfaf',    '555');
insert into Users values ('af',      '666');

insert into Roles values ('dml',     'ADMINISTRADORES');
insert into Roles values ('jfaf',    'ADMINISTRADORES');
insert into Roles values ('af',      'USUARIOS');