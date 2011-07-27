/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.model.retorno;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class HeaderArquivoRetornoModel {

private long prefixoBanco = 1;
private long numeroLoteServico = 0;
private long codigoRegistro = 0;
private long tipoOpercao = 0;
private long tipoServico = 0;
private long formaLancamento = 0;
private long numeroVersaoLayout = 0;
private long tipoInscricao = 0;
private long numeroInscricao = 0;
private String nomeArquivo = "";
private Date dataGravacaoArquivo = null;
private long agenciaEmpresa = 0;
private char digitoVerificadorAgencia = ' ';
private long contaEmpresa = 0;
private char digitoVerificadorContaEmpresa = ' ';
private char digitoVerificadorAgenciaConta = ' ';
private String nomeEmpresa = "";
private long contratoIED = 0;

    public long getAgenciaEmpresa() {
        return agenciaEmpresa;
    }

    public void setAgenciaEmpresa(long agenciaEmpresa) {
        this.agenciaEmpresa = agenciaEmpresa;
    }

    public long getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(long codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public long getContaEmpresa() {
        return contaEmpresa;
    }

    public void setContaEmpresa(long contaEmpresa) {
        this.contaEmpresa = contaEmpresa;
    }

    public long getContratoIED() {
        return contratoIED;
    }

    public void setContratoIED(long contratoIED) {
        this.contratoIED = contratoIED;
    }

    public Date getDataGravacaoArquivo() {
        return dataGravacaoArquivo;
    }

    public void setDataGravacaoArquivo(Date dataGravacaoArquivo) {
        this.dataGravacaoArquivo = dataGravacaoArquivo;
    }

    public char getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    public void setDigitoVerificadorAgencia(char digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    }

    public char getDigitoVerificadorAgenciaConta() {
        return digitoVerificadorAgenciaConta;
    }

    public void setDigitoVerificadorAgenciaConta(char digitoVerificadorAgenciaConta) {
        this.digitoVerificadorAgenciaConta = digitoVerificadorAgenciaConta;
    }

    public char getDigitoVerificadorContaEmpresa() {
        return digitoVerificadorContaEmpresa;
    }

    public void setDigitoVerificadorContaEmpresa(char digitoVerificadorContaEmpresa) {
        this.digitoVerificadorContaEmpresa = digitoVerificadorContaEmpresa;
    }

    public long getFormaLancamento() {
        return formaLancamento;
    }

    public void setFormaLancamento(long formaLancamento) {
        this.formaLancamento = formaLancamento;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(long numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public long getNumeroLoteServico() {
        return numeroLoteServico;
    }

    public void setNumeroLoteServico(long numeroLoteServico) {
        this.numeroLoteServico = numeroLoteServico;
    }

    public long getNumeroVersaoLayout() {
        return numeroVersaoLayout;
    }

    public void setNumeroVersaoLayout(long numeroVersaoLayout) {
        this.numeroVersaoLayout = numeroVersaoLayout;
    }

    public long getPrefixoBanco() {
        return prefixoBanco;
    }

    public void setPrefixoBanco(long prefixoBanco) {
        this.prefixoBanco = prefixoBanco;
    }

    public long getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(long tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    public long getTipoOpercao() {
        return tipoOpercao;
    }

    public void setTipoOpercao(long tipoOpercao) {
        this.tipoOpercao = tipoOpercao;
    }

    public long getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(long tipoServico) {
        this.tipoServico = tipoServico;
    }
}
