/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.models;

/**
 *
 * @author Marcos
 */
public class TraillerLoteModel {

    private long numeroLoteServico = 0;
    private long numeroRegistrosLote = 0;

    public long getNumeroLoteServico() {
        return numeroLoteServico;
    }

    public void setNumeroLoteServico(long numeroLoteServico) {
        this.numeroLoteServico = numeroLoteServico;
    }

    public long getNumeroRegistrosLote() {
        return numeroRegistrosLote;
    }

    public void setNumeroRegistrosLote(long numeroRegistrosLote) {
        this.numeroRegistrosLote = numeroRegistrosLote;
    }
}
