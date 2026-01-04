package com.example.MedicalSchedule.core.application.ports.in;

import com.example.MedicalSchedule.core.domain.model.Medico;

public interface SalvarMedicoUseCase {
    public Medico execute(Medico medico);
}
