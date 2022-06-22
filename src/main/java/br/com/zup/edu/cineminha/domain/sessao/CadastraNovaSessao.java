package br.com.zup.edu.cineminha.domain.sessao;

import br.com.zup.edu.cineminha.adapters.persistence.sessao.SessaoRepository;
import br.com.zup.edu.cineminha.domain.filme.RetornaFilmeRepository;
import br.com.zup.edu.cineminha.domain.sala.RetornaSalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraNovaSessao {

    @Autowired
    private CadastraSessaoRepository repository;

    @Autowired
    private RetornaSalaRepository salaRepository;

    @Autowired
    private RetornaFilmeRepository filmeRepository;

    public Sessao salva(DadosNovaSessao novaSessao){

        Sessao sessao = repository.salva(novaSessao.toModel(salaRepository, filmeRepository));

        return sessao;

    }

}
