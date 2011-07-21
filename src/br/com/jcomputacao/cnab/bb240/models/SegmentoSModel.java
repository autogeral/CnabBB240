/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.models;

/**
 *
 * @author Marcos
 */
public class SegmentoSModel {

    private long numeroLoteServico = 0;
    private long numeroSequencial = 0;
    private long numeroCodigoRemessa =0;
    private long numeroIdentificacaoImpressao = 0;
    private String mensagemImpressa = "";

    public String getMensagemImpressa() {
        return mensagemImpressa;
    }

    public void setMensagemImpressa(String mensagemImpressa) {
        this.mensagemImpressa = mensagemImpressa;
    }

    public long getNumeroCodigoRemessa() {
        return numeroCodigoRemessa;
    }

    public void setNumeroCodigoRemessa(long numeroCodigoRemessa) {
        this.numeroCodigoRemessa = numeroCodigoRemessa;
    }

    public long getNumeroIdentificacaoImpressao() {
        return numeroIdentificacaoImpressao;
    }

    public void setNumeroIdentificacaoImpressao(long numeroIdentificacaoImpressao) {
        this.numeroIdentificacaoImpressao = numeroIdentificacaoImpressao;
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
