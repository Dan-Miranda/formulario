package br.com.unesp.formulario.resources.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.unesp.formulario.dtos.InputFuncionarioDto;
import br.com.unesp.formulario.services.formularios.v1.FuncionarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/v1")
@Api(tags = { "Funcionários" })
public class FuncionarioResource {
    private final FuncionarioService funcionarioService;

    @ApiOperation(value = "Cria Funcionários")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/funcionarios")
    public ResponseEntity<Object> criarFuncionario(@RequestBody InputFuncionarioDto inputFuncionarioDto) throws Exception {
        funcionarioService.criarFuncionario(inputFuncionarioDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
