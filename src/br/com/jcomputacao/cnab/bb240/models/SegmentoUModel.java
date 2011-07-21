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
public class SegmentoUModel {

    private long numeroLoteServico = 0;
    private long numeroSequencial = 0;
    private long numeroCodigoRetorno =0;
    private double valorJurosMultaEncargos = 0;
    private double valorDesconto = 0;
    private double valorAbatimentoConcedCancel = 0;
    private double valorIOF = 0;
    private double valorPagoSacado = 0;
    private double valorLiquidoCreditado = 0;
    private double valorOutrasDespesas = 0;
    private double valorOutrosCreditos = 0;
    private Date dataOcorrencia = null;
    private Date dataEfetivacaoCredito = null;

    public Date getDataEfetivacaoCredito() {
        return dataEfetivacaoCredito;
    }

    public void setDataEfetivacaoCredito(Date dataEfetivacaoCredito) {
        this.dataEfetivacaoCredito = dataEfetivacaoCredito;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public long getNumeroCodigoRetorno() {
        return numeroCodigoRetorno;
    }

    public void setNumeroCodigoRetorno(long numeroCodigoRetorno) {
        this.numeroCodigoRetorno = numeroCodigoRetorno;
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

    public double getValorAbatimentoConcedCancel() {
        return valorAbatimentoConcedCancel;
    }

    public void setValorAbatimentoConcedCancel(double valorAbatimentoConcedCancel) {
        this.valorAbatimentoConcedCancel = valorAbatimentoConcedCancel;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorIOF() {
        return valorIOF;
    }

    public void setValorIOF(double valorIOF) {
        this.valorIOF = valorIOF;
    }

    public double getValorJurosMultaEncargos() {
        return valorJurosMultaEncargos;
    }

    public void setValorJurosMultaEncargos(double valorJurosMultaEncargos) {
        this.valorJurosMultaEncargos = valorJurosMultaEncargos;
    }

    public double getValorLiquidoCreditado() {
        return valorLiquidoCreditado;
    }

    public void setValorLiquidoCreditado(double valorLiquidoCreditado) {
        this.valorLiquidoCreditado = valorLiquidoCreditado;
    }

    public double getValorOutrasDespesas() {
        return valorOutrasDespesas;
    }

    public void setValorOutrasDespesas(double valorOutrasDespesas) {
        this.valorOutrasDespesas = valorOutrasDespesas;
    }

    public double getValorOutrosCreditos() {
        return valorOutrosCreditos;
    }

    public void setValorOutrosCreditos(double valorOutrosCreditos) {
        this.valorOutrosCreditos = valorOutrosCreditos;
    }

    public double getValorPagoSacado() {
        return valorPagoSacado;
    }

    public void setValorPagoSacado(double valorPagoSacado) {
        this.valorPagoSacado = valorPagoSacado;
    }
}
