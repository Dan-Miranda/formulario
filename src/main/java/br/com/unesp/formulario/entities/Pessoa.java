package br.com.unesp.formulario.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class Pessoa {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    protected long id;
	private String razaoSocial;
	private String nomeSocial;
	private String email;
	private String telefone;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private long cidadeId;
	private long estadoId;
}
