package com.br.itsingular.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "SOLICITA_REQUISICAO")
public class Requisicao implements Serializable {

	private static final long serialVersionUID = 5409745091354579153L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	
	@NotBlank(message = "Campo obrigatório")
	private String nomeSolicitante;

	@NotBlank(message = "Campo obrigatório")
	private String dataSolicitacao;

	@NotBlank(message = "Campo obrigatório")
	private String cliente;

	@NotBlank(message = "Campo obrigatório")
	private String ramoAtividade;

	@NotBlank(message = "Campo obrigatório")
	private String endereco;

	@NotBlank(message = "Campo obrigatório")
	private String regiao;

	@NotBlank(message = "Campo obrigatório")
	private String pessoaContato;

	@NotBlank(message = "Campo obrigatório")
	private String cargo;

	private String telCorporativo;

	@NotBlank(message = "Campo obrigatório")
	private String telCelular;

	@NotBlank(message = "Campo obrigatório")
	@Email
	private String email;

	@NotBlank(message = "Campo obrigatório")
	private String perfil;

	@NotBlank(message = "Campo obrigatório")
	private String regiaoAtuacao;

	@NotBlank(message = "Campo obrigatório")
	private String vagas;

	@NotBlank(message = "Campo obrigatório")
	private String cargaHoraria;

	@NotBlank(message = "Campo obrigatório")
	private String previsaoInicio;

	@NotBlank(message = "Campo obrigatório")
	private String duracaoContrato;

	private String renovacao;

	private String formaContratacao;

	@NotBlank(message = "Campo obrigatório")
	private String valor;

	private String por;

	@NotBlank(message = "Campo obrigatórioo")
	private String horaAberta;

	@NotNull(message = "Campo obrigatório")
	private Integer quantidadeMinimaHoras;
	
	@NotNull(message = "Campo obrigatório")
	private Integer[] rhProcesso;
	
	@NotNull(message = "Campo obrigatório")
	private Integer[] solicitanteProcesso;
	
	@NotNull(message = "Campo obrigatório")
	private Integer[] clienteProcesso;
	
	@NotNull(message = "Campo obrigatório")
	private Integer[] quaisTestes;
	
	@NotNull(message = "Campo obrigatório")
	private String localAplicacao;
	
	private String observacao;

	public Requisicao() {
	}

