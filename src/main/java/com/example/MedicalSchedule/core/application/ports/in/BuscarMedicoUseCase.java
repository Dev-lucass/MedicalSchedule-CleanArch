package com.example.MedicalSchedule.core.application.ports.in;

import com.example.MedicalSchedule.core.domain.model.Medico;
import java.util.List;

public interface BuscarMedicoUseCase {
    public List<Medico> execute();
}
