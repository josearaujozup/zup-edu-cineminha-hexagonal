package br.com.zup.edu.cineminha.adapters.persistence.sala;

import br.com.zup.edu.cineminha.domain.sala.CadastraNovaSalaRepository;
import br.com.zup.edu.cineminha.domain.sala.RetornaSalaRepository;
import br.com.zup.edu.cineminha.domain.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SqlSalaAdapter implements CadastraNovaSalaRepository, RetornaSalaRepository {

    @Autowired
    private SalaRepository repository;

    @Override
    public Sala salva(Sala sala) {
        return repository.save(sala);
    }

    @Override
    public Optional<Sala> retorna(Long id) {
        return repository.findById(id);
    }
}
