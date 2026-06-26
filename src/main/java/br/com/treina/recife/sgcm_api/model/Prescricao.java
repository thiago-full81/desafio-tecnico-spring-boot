package br.com.treina.recife.sgcm_api.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_PRESCRICAO")
public class Prescricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String medicamentos;
    @Column(nullable = false)
    private LocalDate dataEmissao;
    @OneToOne
    @JoinColumn(nullable = false, name = "consulta_id")
    private Consulta consulta;
}
