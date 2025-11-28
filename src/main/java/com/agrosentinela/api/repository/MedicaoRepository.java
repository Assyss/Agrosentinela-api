package com.agrosentinela.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agrosentinela.api.model.medicao;

public interface MedicaoRepository extends JpaRepository<medicao, Long> {
    // O Spring é tão mágico que não precisamos escrever código aqui!
}