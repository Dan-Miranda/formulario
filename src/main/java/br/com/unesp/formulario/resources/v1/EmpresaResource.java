package br.com.unesp.formulario.resources.v1;

import br.com.unesp.formulario.dtos.InputPessoaJuridicaDto;
import br.com.unesp.formulario.services.formularios.v1.PessoaJuridicaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/v1")
@Api(tags = { "Empresas" })
public class EmpresaResource {
    private final PessoaJuridicaService empresaService;

    @ApiOperation(value = "Cria Empresas")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/empresas")
    public ResponseEntity<Object> criarEmpresa(@RequestBody InputPessoaJuridicaDto inputPessoaJuridicaDto) throws Exception {
        empresaService.criarEmpresa(inputPessoaJuridicaDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
