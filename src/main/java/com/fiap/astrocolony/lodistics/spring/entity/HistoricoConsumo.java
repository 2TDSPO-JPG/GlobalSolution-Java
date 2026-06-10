package com.fiap.astrocolony.lodistics.spring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_HISTORICO_CONSUMO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistoricoConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsumo;

    private Double qtdConsumida;

    private LocalDateTime dataHoraConsumo;

    @ManyToOne
    @JoinColumn(name = "id_tripulante")
    @NotNull(message = "Informe o tripulante que está consumindo o alimento")
    private Tripulante tripulante;

    @ManyToOne
    @JoinColumn(name = "id_alimento")
    @NotNull(message = "Informe o alimento que está sendo consumido")
    private Alimento alimento;


    @PrePersist
    public void horaDoConsumo(){
        this.dataHoraConsumo = LocalDateTime.now();
    }

}