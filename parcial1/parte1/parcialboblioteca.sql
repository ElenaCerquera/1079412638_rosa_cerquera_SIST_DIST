
CREATE DATABASE BibliotecaRosa;

USE BibliotecaRosa;

-- Creación de tablas
CREATE TABLE UsuarioBiblioteca (
    UsuarioID INT PRIMARY KEY,
    NombreUser VARCHAR(50),
    TipoUser VARCHAR(20) CHECK (TipoUser IN ('Administrador', 'Visitante'))
);

CREATE TABLE SalaVisitante (
    SalaID INT PRIMARY KEY,
    NombreVisitante VARCHAR(50)
);

CREATE TABLE LibroPrestado (
    LibroID INT PRIMARY KEY,
    TituloLibro VARCHAR(100),
    CategoriaLibro VARCHAR(50),
    SalaID INT,
    FOREIGN KEY (SalaID) REFERENCES SalaVisitante(SalaID)
);

CREATE TABLE PrestamoLibro (
    PrestamoID INT PRIMARY KEY,
    UsuarioID INT,
    LibroID INT,
    FechaPrestamoLibro DATE,
    FechaDevolucionLibro DATE,
    FOREIGN KEY (UsuarioID) REFERENCES UsuarioBiblioteca(UsuarioID),
    FOREIGN KEY (LibroID) REFERENCES LibroPrestado(LibroID)
);

INSERT INTO UsuarioBiblioteca (UsuarioID, NombreUser, TipoUser) VALUES
(1, 'AdminRosa', 'Administrador'),
(2, 'VisitanteRosa1', 'Visitante'),
(3, 'VisitanteRosa2', 'Visitante');

INSERT INTO SalaVisitante (SalaID, NombreVisitante) VALUES
(1, 'Sala Rosa1'),
(2, 'Sala Rosa2'),
(3, 'Sala Rosa3');

INSERT INTO LibroPrestado (LibroID, TituloLibro, CategoriaLibro, SalaID) VALUES
(101, 'LibroRosa1', 'Ficción', 1),
(102, 'LibroRosa2', 'No Ficción', 2),
(103, 'LibroRosa3', 'Misterio', 3);

INSERT INTO PrestamoLibro (PrestamoID, UsuarioID, LibroID, FechaPrestamoLibro, FechaDevolucionLibro) VALUES
(201, 2, 101, '2024-01-18', '2024-02-01'),
(202, 3, 102, '2024-01-20', '2024-02-05'),
(203, 2, 103, '2024-01-22', NULL);
