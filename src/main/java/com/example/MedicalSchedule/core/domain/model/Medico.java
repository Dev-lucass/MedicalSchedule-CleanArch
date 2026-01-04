package com.example.MedicalSchedule.core.domain.model;

import com.example.MedicalSchedule.core.domain.enums.Especialidade;
import com.fasterxml.uuid.Generators;
import java.util.UUID;

public class Medico {

    private final UUID id;
    private String nome;
    private Integer idade;
    private final String cpf;
    private String email;
    private Especialidade especialidade;
    private boolean ativo;

    public Medico(String nome, Integer idade, String cpf, String email, Especialidade especialidade) {
        this.id = Generators.timeBasedEpochGenerator().generate();
        this.cpf = cpf;
        this.ativo = true;

        updateDados(nome, idade, email, especialidade);
        validar();
    }

    public Medico(UUID id, String nome, Integer idade, String cpf, String email, Especialidade especialidade, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.especialidade = especialidade;
        this.ativo = ativo;
        validar();
    }

    public void updateDados(String nome, Integer idade, String email, Especialidade especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.especialidade = especialidade;
        validar();
    }

    public void inativar() {
        this.ativo = false;
    }

    private void validar() {
        if (nome == null || nome.isBlank()) throw new RuntimeException("Nome inválido");
        if (idade == null || idade < 18) throw new RuntimeException("Médico deve ser maior de idade");
        if (email == null || !email.contains("@")) throw new RuntimeException("Email inválido");
    }

    public UUID getId() { return id; }
    public String getNome() { return nome; }
    public Integer getIdade() { return idade; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public Especialidade getEspecialidade() { return especialidade; }
    public boolean isAtivo() { return ativo; }
}