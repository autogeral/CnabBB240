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
public class SegmentoHModel {

    private long prefixoBanco = 1;
    private long numeroLoteServico = 0;
    private long codigoRegistro = 3;
    private long numeroSequencial = 0;
    private char codigoSegmento = 'H';
    private long codigoMovimento = 0;
    private long inscricaoSacador = 0;
    private long numeroInscricaoSacador = 0;
    private String nomeSacador = "";
    private long codigoDesconto1 = 0;
    private Date dataDesconto1 = null;
    private double valorPercentualDesconto1 = 0;
    private long codigoDesconto2 = 0;
    private Date dataDesconto2 = null;
    private double valorPercentualDesconto2 = 0;
    private long codigoMulta = 0;
    private Date dataMulta = null;
    private double valorPercentualMulta = 0;
    private double valorJurosPorDia = 0;
    private String mensagem1 = "";
    private String mensagem2 = "";

    public long getCodigoDesconto1() {
        return codigoDesconto1;
    }

    public void setCodigoDesconto1(long codigoDesconto1) {
        this.codigoDesconto1 = codigoDesconto1;
    }

    public long getCodigoDesconto2() {
        return codigoDesconto2;
    }

    public void setCodigoDesconto2(long codigoDesconto2) {
        this.codigoDesconto2 = codigoDesconto2;
    }

    public long getCodigoMovimento() {
        return codigoMovimento;
    }

    public void setCodigoMovimento(long codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
    }

    public long getCodigoMulta() {
        return codigoMulta;
    }

    public void setCodigoMulta(long codigoMulta) {
        this.codigoMulta = codigoMulta;
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

    public Date getDataDesconto1() {
        return dataDesconto1;
    }

    public void setDataDesconto1(Date dataDesconto1) {
        this.dataDesconto1 = dataDesconto1;
    }

    public Date getDataDesconto2() {
        return dataDesconto2;
    }

    public void setDataDesconto2(Date dataDesconto2) {
        this.dataDesconto2 = dataDesconto2;
    }

    public Date getDataMulta() {
        return dataMulta;
    }

    public void setDataMulta(Date dataMulta) {
        this.dataMulta = dataMulta;
    }

    public long getInscricaoSacador() {
        return inscricaoSacador;
    }

    public void setInscricaoSacador(long inscricaoSacador) {
        this.inscricaoSacador = inscricaoSacador;
    }

    public String getMensagem1() {
        return mensagem1;
    }

    public void setMensagem1(String mensagem1) {
        this.mensagem1 = mensagem1;
    }

    public String getMensagem2() {
        return mensagem2;
    }

    public void setMensagem2(String mensagem2) {
        this.mensagem2 = mensagem2;
    }

    public String getNomeSacador() {
        return nomeSacador;
    }

    public void setNomeSacador(String nomeSacador) {
        this.nomeSacador = nomeSacador;
    }

    public long getNumeroInscricaoSacador() {
        return numeroInscricaoSacador;
    }

    public void setNumeroInscricaoSacador(long numeroInscricaoSacador) {
        this.numeroInscricaoSacador = numeroInscricaoSacador;
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

    public long getPrefixoBanco() {
        return prefixoBanco;
    }

    public void setPrefixoBanco(long prefixoBanco) {
        this.prefixoBanco = prefixoBanco;
    }

    public double getValorJurosPorDia() {
        return valorJurosPorDia;
    }

    public void setValorJurosPorDia(double valorJurosPorDia) {
        this.valorJurosPorDia = valorJurosPorDia;
    }

    public double getValorPercentualDesconto1() {
        return valorPercentualDesconto1;
    }

    public void setValorPercentualDesconto1(double valorPercentualDesconto1) {
        this.valorPercentualDesconto1 = valorPercentualDesconto1;
    }

    public double getValorPercentualDesconto2() {
        return valorPercentualDesconto2;
    }

    public void setValorPercentualDesconto2(double valorPercentualDesconto2) {
        this.valorPercentualDesconto2 = valorPercentualDesconto2;
    }

    public double getValorPercentualMulta() {
        return valorPercentualMulta;
    }

    public void setValorPercentualMulta(double valorPercentualMulta) {
        this.valorPercentualMulta = valorPercentualMulta;
    }
}
