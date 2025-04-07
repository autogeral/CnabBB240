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
public class SegmentoGModel {

    private long prefixoBanco = 1;
    private long numeroLoteServico = 0;
    private long codigoRegistro = 0;
    private long numeroSequencial = 0;
    private char codigoSegmento = 'G';
    private long codigoMovimento = 0;
    private long codigoBarrasBancoDest = 0;
    private long codigoBarrasCodigoMoeda = 0;
    private long codigoBarrasDigVerificador = 0;
    private double codigoBarrasValorTitulo = 0;
    private long codigoBarrasCampoLivre =0;
    private long inscricaoCedente = 0;
    private long numeroInscricaoCedente = 0;
    private String nomeCedente = "";
    private Date dataVencimentoTitulo = null;
    private double valorNominalTitulo = 0;
    private double quantidadeMoeda = 0;
    private long codigoMoeda = 0;
    private String numeroTituloParaCedente = "";
    private double valorAbatimento = 0;
    private char codigoCarteira = ' ';
    private long especieTitulo = 0;
    private Date dataEmissaoTitulo = null;
    private long numeroCnpjSacado = 0;
    private long codigoDesconto = 0;
    private Date dataDesconto = null;
    private double valorPercentualDesconto = 0;
    private long instrucaoProtesto = 0;
    private long numeroDiasProtesto = 0;
    private Date dataLimitePagamento = null;

    public long getCodigoBarrasBancoDest() {
        return codigoBarrasBancoDest;
    }

    public void setCodigoBarrasBancoDest(long codigoBarrasBancoDest) {
        this.codigoBarrasBancoDest = codigoBarrasBancoDest;
    }

    public long getCodigoBarrasCampoLivre() {
        return codigoBarrasCampoLivre;
    }

    public void setCodigoBarrasCampoLivre(long codigoBarrasCampoLivre) {
        this.codigoBarrasCampoLivre = codigoBarrasCampoLivre;
    }

    public long getCodigoBarrasCodigoMoeda() {
        return codigoBarrasCodigoMoeda;
    }

    public void setCodigoBarrasCodigoMoeda(long codigoBarrasCodigoMoeda) {
        this.codigoBarrasCodigoMoeda = codigoBarrasCodigoMoeda;
    }

    public long getCodigoBarrasDigVerificador() {
        return codigoBarrasDigVerificador;
    }

    public void setCodigoBarrasDigVerificador(long codigoBarrasDigVerificador) {
        this.codigoBarrasDigVerificador = codigoBarrasDigVerificador;
    }

    public double getCodigoBarrasValorTitulo() {
        return codigoBarrasValorTitulo;
    }

    public void setCodigoBarrasValorTitulo(double codigoBarrasValorTitulo) {
        this.codigoBarrasValorTitulo = codigoBarrasValorTitulo;
    }

    public char getCodigoCarteira() {
        return codigoCarteira;
    }

    public void setCodigoCarteira(char codigoCarteira) {
        this.codigoCarteira = codigoCarteira;
    }

    public long getCodigoDesconto() {
        return codigoDesconto;
    }

    public void setCodigoDesconto(long codigoDesconto) {
        this.codigoDesconto = codigoDesconto;
    }

    public long getCodigoMoeda() {
        return codigoMoeda;
    }

    public void setCodigoMoeda(long codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
    }

    public long getCodigoMovimento() {
        return codigoMovimento;
    }

    public void setCodigoMovimento(long codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
    }

    public long getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(long codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public char getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(char codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    public Date getDataDesconto() {
        return dataDesconto;
    }

    public void setDataDesconto(Date dataDesconto) {
        this.dataDesconto = dataDesconto;
    }

    public Date getDataEmissaoTitulo() {
        return dataEmissaoTitulo;
    }

    public void setDataEmissaoTitulo(Date dataEmissaoTitulo) {
        this.dataEmissaoTitulo = dataEmissaoTitulo;
    }

    public Date getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setDataLimitePagamento(Date dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }

    public Date getDataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }

    public void setDataVencimentoTitulo(Date dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }

    public long getEspecieTitulo() {
        return especieTitulo;
    }

    public void setEspecieTitulo(long especieTitulo) {
        this.especieTitulo = especieTitulo;
    }

    public long getInscricaoCedente() {
        return inscricaoCedente;
    }

    public void setInscricaoCedente(long inscricaoCedente) {
        this.inscricaoCedente = inscricaoCedente;
    }

    public long getInstrucaoProtesto() {
        return instrucaoProtesto;
    }

    public void setInstrucaoProtesto(long instrucaoProtesto) {
        this.instrucaoProtesto = instrucaoProtesto;
    }

    public String getNomeCedente() {
        return nomeCedente;
    }

    public void setNomeCedente(String nomeCedente) {
        this.nomeCedente = nomeCedente;
    }

    public long getNumeroCnpjSacado() {
        return numeroCnpjSacado;
    }

    public void setNumeroCnpjSacado(long numeroCnpjSacado) {
        this.numeroCnpjSacado = numeroCnpjSacado;
    }

    public long getNumeroDiasProtesto() {
        return numeroDiasProtesto;
    }

    public void setNumeroDiasProtesto(long numeroDiasProtesto) {
        this.numeroDiasProtesto = numeroDiasProtesto;
    }

    public long getNumeroInscricaoCedente() {
        return numeroInscricaoCedente;
    }

    public void setNumeroInscricaoCedente(long numeroInscricaoCedente) {
        this.numeroInscricaoCedente = numeroInscricaoCedente;
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

    public String getNumeroTituloParaCedente() {
        return numeroTituloParaCedente;
    }

    public void setNumeroTituloParaCedente(String numeroTituloParaCedente) {
        this.numeroTituloParaCedente = numeroTituloParaCedente;
    }

    public long getPrefixoBanco() {
        return prefixoBanco;
    }

    public void setPrefixoBanco(long prefixoBanco) {
        this.prefixoBanco = prefixoBanco;
    }

    public double getQuantidadeMoeda() {
        return quantidadeMoeda;
    }

    public void setQuantidadeMoeda(double quantidadeMoeda) {
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public double getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public double getValorNominalTitulo() {
        return valorNominalTitulo;
    }

    public void setValorNominalTitulo(double valorNominalTitulo) {
        this.valorNominalTitulo = valorNominalTitulo;
    }

    public double getValorPercentualDesconto() {
        return valorPercentualDesconto;
    }

    public void setValorPercentualDesconto(double valorPercentualDesconto) {
        this.valorPercentualDesconto = valorPercentualDesconto;
    }
}
