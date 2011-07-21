/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.models;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class HeaderLoteModel {

    private int loteServico = 0;
    private char tipoOperacao = ' ';
    private int tipoInscricao = 0;
    private int numeroInscricao = 0;
    private int numeroConvenioCobranca = 0;
    private int cobrancaCedente = 0;
    private int numeroCarteiraCobranca = 0;
    private int numeroVariacaoCarteiraCobranca =0;
    private String remessaTeste = "";
    private int agenciaMantenedora = 0;
    private char digitoVerificadorAgencia = ' ';
    private int numeroContaCorrente = 0;
    private char digitoVerificadorContaCorrente = ' ';
    private String nomeEmpresa = "";
    private String mensagem1 = "";
    private int numeroRemessaRetorno = 0;
    private Date dataGravacaoRemessaRetorno = null;

    public int getAgenciaMantenedora() {
        return agenciaMantenedora;
    }

    public void setAgenciaMantenedora(int agenciaMantenedora) {
        this.agenciaMantenedora = agenciaMantenedora;
    }

    public int getCobrancaCedente() {
        return cobrancaCedente;
    }

    public void setCobrancaCedente(int cobrancaCedente) {
        this.cobrancaCedente = cobrancaCedente;
    }

    public Date getDataGravacaoRemessaRetorno() {
        return dataGravacaoRemessaRetorno;
    }

    public void setDataGravacaoRemessaRetorno(Date dataGravacaoRemessaRetorno) {
        this.dataGravacaoRemessaRetorno = dataGravacaoRemessaRetorno;
    }

    public char getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    public void setDigitoVerificadorAgencia(char digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    }

    public char getDigitoVerificadorContaCorrente() {
        return digitoVerificadorContaCorrente;
    }

    public void setDigitoVerificadorContaCorrente(char digitoVerificadorContaCorrente) {
        this.digitoVerificadorContaCorrente = digitoVerificadorContaCorrente;
    }

    public int getLoteServico() {
        return loteServico;
    }

    public void setLoteServico(int loteServico) {
        this.loteServico = loteServico;
    }

    public String getMensagem1() {
        return mensagem1;
    }

    public void setMensagem1(String mensagem1) {
        this.mensagem1 = mensagem1;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getNumeroCarteiraCobranca() {
        return numeroCarteiraCobranca;
    }

    public void setNumeroCarteiraCobranca(int numeroCarteiraCobranca) {
        this.numeroCarteiraCobranca = numeroCarteiraCobranca;
    }

    public int getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(int numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public int getNumeroConvenioCobranca() {
        return numeroConvenioCobranca;
    }

    public void setNumeroConvenioCobranca(int numeroConvenioCobranca) {
        this.numeroConvenioCobranca = numeroConvenioCobranca;
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public int getNumeroRemessaRetorno() {
        return numeroRemessaRetorno;
    }

    public void setNumeroRemessaRetorno(int numeroRemessaRetorno) {
        this.numeroRemessaRetorno = numeroRemessaRetorno;
    }

    public int getNumeroVariacaoCarteiraCobranca() {
        return numeroVariacaoCarteiraCobranca;
    }

    public void setNumeroVariacaoCarteiraCobranca(int numeroVariacaoCarteiraCobranca) {
        this.numeroVariacaoCarteiraCobranca = numeroVariacaoCarteiraCobranca;
    }

    public String getRemessaTeste() {
        return remessaTeste;
    }

    public void setRemessaTeste(String remessaTeste) {
        this.remessaTeste = remessaTeste;
    }

    public int getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(int tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    public char getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(char tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
}
