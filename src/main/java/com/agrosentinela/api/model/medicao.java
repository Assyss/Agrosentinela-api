package com.agrosentinela.api.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_medicoes")
public class medicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora = LocalDateTime.now(); // Data automática
    private double temperatura;
    private double umidade;

    @ManyToOne
    @JoinColumn(name = "fazenda_id")
    private Fazenda fazenda;

    // --- GETTERS E SETTERS OBRIGATÓRIOS ---
    // Sem eles, o erro 400 acontece!
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    
    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
    
    public double getUmidade() { return umidade; }
    public void setUmidade(double umidade) { this.umidade = umidade; }
    
    public Fazenda getFazenda() { return fazenda; }
    public void setFazenda(Fazenda fazenda) { this.fazenda = fazenda; }
}