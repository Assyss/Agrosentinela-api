package com.agrosentinela.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agrosentinela.api.model.Fazenda;

// Atenção: Aqui deve estar escrito 'interface', não 'class'!
// extends JpaRepository<Entidade, TipoDoId>
public interface FazendaRepository extends JpaRepository<Fazenda, Long> {

}