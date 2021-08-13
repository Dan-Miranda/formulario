package br.com.unesp.formulario.services.formularios.v1;

import org.springframework.stereotype.Service;

import br.com.unesp.formulario.dtos.InputFuncionarioDto;

@Service
public interface FuncionarioService {
    void criarFuncionario(InputFuncionarioDto inputFuncionarioDto) throws Exception;
}
