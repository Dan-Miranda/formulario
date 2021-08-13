package br.com.unesp.formulario.services.formularios.v1.impl;

import org.springframework.stereotype.Service;

import br.com.unesp.formulario.dtos.InputFuncionarioDto;
import br.com.unesp.formulario.entities.Funcionario;
import br.com.unesp.formulario.repositories.FuncionarioRepository;
import br.com.unesp.formulario.services.formularios.v1.FuncionarioService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Override
    public void criarFuncionario(InputFuncionarioDto inputFuncionarioDto) throws Exception {
        Funcionario funcionario = new Funcionario();
        // set dados pessoa
        funcionario.setBairro(inputFuncionarioDto.getBairro());
        funcionario.setCep(inputFuncionarioDto.getCep());
        funcionario.setCidadeId(inputFuncionarioDto.getCidadeId());
        funcionario.setComplemento(inputFuncionarioDto.getComplemento());
        funcionario.setEmail(inputFuncionarioDto.getEmail());
        funcionario.setEstadoId(inputFuncionarioDto.getEstadoId());
        funcionario.setNomeSocial(inputFuncionarioDto.getNomeSocial());
        funcionario.setNumero(inputFuncionarioDto.getNumero());
        funcionario.setRazaoSocial(inputFuncionarioDto.getRazaoSocial());
        funcionario.setRua(inputFuncionarioDto.getRua());
        funcionario.setTelefone(inputFuncionarioDto.getTelefone());

        // set dados pessoa física
        funcionario.setCpf(inputFuncionarioDto.getCpf());
        funcionario.setRg(inputFuncionarioDto.getRg());
        funcionario.setDataNascimento(inputFuncionarioDto.getDataNascimento());

        // set dados funcionário
        funcionario.setDataContratacao(inputFuncionarioDto.getDataContratacao());
        funcionario.setSalario(inputFuncionarioDto.getSalario());
        funcionario.setComissao(inputFuncionarioDto.getComissao());

        try {
            funcionarioRepository.save(funcionario);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }

}
