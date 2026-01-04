-- V1__criar_tabela_medico.sql

CREATE TABLE medicos (
    id UUID PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    idade INTEGER NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL UNIQUE,
    especialidade VARCHAR(50) NOT NULL,
    ativo BOOLEAN NOT NULL DEFAULT TRUE,

    CONSTRAINT chk_especialidade CHECK (especialidade IN (
        'CARDIOLOGIA',
        'DERMATOLOGIA',
        'GINECOLOGIA',
        'ORTOPEDIA',
        'PEDIATRIA',
        'NEUROLOGIA',
        'PSIQUIATRIA',
        'CLINICA_GERAL',
        'OFTALMOLOGIA',
        'ENDOCRINOLOGIA'
    ))
);