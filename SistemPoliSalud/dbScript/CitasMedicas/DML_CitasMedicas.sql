--database: ../../database/db_CitasMedicas.db
INSERT INTO
    Especialidad (Nombre, FechaModificacion)
VALUES
    ('Cardiologia', CURRENT_TIMESTAMP),
    ('Dermatologia', CURRENT_TIMESTAMP),
    ('Ginecologia', CURRENT_TIMESTAMP),
    ('Oftalmologia', CURRENT_TIMESTAMP),
    ('Otorrinolaringologia', CURRENT_TIMESTAMP),
    ('Pediatria', CURRENT_TIMESTAMP),
    ('Psiquiatria', CURRENT_TIMESTAMP),
    ('Traumatologia', CURRENT_TIMESTAMP);

INSERT INTO
    Medico (
        Nombre,
        Apellido,
        FechaNacimiento,
        IdEspecialidad,
        FechaModificacion
    )
VALUES
    (
        'Juan',
        'Perez',
        '1980-01-01',
        1,
        current_timestamp
    ),
    (
        'Maria',
        'Gonzalez',
        '1985-01-01',
        2,
        current_timestamp
    ),
    (
        'Pedro',
        'Rodriguez',
        '1990-01-01',
        3,
        current_timestamp
    ),
    (
        'Ana',
        'Lopez',
        '1995-01-01',
        4,
        current_timestamp
    ),
    (
        'Carlos',
        'Martinez',
        '2000-01-01',
        5,
        current_timestamp
    ),
    (
        'Sofia',
        'Hernandez',
        '2005-01-01',
        6,
        current_timestamp
    ),
    (
        'Luis',
        'Diaz',
        '2010-01-01',
        7,
        current_timestamp
    ),
    (
        'Laura',
        'Torres',
        '2015-01-01',
        8,
        current_timestamp
    );

INSERT INTO
    Seguro (Nombre, FechaModificacion)
VALUES
    ('ARS Humano', current_timestamp),
    ('ARS Palic', current_timestamp),
    ('ARS Universal', current_timestamp),
    ('ARS Monumental', current_timestamp),
    ('ARS Primera', current_timestamp);

INSERT INTO
    Paciente (
        Nombre,
        Apellido,
        FechaNacimiento,
        Celular,
        Cedula,
        Email,
        IdSeguro,
        FechaModificacion
    )
VALUES
    (
        'Jose',
        'Martinez',
        '1980-01-01',
        '8095555555',
        '1234569874',
        'josem@gmail.com',
        1,
        CURRENT_TIMESTAMP
    ),
    (
        'Pedro',
        'Ramirez',
        '1985-06-01',
        '8095555560',
        '1234569879',
        'pedror@gmail.com',
        1,
        CURRENT_TIMESTAMP
    ),
    (
        'Lucia',
        'Mendez',
        '1986-07-01',
        '8095555561',
        '1234569880',
        'luciam@gmail.com',
        2,
        CURRENT_TIMESTAMP
    ),
    (
        'Miguel',
        'Ortiz',
        '1987-08-01',
        '8095555562',
        '1234569881',
        'miguelor@gmail.com',
        3,
        CURRENT_TIMESTAMP
    ),
    (
        'Elena',
        'Morales',
        '1988-09-01',
        '8095555563',
        '1234569882',
        'elenam@gmail.com',
        4,
        CURRENT_TIMESTAMP
    ),
    (
        'Jorge',
        'Vargas',
        '1989-10-01',
        '8095555564',
        '1234569883',
        'jorgev@gmail.com',
        5,
        CURRENT_TIMESTAMP
    ),
    (
        'Carmen',
        'Ramos',
        '1990-11-01',
        '8095555565',
        '1234569884',
        'carmenr@gmail.com',
        1,
        CURRENT_TIMESTAMP
    ),
    (
        'Raul',
        'Castro',
        '1991-12-01',
        '8095555566',
        '1234569885',
        'raulc@gmail.com',
        2,
        CURRENT_TIMESTAMP
    ),
    (
        'Patricia',
        'Jimenez',
        '1992-01-01',
        '8095555567',
        '1234569886',
        'patriciaj@gmail.com',
        3,
        CURRENT_TIMESTAMP
    ),
    (
        'Andres',
        'Gomez',
        '1993-02-01',
        '8095555568',
        '1234569887',
        'andresg@gmail.com',
        4,
        CURRENT_TIMESTAMP
    ),
    (
        'Laura',
        'Diaz',
        '1994-03-01',
        '8095555569',
        '1234569888',
        'laurad@gmail.com',
        5,
        CURRENT_TIMESTAMP
    ),
    (
        'Fernando',
        'Soto',
        '1995-04-01',
        '8095555570',
        '1234569889',
        'fernandos@gmail.com',
        1,
        CURRENT_TIMESTAMP
    ),
    (
        'Isabel',
        'Reyes',
        '1996-05-01',
        '8095555571',
        '1234569890',
        'isabelr@gmail.com',
        2,
        CURRENT_TIMESTAMP
    ),
    (
        'Ricardo',
        'Herrera',
        '1997-06-01',
        '8095555572',
        '1234569891',
        'ricardoh@gmail.com',
        3,
        CURRENT_TIMESTAMP
    ),
    (
        'Monica',
        'Castillo',
        '1998-07-01',
        '8095555573',
        '1234569892',
        'monicac@gmail.com',
        4,
        CURRENT_TIMESTAMP
    ),
    (
        'Victor',
        'Rojas',
        '1999-08-01',
        '8095555574',
        '1234569893',
        'victorr@gmail.com',
        5,
        CURRENT_TIMESTAMP
    ),
    (
        'Silvia',
        'Guerrero',
        '2000-09-01',
        '8095555575',
        '1234569894',
        'silviag@gmail.com',
        1,
        CURRENT_TIMESTAMP
    ),
    (
        'Alberto',
        'Molina',
        '2001-10-01',
        '8095555576',
        '1234569895',
        'albertom@gmail.com',
        2,
        CURRENT_TIMESTAMP
    ),
    (
        'Rosa',
        'Navarro',
        '2002-11-01',
        '8095555577',
        '1234569896',
        'rosan@gmail.com',
        3,
        CURRENT_TIMESTAMP
    ),
    (
        'Daniel',
        'Vega',
        '2003-12-01',
        '8095555578',
        '1234569897',
        'danielv@gmail.com',
        4,
        CURRENT_TIMESTAMP
    ),
    (
        'Angela',
        'Campos',
        '2004-01-01',
        '8095555579',
        '1234569898',
        'angelac@gmail.com',
        5,
        CURRENT_TIMESTAMP
    );

