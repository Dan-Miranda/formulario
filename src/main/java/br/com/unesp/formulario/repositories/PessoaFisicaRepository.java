package br.com.unesp.formulario.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.com.unesp.formulario.entities.PessoaFisica;

@NoRepositoryBean
public interface PessoaFisicaRepository extends CrudRepository<PessoaFisica, Long>{
}
