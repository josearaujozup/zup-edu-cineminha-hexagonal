package br.com.zup.edu.cineminha.adapters.persistence.sessao;

import br.com.zup.edu.cineminha.domain.sessao.CadastraSessaoRepository;
import br.com.zup.edu.cineminha.domain.sessao.Sessao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlSessaoAdapter implements CadastraSessaoRepository {

    @Autowired
    private SessaoRepository repository;

    @Override
    public Sessao salva(Sessao sessao) {
        return repository.save(sessao);
    }
}
