package com.example.MedicalSchedule.infrastructure.persistence.adapters;

import com.example.MedicalSchedule.core.application.ports.out.MedicoRepositoryPort;
import com.example.MedicalSchedule.core.domain.model.Medico;
import com.example.MedicalSchedule.infrastructure.persistence.repositories.MedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicoPersistenceAdapter implements MedicoRepositoryPort {

    private final MedicoRepository repository;

    @Override
    public Medico salvar(Medico medico) {
        return null;
    }

    @Override
    public List<Medico> buscar() {
        return List.of();
    }
}
