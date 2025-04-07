package br.com.jcomputacao.cnab.bb240.models.remessa;

/**
 *
 * @author Thiago Balthazar
 */
public class TraillerLoteModel {

    int codigoBanco;
    int loteServico;
    int tipoRegistro;
    String cnab1;
    int qtdRegistroLote;
    double somatoriaValores;
    double somatoriaQtdMoedas;
    int numeroAvisoDebito;
    String cnab;
    String ocorrencia;

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public int getLoteServico() {
        return loteServico;
    }

    public void setLoteServico(int loteServico) {
        this.loteServico = loteServico;
    }

    public int getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(int tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getCnab1() {
        return cnab1;
    }

    public void setCnab1(String cnab1) {
        this.cnab1 = cnab1;
    }

    public int getQtdRegistroLote() {
        return qtdRegistroLote;
    }

    public void setQtdRegistroLote(int qtdRegistroLote) {
        this.qtdRegistroLote = qtdRegistroLote;
    }

    public double getSomatoriaValores() {
        return somatoriaValores;
    }

    public void setSomatoriaValores(double somatoriaValores) {
        this.somatoriaValores = somatoriaValores;
    }

    public double getSomatoriaQtdMoedas() {
        return somatoriaQtdMoedas;
    }

    public void setSomatoriaQtdMoedas(double somatoriaQtdMoedas) {
        this.somatoriaQtdMoedas = somatoriaQtdMoedas;
    }

    public int getNumeroAvisoDebito() {
        return numeroAvisoDebito;
    }

    public void setNumeroAvisoDebito(int numeroAvisoDebito) {
        this.numeroAvisoDebito = numeroAvisoDebito;
    }

    public String getCnab() {
        return cnab;
    }

    public void setCnab(String cnab) {
        this.cnab = cnab;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

}
