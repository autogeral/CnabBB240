/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.model.retorno;

/**
 *
 * @author Marcos
 */
public class TraillerArquivoModel {

    private long prefixoBanco = 0;
    private long numeroLoteServico = 0;
    private long codigoRegistro = 0;
    private long quantidadeRegistros = 0;
    private double valorTotal = 0;

    public long getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(long codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public long getNumeroLoteServico() {
        return numeroLoteServico;
    }

    public void setNumeroLoteServico(long numeroLoteServico) {
        this.numeroLoteServico = numeroLoteServico;
    }

    public long getPrefixoBanco() {
        return prefixoBanco;
    }

    public void setPrefixoBanco(long prefixoBanco) {
        this.prefixoBanco = prefixoBanco;
    }

    public long getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    public void setQuantidadeRegistros(long quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
