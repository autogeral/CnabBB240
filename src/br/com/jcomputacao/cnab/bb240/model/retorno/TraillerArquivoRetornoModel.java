/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.model.retorno;

/**
 *
 * @author Marcos
 */
public class TraillerArquivoRetornoModel {

    private long quantidadeRegistros = 0;
    private long quantidadeLotes = 0;

    public long getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    public void setQuantidadeRegistros(long quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    public long getQuantidadeLotes() {
        return quantidadeLotes;
    }

    public void setQuantidadeLotes(long quantidadeLotes) {
        this.quantidadeLotes = quantidadeLotes;
    }

}
