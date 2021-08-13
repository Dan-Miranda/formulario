package br.com.unesp.formulario.entities;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EqualsAndHashCode(callSuper=false)
@Data
public class PessoaFisica extends Pessoa {
    @CPF(message = "Formato de CPF inválido")
    private String cpf;
    private String rg;
    private Date dataNascimento;
}
