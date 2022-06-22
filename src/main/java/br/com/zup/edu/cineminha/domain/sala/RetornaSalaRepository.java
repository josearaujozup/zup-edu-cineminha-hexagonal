package br.com.zup.edu.cineminha.domain.sala;

import java.util.Optional;

public interface RetornaSalaRepository {

    Optional<Sala> retorna(Long id);

}
