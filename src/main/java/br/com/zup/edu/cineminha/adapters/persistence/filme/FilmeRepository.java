package br.com.zup.edu.cineminha.adapters.persistence.filme;

import br.com.zup.edu.cineminha.domain.filme.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}