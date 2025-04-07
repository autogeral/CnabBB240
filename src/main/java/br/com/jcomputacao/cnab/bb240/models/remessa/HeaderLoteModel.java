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
public class HeaderLoteModel {

    private long loteServico = 0;    
    private char tipoOperacao = ' ';
    private long tipoInscricao = 0;
    private long numeroInscricao = 0;
    private String numeroConvenioCobranca = "";
    private long cobrancaCedente = 0;
    private long numeroCarteiraCobranca = 0;
    private long numeroVariacaoCarteiraCobranca =0;
    private String remessaTeste = "";
    private long agenciaMantenedora = 0;
    private char digitoVerificadorAgencia = ' ';
    private long numeroContaCorrente = 0;
    private char digitoVerificadorContaCorrente = ' ';
    private String nomeEmpresa = "";
    private String mensagem1 = "";
    private long numeroRemessaRetorno = 0;
    private Date dataGravacaoRemessaRetorno = null;
    
    public long getAgenciaMantenedora() {
        return agenciaMantenedora;
    }

    public void setAgenciaMantenedora(long agenciaMantenedora) {
        this.agenciaMantenedora = agenciaMantenedora;
    }

    public long getCobrancaCedente() {
        return cobrancaCedente;
    }

    public void setCobrancaCedente(long cobrancaCedente) {
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

    public long getLoteServico() {
        return loteServico;
    }

    public void setLoteServico(long loteServico) {
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

    public long getNumeroCarteiraCobranca() {
        return numeroCarteiraCobranca;
    }

    public void setNumeroCarteiraCobranca(long numeroCarteiraCobranca) {
        this.numeroCarteiraCobranca = numeroCarteiraCobranca;
    }

    public long getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(long numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public String getNumeroConvenioCobranca() {
        return numeroConvenioCobranca;
    }

    public void setNumeroConvenioCobranca(String numeroConvenioCobranca) {
        this.numeroConvenioCobranca = numeroConvenioCobranca;
    }

    public long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(long numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public long getNumeroRemessaRetorno() {
        return numeroRemessaRetorno;
    }

    public void setNumeroRemessaRetorno(long numeroRemessaRetorno) {
        this.numeroRemessaRetorno = numeroRemessaRetorno;
    }

    public long getNumeroVariacaoCarteiraCobranca() {
        return numeroVariacaoCarteiraCobranca;
    }

    public void setNumeroVariacaoCarteiraCobranca(long numeroVariacaoCarteiraCobranca) {
        this.numeroVariacaoCarteiraCobranca = numeroVariacaoCarteiraCobranca;
    }

    public String getRemessaTeste() {
        return remessaTeste;
    }

    public void setRemessaTeste(String remessaTeste) {
        this.remessaTeste = remessaTeste;
    }

    public long getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(long tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    public char getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(char tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
}
