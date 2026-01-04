package com.example.MedicalSchedule.infrastructure.persistence.entities;

import com.example.MedicalSchedule.core.domain.enums.Especialidade;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.UUID;

@Entity
@Getter
@Table(name = "medico")
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicoEntity {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer idade;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Especialidade especialidade;

    @Column(nullable = false)
    private boolean ativo;
}