package br.com.zup.edu.cineminha.domain.sessao;

import br.com.zup.edu.cineminha.domain.filme.RetornaFilmeRepository;
import br.com.zup.edu.cineminha.domain.sala.RetornaSalaRepository;

public interface DadosNovaSessao {

    Sessao toModel(RetornaSalaRepository salaRepository, RetornaFilmeRepository filmeRepository);

}