INSERT INTO
    Horarios (HoraInicio, HoraFin, FechaModificacion)
VALUES
    ('08:00:00', '09:00:00', current_timestamp),
    ('09:00:00', '10:00:00', current_timestamp),
    ('10:00:00', '11:00:00', current_timestamp),
    ('11:00:00', '12:00:00', current_timestamp),
    ('12:00:00', '13:00:00', current_timestamp),
    ('13:00:00', '14:00:00', current_timestamp),
    ('14:00:00', '15:00:00', current_timestamp),
    ('15:00:00', '16:00:00', current_timestamp),
    ('16:00:00', '17:00:00', current_timestamp);

INSERT INTO
    Disponibilidad (IdHorario, IdMedico, FechaModificacion)
VALUES
    (1, 1, current_timestamp),
    (2, 1, current_timestamp),
    (3, 3, current_timestamp),
    (4, 1, current_timestamp),
    (5, 1, current_timestamp),
    (6, 1, current_timestamp),
    (7, 4, current_timestamp),
    (8, 1, current_timestamp),
    (9, 1, current_timestamp),
    (1, 2, current_timestamp),
    (2, 5, current_timestamp),
    (3, 2, current_timestamp),
    (4, 2, current_timestamp),
    (5, 6, current_timestamp),
    (6, 2, current_timestamp),
    (7, 5, current_timestamp),
    (8, 2, current_timestamp),
    (9, 2, current_timestamp);

INSERT INTO
    Cita (
        IdPaciente,
        IdDisponibilidad,
        Fecha,
        FechaModificacion,
        IdMedico
    )
VALUES
    (1, 1, '2021-10-01', current_timestamp, 1),
    (1, 1, '2021-10-02', current_timestamp, 1),
    (1, 1, '2021-10-03', current_timestamp, 1),
    (1, 1, '2021-10-04', current_timestamp, 1),
    (1, 1, '2021-10-05', current_timestamp, 1),
    (1, 1, '2021-10-06', current_timestamp, 1),
    (1, 1, '2021-10-07', current_timestamp, 1),
    (1, 1, '2021-10-08', current_timestamp, 1),
    (1, 1, '2021-10-09', current_timestamp, 1),
    (1, 2, '2021-10-10', current_timestamp, 2),
    (1, 2, '2021-10-11', current_timestamp, 2),
    (1, 2, '2021-10-12', current_timestamp, 2),
    (1, 2, '2021-10-13', current_timestamp, 2),
    (1, 2, '2021-10-14', current_timestamp, 2),
    (1, 2, '2021-10-15', current_timestamp, 2),
    (1, 2, '2021-10-16', current_timestamp, 2),
    (1, 2, '2021-10-17', current_timestamp, 2),
    (1, 2, '2021-10-18', current_timestamp, 2),
    (1, 2, '2021-10-19', current_timestamp, 2);
