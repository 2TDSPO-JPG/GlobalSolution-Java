package com.fiap.astrocolony.lodistics.spring.repository;

import com.fiap.astrocolony.lodistics.spring.dto.TripulanteDto;
import com.fiap.astrocolony.lodistics.spring.entity.Tripulante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TripulanteRepository extends JpaRepository<Tripulante, Long> {
    List<TripulanteDto> findTripulanteByMissao_IdMissao(Long missaoIdMissao);
    Tripulante findTripulanteByPin(String pin);
    Optional<Tripulante> findTripulanteByPinAndSenha(String pin, String senha);
}
