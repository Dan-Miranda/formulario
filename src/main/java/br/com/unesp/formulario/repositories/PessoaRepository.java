package br.com.unesp.formulario.repositories;

import br.com.unesp.formulario.entities.Pessoa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
