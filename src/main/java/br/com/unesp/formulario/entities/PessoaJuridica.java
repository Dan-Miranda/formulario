package br.com.unesp.formulario.entities;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.br.CNPJ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class PessoaJuridica extends Pessoa {
    @CNPJ(message = "Formato de CNPJ inválido")
    private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	private String fax;
	private String webSite;
}
