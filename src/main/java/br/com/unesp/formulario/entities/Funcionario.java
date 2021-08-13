package br.com.unesp.formulario.entities;

import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Funcionario extends PessoaFisica{
    private Double salario;
    private Double comissao;
    private Date dataContratacao;
}
