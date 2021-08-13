package br.com.unesp.formulario.dtos;

import java.util.Date;

import br.com.unesp.formulario.entities.PessoaFisica;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
public class InputFuncionarioDto extends PessoaFisica {
    private Double salario;
    private Double comissao;
    private Date dataContratacao;
}