	/**
	 * @param nomeSolicitante
	 * @param dataSolicitacao
	 * @param cliente
	 * @param ramoAtividade
	 * @param endereco
	 * @param regiao
	 * @param pessoaContato
	 * @param cargo
	 * @param telCorporativo
	 * @param telCelular
	 * @param email
	 * @param perfil
	 * @param regiaoAtuacao
	 * @param vagas
	 * @param cargaHoraria
	 * @param previsaoInicio
	 * @param duracaoContrato
	 * @param renovacao
	 * @param formaContratacao
	 * @param valor
	 * @param por
	 * @param horaAberta
	 * @param quantidadeMinimaHoras
	 * @param rhProcesso
	 * @param solicitanteProcesso
	 * @param clienteProcesso
	 * @param quaisTestes
	 * @param localAplicacao
	 */
	public Requisicao(@NotBlank(message = "Campo obrigatório") String nomeSolicitante,
			@NotBlank(message = "Campo obrigatório") String dataSolicitacao,
			@NotBlank(message = "Campo obrigatório") String cliente,
			@NotBlank(message = "Campo obrigatório") String ramoAtividade,
			@NotBlank(message = "Campo obrigatório") String endereco,
			@NotBlank(message = "Campo obrigatório") String regiao,
			@NotBlank(message = "Campo obrigatório") String pessoaContato,
			@NotBlank(message = "Campo obrigatório") String cargo, String telCorporativo,
			@NotBlank(message = "Campo obrigatório") String telCelular,
			@NotBlank(message = "Campo obrigatório") @Email String email,
			@NotBlank(message = "Campo obrigatório") String perfil,
			@NotBlank(message = "Campo obrigatório") String regiaoAtuacao,
			@NotBlank(message = "Campo obrigatório") String vagas,
			@NotBlank(message = "Campo obrigatório") String cargaHoraria,
			@NotBlank(message = "Campo obrigatório") String previsaoInicio,
			@NotBlank(message = "Campo obrigatório") String duracaoContrato, String renovacao, String formaContratacao,
			@NotBlank(message = "Campo obrigatório") String valor, String por,
			@NotBlank(message = "Campo obrigatórioo") String horaAberta,
			@NotNull(message = "Campo obrigatório") Integer quantidadeMinimaHoras,
			@NotNull(message = "Campo obrigatório") Integer[] rhProcesso,
			@NotNull(message = "Campo obrigatório") Integer[] solicitanteProcesso,
			@NotNull(message = "Campo obrigatório") Integer[] clienteProcesso,
			@NotNull(message = "Campo obrigatório") Integer[] quaisTestes,
			@NotNull(message = "Campo obrigatório") String localAplicacao) {
		super();
		this.nomeSolicitante = nomeSolicitante;
		this.dataSolicitacao = dataSolicitacao;
		this.cliente = cliente;
		this.ramoAtividade = ramoAtividade;
		this.endereco = endereco;
		this.regiao = regiao;
		this.pessoaContato = pessoaContato;
		this.cargo = cargo;
		this.telCorporativo = telCorporativo;
		this.telCelular = telCelular;
		this.email = email;
		this.perfil = perfil;
		this.regiaoAtuacao = regiaoAtuacao;
		this.vagas = vagas;
		this.cargaHoraria = cargaHoraria;
		this.previsaoInicio = previsaoInicio;
		this.duracaoContrato = duracaoContrato;
		this.renovacao = renovacao;
		this.formaContratacao = formaContratacao;
		this.valor = valor;
		this.por = por;
		this.horaAberta = horaAberta;
		this.quantidadeMinimaHoras = quantidadeMinimaHoras;
		this.rhProcesso = rhProcesso;
		this.solicitanteProcesso = solicitanteProcesso;
		this.clienteProcesso = clienteProcesso;
		this.quaisTestes = quaisTestes;
		this.localAplicacao = localAplicacao;
	}



	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nomeSolicitante
	 */
	public String getNomeSolicitante() {
		return nomeSolicitante;
	}

