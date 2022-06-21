package br.com.zup.edu.cineminha.domain.filme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraNovoFilme {

    @Autowired
    private CadastraFilmeRepository repository;

    public Filme salva(DadosNovoFilme novoFilme){
        return repository.salva(novoFilme.toModel());
    }

}
