/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.models.remessa;

/**
 *
 * @author Marcos
 */
public class SegmentoPModel {

    private long numeroLote = 0;
    private long numeroSequencial = 0;
    private long codigoRemessa = 0;
    private long numeroAgencia = 0;
    private char digitoVerificadorAgencia = ' ';
    private long numeroContaCorrente = 0;
    private char digitoVerificadorContaCorrente = ' ';
    private String identificacaoTituloBanco = "";

    public long getCodigoRemessa() {
        return codigoRemessa;
    }

    public void setCodigoRemessa(long codigoRemessa) {
        this.codigoRemessa = codigoRemessa;
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

    public String getIdentificacaoTituloBanco() {
        return identificacaoTituloBanco;
    }

    public void setIdentificacaoTituloBanco(String identificacaoTituloBanco) {
        this.identificacaoTituloBanco = identificacaoTituloBanco;
    }

    public long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public long getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(long numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public long getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(long numeroLote) {
        this.numeroLote = numeroLote;
    }

    public long getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(long numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }
}
