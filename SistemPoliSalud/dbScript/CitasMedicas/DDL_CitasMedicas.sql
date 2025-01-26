-- database: ../../database/db_CitasMedicas.db
DROP TABLE IF EXISTS Cita;

DROP TABLE IF EXISTS Disponibilidad;

DROP TABLE IF EXISTS Horarios;

DROP TABLE IF EXISTS Paciente;

DROP TABLE IF EXISTS Seguro;

DROP TABLE IF EXISTS Medico;

DROP TABLE IF EXISTS Sexo;

DROP TABLE IF EXISTS Especialidad;


CREATE TABLE
    Especialidad (
        IdEspecialidad INTEGER PRIMARY KEY AUTOINCREMENT,
        Nombre TEXT VARCHAR(50) NOT NULL UNIQUE,
        FechaCreacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        FechaModificacion DATETIME NOT NULL,
        Activo BOOLEAN NOT NULL DEFAULT 1
    );
CREATE TABLE Sexo(
    IDSexo          INTEGER  PRIMARY KEY AUTOINCREMENT,
    Descripcion     TEXT NOT NULL,
    Observacion     TEXT,
    FechaCrea       DATE NOT NULL,
    FechaModifica   DATE 
);
CREATE TABLE
    Medico (
        IdMedico INTEGER PRIMARY KEY AUTOINCREMENT,
        Nombre TEXT VARCHAR(50) NOT NULL,
        Apellido TEXT VARCHAR(50) NOT NULL,
        IDSexo         INTEGER REFERENCES Sexo(IDSexo),
        FechaNacimiento DATE NOT NULL,
        IdEspecialidad INTEGER NOT NULL REFERENCES Especialidad (IdEspecialidad),
        FechaCreacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        FechaModificacion DATETIME NOT NULL,
        Activo BOOLEAN NOT NULL DEFAULT 1
    );

CREATE TABLE
    Seguro (
        IdSeguro INTEGER PRIMARY KEY AUTOINCREMENT,
        Nombre TEXT VARCHAR(50) NOT NULL UNIQUE,
        FechaCreacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        FechaModificacion DATETIME NOT NULL,
        Activo BOOLEAN NOT NULL DEFAULT 1
    );

CREATE TABLE
    Paciente (
        IdPaciente INTEGER PRIMARY KEY AUTOINCREMENT,
        Nombre TEXT VARCHAR(50) NOT NULL,
        Apellido TEXT VARCHAR(50) NOT NULL,
        IDSexo         INTEGER REFERENCES Sexo(IDSexo),
        FechaNacimiento DATE NOT NULL,
        Celular TEXT VARCHAR(10) NOT NULL,
        Cedula TEXT VARCHAR(10) NOT NULL UNIQUE,
        Email TEXT VARCHAR(50) NOT NULL,
        IdSeguro INTEGER NOT NULL REFERENCES Seguro (IdSeguro),
        FechaCreacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        FechaModificacion DATETIME NOT NULL,
        Activo BOOLEAN NOT NULL DEFAULT 1
    );

CREATE TABLE
    Horarios (
        IdHorario INTEGER PRIMARY KEY AUTOINCREMENT,
        HoraInicio TIME NOT NULL,
        HoraFin TIME NOT NULL,
        FechaCreacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        FechaModificacion DATETIME NOT NULL,
        Activo BOOLEAN NOT NULL DEFAULT 1
    );

CREATE TABLE
    Disponibilidad (
        IdDisponibilidad INTEGER PRIMARY KEY AUTOINCREMENT,
        IdHorario INTEGER NOT NULL REFERENCES Horarios (IdHorario),
        IdMedico INTEGER NOT NULL REFERENCES Medico (IdMedico),
        FechaCreacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        FechaModificacion DATETIME NOT NULL,
        Activo BOOLEAN NOT NULL DEFAULT 1
    );

CREATE TABLE
    Cita (
        IdCita INTEGER PRIMARY KEY AUTOINCREMENT,
        IdPaciente INTEGER NOT NULL REFERENCES Paciente (IdPaciente),
        IdDisponibilidad INTEGER NOT NULL REFERENCES Disponibilidad (IdDisponibilidad),
        Fecha DATE NOT NULL,
        FechaCreacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        FechaModificacion DATETIME NOT NULL,
        IdMedico INTEGER NOT NULL REFERENCES Medico (IdMedico),
        Activo BOOLEAN NOT NULL DEFAULT 1
    );

