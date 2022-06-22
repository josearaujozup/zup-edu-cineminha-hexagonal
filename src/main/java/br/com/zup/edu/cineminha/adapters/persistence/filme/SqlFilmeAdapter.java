package br.com.zup.edu.cineminha.adapters.persistence.filme;

import br.com.zup.edu.cineminha.domain.filme.CadastraFilmeRepository;
import br.com.zup.edu.cineminha.domain.filme.Filme;
import br.com.zup.edu.cineminha.domain.filme.RetornaFilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SqlFilmeAdapter implements CadastraFilmeRepository, RetornaFilmeRepository {

    @Autowired
    private FilmeRepository repository;

    @Override
    public Filme salva(Filme filme) {
        return repository.save(filme);
    }

    @Override
    public Optional<Filme> retorna(Long id) {
        return repository.findById(id);
    }
}
