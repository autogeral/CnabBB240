/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.models;

/**
 *
 * @author Marcos
 */
public class SegmentoPModel {

    private int numeroLote = 0;
    private int numeroSequencial = 0;
    private int codigoRemessa = 0;
    private int numeroAgencia = 0;
    private char digitoVerificadorAgencia = ' ';
    private int numeroContaCorrente = 0;
    private char digitoVerificadorContaCorrente = ' ';
    private String identificacaoTituloBanco = "";

    public int getCodigoRemessa() {
        return codigoRemessa;
    }

    public void setCodigoRemessa(int codigoRemessa) {
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

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(int numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public int getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(int numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }
}
