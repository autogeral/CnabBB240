/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.models.remessa;

/**
 *
 * @author Marcos
 */
public class SegmentoY05Model {

    private long numeroLoteServico = 0;
    private long numeroSequencial = 0;
    private long numeroCodigoRemessa =0;
    private String identificacaoCheque1 = "";
    private String identificacaoCheque2 = "";
    private String identificacaoCheque3 = "";
    private String identificacaoCheque4 = "";
    private String identificacaoCheque5 = "";
    private long identificacaoCheque6 = 0;

    public String getIdentificacaoCheque1() {
        return identificacaoCheque1;
    }

    public void setIdentificacaoCheque1(String identificacaoCheque1) {
        this.identificacaoCheque1 = identificacaoCheque1;
    }

    public String getIdentificacaoCheque2() {
        return identificacaoCheque2;
    }

    public void setIdentificacaoCheque2(String identificacaoCheque2) {
        this.identificacaoCheque2 = identificacaoCheque2;
    }

    public String getIdentificacaoCheque3() {
        return identificacaoCheque3;
    }

    public void setIdentificacaoCheque3(String identificacaoCheque3) {
        this.identificacaoCheque3 = identificacaoCheque3;
    }

    public String getIdentificacaoCheque4() {
        return identificacaoCheque4;
    }

    public void setIdentificacaoCheque4(String identificacaoCheque4) {
        this.identificacaoCheque4 = identificacaoCheque4;
    }

    public String getIdentificacaoCheque5() {
        return identificacaoCheque5;
    }

    public void setIdentificacaoCheque5(String identificacaoCheque5) {
        this.identificacaoCheque5 = identificacaoCheque5;
    }

    public long getIdentificacaoCheque6() {
        return identificacaoCheque6;
    }

    public void setIdentificacaoCheque6(long identificacaoCheque6) {
        this.identificacaoCheque6 = identificacaoCheque6;
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

}