	/**
	 * @param nomeSolicitante the nomeSolicitante to set
	 */
	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}

	/**
	 * @return the dataSolicitacao
	 */
	public String getDataSolicitacao() {
		return dataSolicitacao;
	}

	/**
	 * @param dataSolicitacao the dataSolicitacao to set
	 */
	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the ramoAtividade
	 */
	public String getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * @param ramoAtividade the ramoAtividade to set
	 */
	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the regiao
	 */
	public String getRegiao() {
		return regiao;
	}

	/**
	 * @param regiao the regiao to set
	 */
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	/**
	 * @return the pessoaContato
	 */
	public String getPessoaContato() {
		return pessoaContato;
	}

	/**
	 * @param pessoaContato the pessoaContato to set
	 */
	public void setPessoaContato(String pessoaContato) {
		this.pessoaContato = pessoaContato;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the telCorporativo
	 */
	public String getTelCorporativo() {
		return telCorporativo;
	}

	/**
	 * @param telCorporativo the telCorporativo to set
	 */
	public void setTelCorporativo(String telCorporativo) {
		this.telCorporativo = telCorporativo;
	}

	/**
	 * @return the telCelular
	 */
	public String getTelCelular() {
		return telCelular;
	}

	/**
	 * @param telCelular the telCelular to set
	 */
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Requisicao [id=" + id + ", nomeSolicitante=" + nomeSolicitante + ", dataSolicitacao=" + dataSolicitacao
				+ ", cliente=" + cliente + ", ramoAtividade=" + ramoAtividade + ", endereco=" + endereco + ", regiao="
				+ regiao + ", pessoaContato=" + pessoaContato + ", cargo=" + cargo + ", telCorporativo="
				+ telCorporativo + ", telCelular=" + telCelular + ", email=" + email + "]";
	}

	/**
	 * @return the perfil
	 */
	public String getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	/**
	 * @return the regiaoAtuacao
	 */
	public String getRegiaoAtuacao() {
		return regiaoAtuacao;
	}

	/**
	 * @param regiaoAtuacao the regiaoAtuacao to set
	 */
	public void setRegiaoAtuacao(String regiaoAtuacao) {
		this.regiaoAtuacao = regiaoAtuacao;
	}

	/**
	 * @return the vagas
	 */
	public String getVagas() {
		return vagas;
	}

	/**
	 * @param vagas the vagas to set
	 */
	public void setVagas(String vagas) {
		this.vagas = vagas;
	}

	/**
	 * @return the cargaHoraria
	 */
	public String getCargaHoraria() {
		return cargaHoraria;
	}

	/**
	 * @param cargaHoraria the cargaHoraria to set
	 */
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	/**
	 * @return the previsaoInicio
	 */
	public String getPrevisaoInicio() {
		return previsaoInicio;
	}

	/**
	 * @param previsaoInicio the previsaoInicio to set
	 */
	public void setPrevisaoInicio(String previsaoInicio) {
		this.previsaoInicio = previsaoInicio;
	}

	/**
	 * @return the duracaoContrato
	 */
	public String getDuracaoContrato() {
		return duracaoContrato;
	}

	/**
	 * @param duracaoContrato the duracaoContrato to set
	 */
	public void setDuracaoContrato(String duracaoContrato) {
		this.duracaoContrato = duracaoContrato;
	}

	/**
	 * @return the renovacao
	 */
	public String getRenovacao() {
		return renovacao;
	}

	/**
	 * @param renovacao the renovacao to set
	 */
	public void setRenovacao(String renovacao) {
		this.renovacao = renovacao;
	}

	/**
	 * @return the formaContratacao
	 */
	public String getFormaContratacao() {
		return formaContratacao;
	}

	/**
	 * @param formaContratacao the formaContratacao to set
	 */
	public void setFormaContratacao(String formaContratacao) {
		this.formaContratacao = formaContratacao;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * @return the por
	 */
	public String getPor() {
		return por;
	}

	/**
	 * @param por the por to set
	 */
	public void setPor(String por) {
		this.por = por;
	}

	/**
	 * @return the horaAberta
	 */
	public String getHoraAberta() {
		return horaAberta;
	}

	/**
	 * @param horaAberta the horaAberta to set
	 */
	public void setHoraAberta(String horaAberta) {
		this.horaAberta = horaAberta;
	}

	/**
	 * @return the quantidadeMinimaHoras
	 */
	public Integer getQuantidadeMinimaHoras() {
		return quantidadeMinimaHoras;
	}

	/**
	 * @param quantidadeMinimaHoras the quantidadeMinimaHoras to set
	 */
	public void setQuantidadeMinimaHoras(Integer quantidadeMinimaHoras) {
		this.quantidadeMinimaHoras = quantidadeMinimaHoras;
	}


	/**
	 * @return the rhProcesso
	 */
	public Integer[] getRhProcesso() {
		return rhProcesso;
	}


	/**
	 * @param rhProcesso the rhProcesso to set
	 */
	public void setRhProcesso(Integer[] rhProcesso) {
		this.rhProcesso = rhProcesso;
	}


	/**
	 * @return the solicitanteProcesso
	 */
	public Integer[] getSolicitanteProcesso() {
		return solicitanteProcesso;
	}


	/**
	 * @param solicitanteProcesso the solicitanteProcesso to set
	 */
	public void setSolicitanteProcesso(Integer[] solicitanteProcesso) {
		this.solicitanteProcesso = solicitanteProcesso;
	}


	/**
	 * @return the clienteProcesso
	 */
	public Integer[] getClienteProcesso() {
		return clienteProcesso;
	}


	/**
	 * @param clienteProcesso the clienteProcesso to set
	 */
	public void setClienteProcesso(Integer[] clienteProcesso) {
		this.clienteProcesso = clienteProcesso;
	}



	/**
	 * @return the quaisTestes
	 */
	public Integer[] getQuaisTestes() {
		return quaisTestes;
	}



	/**
	 * @param quaisTestes the quaisTestes to set
	 */
	public void setQuaisTestes(Integer[] quaisTestes) {
		this.quaisTestes = quaisTestes;
	}



	/**
	 * @return the localAplicacao
	 */
	public String getLocalAplicacao() {
		return localAplicacao;
	}



	/**
	 * @param localAplicacao the localAplicacao to set
	 */
	public void setLocalAplicacao(String localAplicacao) {
		this.localAplicacao = localAplicacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}



}
