package br.com.treina.recife.sgcm_api.model;

import java.time.LocalDateTime;

import br.com.treina.recife.sgcm_api.enums.StatusConsulta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_CONSULTA")

public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime dataHora;
    @Enumerated(EnumType.STRING)
    private StatusConsulta status;
    @Column(nullable = false)
    private String observacoes;
    @ManyToOne
    @JoinColumn(nullable = false, name = "medico_id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(nullable = false, name = "paciente_id")
    private Paciente paciente;
}
