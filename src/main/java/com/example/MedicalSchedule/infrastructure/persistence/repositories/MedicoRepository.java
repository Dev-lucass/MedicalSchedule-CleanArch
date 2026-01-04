package com.example.MedicalSchedule.infrastructure.persistence.repositories;

import com.example.MedicalSchedule.infrastructure.persistence.entities.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface MedicoRepository extends JpaRepository<MedicoEntity, UUID> {}
