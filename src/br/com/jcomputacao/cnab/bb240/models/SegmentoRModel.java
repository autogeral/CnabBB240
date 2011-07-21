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
public class SegmentoRModel {

    private long numeroLoteServico = 0;
    private long numeroSequencial = 0;
    private long numeroCodigoRemessa =0;
    private long codigoMulta = 0;
    private Date dataMulta = null;
    private double valorPercMulta =0;
    private String mensagem3 = "";

    public long getCodigoMulta() {
        return codigoMulta;
    }

    public void setCodigoMulta(long codigoMulta) {
        this.codigoMulta = codigoMulta;
    }

    public Date getDataMulta() {
        return dataMulta;
    }

    public void setDataMulta(Date dataMulta) {
        this.dataMulta = dataMulta;
    }

    public String getMensagem3() {
        return mensagem3;
    }

    public void setMensagem3(String mensagem3) {
        this.mensagem3 = mensagem3;
    }

    public long getNumeroCodigoRemessa() {
        return numeroCodigoRemessa;
    }

    public void setNumeroCodigoRemessa(long numeroCodigoRemessa) {
        this.numeroCodigoRemessa = numeroCodigoRemessa;
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

    public double getValorPercMulta() {
        return valorPercMulta;
    }

    public void setValorPercMulta(double valorPercMulta) {
        this.valorPercMulta = valorPercMulta;
    }

}
