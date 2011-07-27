/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.models.remessa;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class HeaderArquivoModel {

    private long tipoInscricao = 0;
    private long numeroInscricao = 0;
    private String codigoConvenio = "";
    private long agenciaMantenedora = 0;
    private String digitoVerificadorAgencia = "";
    private long numeroConta = 0;
    private String digitoVerificadorConta = "";
    private String nomeEmpresa = "";
    private String nomeBanco = "";
    private long codigoRemessaRetorno = 0;
    private java.util.Date dataHoraGeracao;
    private long numeroSequencialRegistro = 0;
    private long densidadeGravacaoArquivo = 0;
    private String reservadoEmpresa = "";

    public long getAgenciaMantenedora() {
        return agenciaMantenedora;
    }

    public void setAgenciaMantenedora(long agenciaMantenedora) {
        this.agenciaMantenedora = agenciaMantenedora;
    }

    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    public long getCodigoRemessaRetorno() {
        return codigoRemessaRetorno;
    }

    public void setCodigoRemessaRetorno(long codigoRemessaRetorno) {
        this.codigoRemessaRetorno = codigoRemessaRetorno;
    }

    public Date getDataHoraGeracao() {
        return dataHoraGeracao;
    }

    public void setDataHoraGeracao(Date dataHoraGeracao) {
        this.dataHoraGeracao = dataHoraGeracao;
    }

    public long getDensidadeGravacaoArquivo() {
        return densidadeGravacaoArquivo;
    }

    public void setDensidadeGravacaoArquivo(long densidadeGravacaoArquivo) {
        this.densidadeGravacaoArquivo = densidadeGravacaoArquivo;
    }

    public String getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    }

    public String getDigitoVerificadorConta() {
        return digitoVerificadorConta;
    }

    public void setDigitoVerificadorConta(String digitoVerificadorConta) {
        this.digitoVerificadorConta = digitoVerificadorConta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(long numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public long getNumeroSequencialRegistro() {
        return numeroSequencialRegistro;
    }

    public void setNumeroSequencialRegistro(long numeroSequencialRegistro) {
        this.numeroSequencialRegistro = numeroSequencialRegistro;
    }

    public String getReservadoEmpresa() {
        return reservadoEmpresa;
    }

    public void setReservadoEmpresa(String reservadoEmpresa) {
        this.reservadoEmpresa = reservadoEmpresa;
    }

    public long getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(long tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    

}
