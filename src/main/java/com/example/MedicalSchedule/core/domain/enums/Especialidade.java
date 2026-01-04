package com.example.MedicalSchedule.core.domain.enums;

public enum Especialidade {
    CARDIOLOGIA("Cardiologia"),
    DERMATOLOGIA("Dermatologia"),
    GINECOLOGIA("Ginecologia"),
    ORTOPEDIA("Ortopedia"),
    PEDIATRIA("Pediatria"),
    NEUROLOGIA("Neurologia"),
    PSIQUIATRIA("Psiquiatria"),
    CLINICA_GERAL("Clínica Geral"),
    OFTALMOLOGIA("Oftalmologia"),
    ENDOCRINOLOGIA("Endocrinologia");

    private final String descricao;

    Especialidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Especialidade deString(String texto) {
        for (Especialidade e : Especialidade.values()) {
            if (e.name().equalsIgnoreCase(texto)) {
                return e;
            }
        }
        throw new IllegalArgumentException("Especialidade inválida: " + texto);
    }
}