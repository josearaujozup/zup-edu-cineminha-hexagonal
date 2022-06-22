package br.com.zup.edu.cineminha.domain.filme;

import java.util.Optional;

public interface RetornaFilmeRepository {

    Optional<Filme> retorna(Long id);

}
