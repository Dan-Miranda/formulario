package br.com.unesp.formulario.services.formularios.v1;

import br.com.unesp.formulario.dtos.InputPessoaJuridicaDto;

import org.springframework.stereotype.Service;

@Service
public interface PessoaJuridicaService  {
    void criarEmpresa(InputPessoaJuridicaDto inputPessoaJuridicaDto) throws Exception;
}
