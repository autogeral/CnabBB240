package br.com.jcomputacao.cnab.bb240.models.remessa;

/**
 * 20/03/2015 14:31:06
 *
 * @author Thiago
 */
public class SegmentoBModel {

    int codigoBanco;
    int loteServico;
    int tipoRegistro = 3;
    int numeroSquencialRegistroLote;
    String codigoSegmentoReDetalhe;
    String cnab;
    int tipoInscricaoFavorecido;
    int nInscricaoFavorecido;
    String logradouro;
    int numeroLocal;
    String complemento;
    String bairro;
    String nomeCidade;
    String cep;
    String complementoCep;
    String estado;
    int vencimento;
    double valorDocumento;
    double valorAbatimento;
    double desconto;
    double mora;
    double multa;
    String codigoDocumentoFavorecido;
    int aviso;
    int siape;
    int ispb;

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

    public String getCnab() {
        return cnab;
    }

    public void setCnab(String cnab) {
        this.cnab = cnab;
    }

    public int getTipoInscricaoFavorecido() {
        return tipoInscricaoFavorecido;
    }

    public void setTipoInscricaoFavorecido(int tipoInscricaoFavorecido) {
        this.tipoInscricaoFavorecido = tipoInscricaoFavorecido;
    }

    public int getnInscricaoFavorecido() {
        return nInscricaoFavorecido;
    }

    public void setnInscricaoFavorecido(int nInscricaoFavorecido) {
        this.nInscricaoFavorecido = nInscricaoFavorecido;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(int numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplementoCep() {
        return complementoCep;
    }

    public void setComplementoCep(String complementoCep) {
        this.complementoCep = complementoCep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public double getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(double valorDocumento) {
        this.valorDocumento = valorDocumento;
    }

    public double getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getMora() {
        return mora;
    }

    public void setMora(double mora) {
        this.mora = mora;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public String getCodigoDocumentoFavorecido() {
        return codigoDocumentoFavorecido;
    }

    public void setCodigoDocumentoFavorecido(String codigoDocumentoFavorecido) {
        this.codigoDocumentoFavorecido = codigoDocumentoFavorecido;
    }

    public int getAviso() {
        return aviso;
    }

    public void setAviso(int aviso) {
        this.aviso = aviso;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public int getIspb() {
        return ispb;
    }

    public void setIspb(int ispb) {
        this.ispb = ispb;
    }

}
