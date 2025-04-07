package br.com.jcomputacao.cnab.bb240.models.remessa;

/**
 *
 * @author Thiago Balthazar
 */
public class TraillerArquivoModel {

    int codigoBancoCompensacao;
    int lote;
    int registro;
    String exclusivoFebraban1;
    int qtdLotes;
    int qtdRegistro;    
    String exclusivoFebraban2;

    public int getCodigoBancoCompensacao() {
        return codigoBancoCompensacao;
    }

    public void setCodigoBancoCompensacao(int codigoBancoCompensacao) {
        this.codigoBancoCompensacao = codigoBancoCompensacao;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getExclusivoFebraban1() {
        return exclusivoFebraban1;
    }

    public void setExclusivoFebraban1(String exclusivoFebraban1) {
        this.exclusivoFebraban1 = exclusivoFebraban1;
    }

    public int getQtdLotes() {
        return qtdLotes;
    }

    public void setQtdLotes(int qtdLotes) {
        this.qtdLotes = qtdLotes;
    }

    public int getQtdRegistro() {
        return qtdRegistro;
    }

    public void setQtdRegistro(int qtdRegistro) {
        this.qtdRegistro = qtdRegistro;
    }

    public String getExclusivoFebraban2() {
        return exclusivoFebraban2;
    }

    public void setExclusivoFebraban2(String exclusivoFebraban2) {
        this.exclusivoFebraban2 = exclusivoFebraban2;
    }

}
