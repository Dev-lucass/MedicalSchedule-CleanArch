package com.example.MedicalSchedule.core.application.ports.out;

import com.example.MedicalSchedule.core.domain.model.Medico;
import java.util.List;

public interface MedicoRepositoryPort {
    Medico salvar(Medico medico);
    List<Medico> buscar();
}
