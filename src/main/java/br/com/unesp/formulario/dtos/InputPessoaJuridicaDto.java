package br.com.unesp.formulario.dtos;

import br.com.unesp.formulario.entities.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
public class InputPessoaJuridicaDto extends Pessoa {
    private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	private String fax;
	private String webSite;
}
