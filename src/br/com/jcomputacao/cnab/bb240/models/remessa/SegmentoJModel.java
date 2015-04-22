package br.com.jcomputacao.cnab.bb240.models.remessa;

/**
 * 20/03/2015 14:39:21
 *
 * @author Thiago 
 */
public class SegmentoJModel {

    int codigoBanco;
    int loteServico;
    int tipoRegistro = 3;
    int numeroSquencialRegistroLote;
    String codigoSegmentoReDetalhe;
    int tipoMovimento;
    int codigoInstrucaoMovimento;
    int codigoBarras;
    String nomeCedente;
    int dataVencimento;
    double valorTitulo;
    double valorDesconto;
    double valorMoraMulta;
    int dataPagamento;
    double valorPagamento;
    double quantidadeMoeda;
    String nDoctoAtributoEmpresa;
    String nDoctoAtributoBanco;
    double codigoMoeda;
    String cnab;
    String ocorrencias;

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

    public int getNumeroSquencialRegistroLote() {
        return numeroSquencialRegistroLote;
    }

    public void setNumeroSquencialRegistroLote(int numeroSquencialRegistroLote) {
        this.numeroSquencialRegistroLote = numeroSquencialRegistroLote;
    }

    public String getCodigoSegmentoReDetalhe() {
        return codigoSegmentoReDetalhe;
    }

    public void setCodigoSegmentoReDetalhe(String codigoSegmentoReDetalhe) {
        this.codigoSegmentoReDetalhe = codigoSegmentoReDetalhe;
    }

    public int getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(int tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public int getCodigoInstrucaoMovimento() {
        return codigoInstrucaoMovimento;
    }

    public void setCodigoInstrucaoMovimento(int codigoInstrucaoMovimento) {
        this.codigoInstrucaoMovimento = codigoInstrucaoMovimento;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNomeCedente() {
        return nomeCedente;
    }

    public void setNomeCedente(String nomeCedente) {
        this.nomeCedente = nomeCedente;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorMoraMulta() {
        return valorMoraMulta;
    }

    public void setValorMoraMulta(double valorMoraMulta) {
        this.valorMoraMulta = valorMoraMulta;
    }

    public int getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(int dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public double getQuantidadeMoeda() {
        return quantidadeMoeda;
    }

    public void setQuantidadeMoeda(double quantidadeMoeda) {
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public String getnDoctoAtributoEmpresa() {
        return nDoctoAtributoEmpresa;
    }

    public void setnDoctoAtributoEmpresa(String nDoctoAtributoEmpresa) {
        this.nDoctoAtributoEmpresa = nDoctoAtributoEmpresa;
    }

    public String getnDoctoAtributoBanco() {
        return nDoctoAtributoBanco;
    }

    public void setnDoctoAtributoBanco(String nDoctoAtributoBanco) {
        this.nDoctoAtributoBanco = nDoctoAtributoBanco;
    }

    public double getCodigoMoeda() {
        return codigoMoeda;
    }

    public void setCodigoMoeda(double codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
    }

    public String getCnab() {
        return cnab;
    }

    public void setCnab(String cnab) {
        this.cnab = cnab;
    }

    public String getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

}
