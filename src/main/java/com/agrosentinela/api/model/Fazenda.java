package com.agrosentinela.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fazendas")
public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double areaTotal;

    // Getters e Setters (Mantém os que já tens ou gera de novo)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getAreaTotal() { return areaTotal; }
    public void setAreaTotal(double areaTotal) { this.areaTotal = areaTotal; }
}