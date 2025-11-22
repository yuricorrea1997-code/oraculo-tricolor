package com.gremio.oraculo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_PALPITES")
public class Palpite {

    @Id
    // Configuração para usar a Sequence que criamos no Oracle
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_palpite_gen")
    @SequenceGenerator(name = "seq_palpite_gen", sequenceName = "SEQ_PALPITES", allocationSize = 1)
    private Long id;

    @Column(name = "ADVERSARIO")
    private String adversario;

    @Column(name = "GOLS_GREMIO")
    private Integer golsGremio;

    @Column(name = "GOLS_ADVERSARIO")
    private Integer golsAdversario;

    @Column(name = "DATA_JOGO")
    private LocalDate dataJogo;

    // --- Getters e Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getAdversario() { return adversario; }
    public void setAdversario(String adversario) { this.adversario = adversario; }
    
    public Integer getGolsGremio() { return golsGremio; }
    public void setGolsGremio(Integer golsGremio) { this.golsGremio = golsGremio; }
    
    public Integer getGolsAdversario() { return golsAdversario; }
    public void setGolsAdversario(Integer golsAdversario) { this.golsAdversario = golsAdversario; }
    
    public LocalDate getDataJogo() { return dataJogo; }
    public void setDataJogo(LocalDate dataJogo) { this.dataJogo = dataJogo; }
}