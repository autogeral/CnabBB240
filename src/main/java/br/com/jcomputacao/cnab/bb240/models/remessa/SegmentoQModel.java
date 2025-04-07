/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.models.remessa;

/**
 *
 * @author Marcos
 */
public class SegmentoQModel {

    private long numeroLoteServico = 0;
    private long numeroSequencial = 0;
    private long numeroCodigoRemessa =0;
    private long numeroTipoInscricao = 0;
    private long numeroInscricao = 0;
    private String nome = "";
    private String endereco = "";
    private String bairro = "";
    private long numeroCep = 0;
    private long numeroSufixoCep = 0;
    private String cidade = "";
    private String unidadeFederacao = "";
    private long numeroTipoInscricaoSacador = 0;
    private long numeroInscricaoSacador = 0;
    private String nomeSacador = "";

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSacador() {
        return nomeSacador;
    }

    public void setNomeSacador(String nomeSacador) {
        this.nomeSacador = nomeSacador;
    }

    public long getNumeroCep() {
        return numeroCep;
    }

    public void setNumeroCep(long numeroCep) {
        this.numeroCep = numeroCep;
    }

    public long getNumeroCodigoRemessa() {
        return numeroCodigoRemessa;
    }

    public void setNumeroCodigoRemessa(long numeroCodigoRemessa) {
        this.numeroCodigoRemessa = numeroCodigoRemessa;
    }

    public long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(long numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public long getNumeroInscricaoSacador() {
        return numeroInscricaoSacador;
    }

    public void setNumeroInscricaoSacador(long numeroInscricaoSacador) {
        this.numeroInscricaoSacador = numeroInscricaoSacador;
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

    public long getNumeroSufixoCep() {
        return numeroSufixoCep;
    }

    public void setNumeroSufixoCep(long numeroSufixoCep) {
        this.numeroSufixoCep = numeroSufixoCep;
    }

    public long getNumeroTipoInscricao() {
        return numeroTipoInscricao;
    }

    public void setNumeroTipoInscricao(long numeroTipoInscricao) {
        this.numeroTipoInscricao = numeroTipoInscricao;
    }

    public long getNumeroTipoInscricaoSacador() {
        return numeroTipoInscricaoSacador;
    }

    public void setNumeroTipoInscricaoSacador(long numeroTipoInscricaoSacador) {
        this.numeroTipoInscricaoSacador = numeroTipoInscricaoSacador;
    }

    public String getUnidadeFederacao() {
        return unidadeFederacao;
    }

    public void setUnidadeFederacao(String unidadeFederacao) {
        this.unidadeFederacao = unidadeFederacao;
    }
}
