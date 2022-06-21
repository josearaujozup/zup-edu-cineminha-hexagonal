package br.com.zup.edu.cineminha.application.sessao;

import br.com.zup.edu.cineminha.adapters.persistence.filme.FilmeRepository;
import br.com.zup.edu.cineminha.adapters.persistence.sala.SalaRepository;
import br.com.zup.edu.cineminha.adapters.persistence.sessao.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/sessoes")
public class SessaoController {

    @Autowired
    private SessaoRepository repository;

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovaSessaoRequest request,
                                      UriComponentsBuilder uriBuilder) {

        var sessao = repository.save(request.toModel(salaRepository, filmeRepository));

        var location = uriBuilder.path("/api/sessoes/{id}")
                .buildAndExpand(sessao.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }


}
