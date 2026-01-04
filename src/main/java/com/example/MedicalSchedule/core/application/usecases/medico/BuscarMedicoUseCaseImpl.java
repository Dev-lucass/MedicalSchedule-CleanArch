package com.example.MedicalSchedule.core.application.usecases.medico;

import com.example.MedicalSchedule.core.application.ports.in.BuscarMedicoUseCase;
import com.example.MedicalSchedule.core.domain.model.Medico;
import java.util.List;

public class BuscarMedicoUseCaseImpl implements BuscarMedicoUseCase {
    @Override
    public List<Medico> execute() {
        return List.of();
    }
}
