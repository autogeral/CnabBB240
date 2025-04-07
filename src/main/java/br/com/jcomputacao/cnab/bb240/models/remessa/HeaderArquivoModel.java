package br.com.jcomputacao.cnab.bb240.models.remessa;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class HeaderArquivoModel {

    //Dados de Controle
    public int codigoBanco = 0;
    public int loteTipoRegistro = 0;
    public int loteServico = 0;
    public int registroHeaderArquivo = 0;
    public String exclusivoFebraban1 = "";
    
    //Dados Empresa
    private long tipoInscricao = 0;
    private long numeroInscricao = 0;
    private String codigoConvenio = "";
    private long agenciaMantenedora = 0;
    private String digitoVerificadorAgencia = "";
    private long numeroConta = 0;
    private String digitoVerificadorConta = "";
    private String nomeEmpresa = "";
    private String nomeBanco = "";
    public String exclusivoFebraban2 = "";
    
    //DAdos do arquivo
    private long codigoRemessaRetorno = 0;
    private java.util.Date dataHoraGeracao;
    private long numeroSequencialRegistro = 0;
    public String versaoLayout = "";
    private long densidadeGravacaoArquivo = 0;
    public String densidade_gravacao = "";
    public String reservadoBanco = "";
    public String reservadoEmpresa = "";
    public String exclusivoFebraban3 = "";
    public String identificacao = "";
    public String ControleVans = "";
    public String tipoServico = "";
    public String ocorrencias = "";
    

    public long getAgenciaMantenedora() {
        return agenciaMantenedora;
    }

    public void setAgenciaMantenedora(long agenciaMantenedora) {
        this.agenciaMantenedora = agenciaMantenedora;
    }

    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    public long getCodigoRemessaRetorno() {
        return codigoRemessaRetorno;
    }

    public void setCodigoRemessaRetorno(long codigoRemessaRetorno) {
        this.codigoRemessaRetorno = codigoRemessaRetorno;
    }

    public Date getDataHoraGeracao() {
        return dataHoraGeracao;
    }

    public void setDataHoraGeracao(Date dataHoraGeracao) {
        this.dataHoraGeracao = dataHoraGeracao;
    }

    public long getDensidadeGravacaoArquivo() {
        return densidadeGravacaoArquivo;
    }

    public void setDensidadeGravacaoArquivo(long densidadeGravacaoArquivo) {
        this.densidadeGravacaoArquivo = densidadeGravacaoArquivo;
    }

    public String getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    }

    public String getDigitoVerificadorConta() {
        return digitoVerificadorConta;
    }

    public void setDigitoVerificadorConta(String digitoVerificadorConta) {
        this.digitoVerificadorConta = digitoVerificadorConta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(long numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public long getNumeroSequencialRegistro() {
        return numeroSequencialRegistro;
    }

    public void setNumeroSequencialRegistro(long numeroSequencialRegistro) {
        this.numeroSequencialRegistro = numeroSequencialRegistro;
    }

    public String getReservadoEmpresa() {
        return reservadoEmpresa;
    }

    public void setReservadoEmpresa(String reservadoEmpresa) {
        this.reservadoEmpresa = reservadoEmpresa;
    }

    public long getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(long tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public int getLoteTipoRegistro() {
        return loteTipoRegistro;
    }

    public void setLoteTipoRegistro(int loteTipoRegistro) {
        this.loteTipoRegistro = loteTipoRegistro;
    }

    public int getLoteServico() {
        return loteServico;
    }

    public void setLoteServico(int loteServico) {
        this.loteServico = loteServico;
    }

    public int getRegistroHeaderArquivo() {
        return registroHeaderArquivo;
    }

    public void setRegistroHeaderArquivo(int registroHeaderArquivo) {
        this.registroHeaderArquivo = registroHeaderArquivo;
    }

    public String getExclusivoFebraban1() {
        return exclusivoFebraban1;
    }

    public void setExclusivoFebraban1(String exclusivoFebraban1) {
        this.exclusivoFebraban1 = exclusivoFebraban1;
    }

    public String getExclusivoFebraban2() {
        return exclusivoFebraban2;
    }

    public void setExclusivoFebraban2(String exclusivoFebraban2) {
        this.exclusivoFebraban2 = exclusivoFebraban2;
    }

    public String getVersaoLayout() {
        return versaoLayout;
    }

    public void setVersaoLayout(String versaoLayout) {
        this.versaoLayout = versaoLayout;
    }

    public String getDensidade_gravacao() {
        return densidade_gravacao;
    }

    public void setDensidade_gravacao(String densidade_gravacao) {
        this.densidade_gravacao = densidade_gravacao;
    }

    public String getReservadoBanco() {
        return reservadoBanco;
    }

    public void setReservadoBanco(String reservadoBanco) {
        this.reservadoBanco = reservadoBanco;
    }

    public String getExclusivoFebraban3() {
        return exclusivoFebraban3;
    }

    public void setExclusivoFebraban3(String exclusivoFebraban3) {
        this.exclusivoFebraban3 = exclusivoFebraban3;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getControleVans() {
        return ControleVans;
    }

    public void setControleVans(String ControleVans) {
        this.ControleVans = ControleVans;
    }

    public String getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }
    
    
}
