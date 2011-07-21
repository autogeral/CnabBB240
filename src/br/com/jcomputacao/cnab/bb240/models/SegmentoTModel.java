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
public class SegmentoTModel {

    private long numeroLoteServico = 0;
    private long numeroSequencial = 0;
    private long numeroCodigoRetorno =0;
    private long numeroAgencia = 0;
    private long numeroDigitoVerificadorAgencia = 0;
    private long numeroContaCorrente =0;
    private long numeroDigitoVerificadorContaCorrente = 0;
    private long numeroDigitoVerificadorAgenciaContaCorrente = 0;
    private String identificacaoTitulo = "";
    private long numeroCodigoCarteira =0;
    private String numeroDocCobranca = "";
    private Date dataVencimentoTitulo = null;
    private double valorNominalTitulo = 0;
    private long numeroBanco = 0;
    private long numeroAgenciaCobradoraRecebedora = 0;
    private long numeroDigitoVerificadorAgenciaCobRec = 0;
    private String identificacaoTituloEmpresa = "";
    private long numeroCodigoMoeda = 0;
    private double valorTarifaCustas = 0;
    private String identificacao = "";

    public Date getDataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }

    public void setDataVencimentoTitulo(Date dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getIdentificacaoTitulo() {
        return identificacaoTitulo;
    }

    public void setIdentificacaoTitulo(String identificacaoTitulo) {
        this.identificacaoTitulo = identificacaoTitulo;
    }

    public String getIdentificacaoTituloEmpresa() {
        return identificacaoTituloEmpresa;
    }

    public void setIdentificacaoTituloEmpresa(String identificacaoTituloEmpresa) {
        this.identificacaoTituloEmpresa = identificacaoTituloEmpresa;
    }

    public long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public long getNumeroAgenciaCobradoraRecebedora() {
        return numeroAgenciaCobradoraRecebedora;
    }

    public void setNumeroAgenciaCobradoraRecebedora(long numeroAgenciaCobradoraRecebedora) {
        this.numeroAgenciaCobradoraRecebedora = numeroAgenciaCobradoraRecebedora;
    }

    public long getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(long numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public long getNumeroCodigoCarteira() {
        return numeroCodigoCarteira;
    }

    public void setNumeroCodigoCarteira(long numeroCodigoCarteira) {
        this.numeroCodigoCarteira = numeroCodigoCarteira;
    }

    public long getNumeroCodigoMoeda() {
        return numeroCodigoMoeda;
    }

    public void setNumeroCodigoMoeda(long numeroCodigoMoeda) {
        this.numeroCodigoMoeda = numeroCodigoMoeda;
    }

    public long getNumeroCodigoRetorno() {
        return numeroCodigoRetorno;
    }

    public void setNumeroCodigoRetorno(long numeroCodigoRetorno) {
        this.numeroCodigoRetorno = numeroCodigoRetorno;
    }

    public long getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(long numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public long getNumeroDigitoVerificadorAgencia() {
        return numeroDigitoVerificadorAgencia;
    }

    public void setNumeroDigitoVerificadorAgencia(long numeroDigitoVerificadorAgencia) {
        this.numeroDigitoVerificadorAgencia = numeroDigitoVerificadorAgencia;
    }

    public long getNumeroDigitoVerificadorAgenciaCobRec() {
        return numeroDigitoVerificadorAgenciaCobRec;
    }

    public void setNumeroDigitoVerificadorAgenciaCobRec(long numeroDigitoVerificadorAgenciaCobRec) {
        this.numeroDigitoVerificadorAgenciaCobRec = numeroDigitoVerificadorAgenciaCobRec;
    }

    public long getNumeroDigitoVerificadorAgenciaContaCorrente() {
        return numeroDigitoVerificadorAgenciaContaCorrente;
    }

    public void setNumeroDigitoVerificadorAgenciaContaCorrente(long numeroDigitoVerificadorAgenciaContaCorrente) {
        this.numeroDigitoVerificadorAgenciaContaCorrente = numeroDigitoVerificadorAgenciaContaCorrente;
    }

    public long getNumeroDigitoVerificadorContaCorrente() {
        return numeroDigitoVerificadorContaCorrente;
    }

    public void setNumeroDigitoVerificadorContaCorrente(long numeroDigitoVerificadorContaCorrente) {
        this.numeroDigitoVerificadorContaCorrente = numeroDigitoVerificadorContaCorrente;
    }

    public String getNumeroDocCobranca() {
        return numeroDocCobranca;
    }

    public void setNumeroDocCobranca(String numeroDocCobranca) {
        this.numeroDocCobranca = numeroDocCobranca;
    }

    public long getNumeroLoteServico() {
        return numeroLoteServico;
    }

    public void setNumeroLoteServico(long numeroLoteServico) {
        this.numeroLoteServico = numeroLoteServico;
    }

    public long getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(long numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    public double getValorNominalTitulo() {
        return valorNominalTitulo;
    }

    public void setValorNominalTitulo(double valorNominalTitulo) {
        this.valorNominalTitulo = valorNominalTitulo;
    }

    public double getValorTarifaCustas() {
        return valorTarifaCustas;
    }

    public void setValorTarifaCustas(double valorTarifaCustas) {
        this.valorTarifaCustas = valorTarifaCustas;
    }
}
