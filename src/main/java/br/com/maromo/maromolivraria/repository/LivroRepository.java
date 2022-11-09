package br.com.maromo.maromolivraria.repository;

import br.com.maromo.maromolivraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
