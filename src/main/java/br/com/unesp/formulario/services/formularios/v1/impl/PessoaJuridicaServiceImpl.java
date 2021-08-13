package br.com.unesp.formulario.services.formularios.v1.impl;

import org.springframework.stereotype.Service;

import br.com.unesp.formulario.dtos.InputPessoaJuridicaDto;
import br.com.unesp.formulario.entities.PessoaJuridica;
import br.com.unesp.formulario.repositories.PessoaJuridicaRepository;
import br.com.unesp.formulario.services.formularios.v1.PessoaJuridicaService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaJuridicaServiceImpl implements PessoaJuridicaService{

    private final PessoaJuridicaRepository pessoaJuridicaRepository;

    @Override
    public void criarEmpresa(InputPessoaJuridicaDto inputPessoaJuridicaDto) throws Exception {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaJuridica.setBairro(inputPessoaJuridicaDto.getBairro());
        pessoaJuridica.setCep(inputPessoaJuridicaDto.getCep());
        pessoaJuridica.setCidadeId(inputPessoaJuridicaDto.getCidadeId());
        pessoaJuridica.setComplemento(inputPessoaJuridicaDto.getComplemento());
        pessoaJuridica.setEmail(inputPessoaJuridicaDto.getEmail());
        pessoaJuridica.setEstadoId(inputPessoaJuridicaDto.getEstadoId());
        pessoaJuridica.setNomeSocial(inputPessoaJuridicaDto.getNomeSocial());
        pessoaJuridica.setNumero(inputPessoaJuridicaDto.getNumero());
        pessoaJuridica.setRazaoSocial(inputPessoaJuridicaDto.getRazaoSocial());
        pessoaJuridica.setRua(inputPessoaJuridicaDto.getRua());
        pessoaJuridica.setTelefone(inputPessoaJuridicaDto.getTelefone());

        pessoaJuridica.setFax(inputPessoaJuridicaDto.getFax());
        pessoaJuridica.setCnpj(inputPessoaJuridicaDto.getCnpj());
        pessoaJuridica.setInscricaoEstadual(inputPessoaJuridicaDto.getInscricaoEstadual());
        pessoaJuridica.setInscricaoMunicipal(inputPessoaJuridicaDto.getInscricaoMunicipal());
        pessoaJuridica.setWebSite(inputPessoaJuridicaDto.getWebSite());

        try {
            pessoaJuridicaRepository.save(pessoaJuridica);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
}
