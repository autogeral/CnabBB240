package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240BBSegmentoQ extends LineArchetype{

    /**
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCOS_COMPENSACAO";

    /**
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     */
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";

    /**
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";

    /**
     * SEQUENCIAL DE REGISTRO DO ARQUIVO NO LOTE
     * TIPO DE OPERACAO
     * POSICAO 009 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";

    /**
     * CODIGO DO SEGMENTO DO REGISTRO DETALHE
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO 'Q'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";

    /**
     * CODIGO DO SERVICO
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO ' '
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * CODIGO DE MOVIMENTO DE REMESSA
     * POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";

    /**
     * TIPO DE INSCRICAO - 1 CPF - 2 - CNPJ
     * POSICAO 018 018
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";

    /**
     * CODIGO DE INSCRICAO
     * CONTEUDO DO CNPJ OU CPF
     * POSICAO 019 033
     * PICTURE 9(01)
     */
    public static final String CODIGO_INSCRICAO = "CODIGO_INSCRICAO";

    /**
     * NOME DO CLIENTE
     * POSICAO 34 073
     */
    public static final String NOME = "NOME";

    /**
     * ENDERECO DO CLIENTE
     * POSICAO 074 113
     */
    public static final String ENDERECO = "ENDERECO";

    /**
     * COBRANCA CEDENTE BB
     * POSICAO 114 128
     * PICTURE 9(4)
     * CONTEUDO NOTA 2
     */
    public static final String BAIRRO = "BAIRRO";

    /**
     * CEP DO CLIENTE
     * POSICAO 129 133
     */
    public static final String CEP = "CEP";
    
    /**
     * SUFIXO DO CEP DO CLIENTE
     * POSICAO 134 136
     */
    public static final String SUFIXO_CEP = "SUFIXO_CEP";

    /**
     * CIDADE DO CLIENTE
     * POSICAO 137 151
     */
    public static final String CIDADE = "CIDADE";

    /**
     * UF DO CLIENTE
     * POSICAO 152 153
     */
    public static final String UF = "UF";

    /**
     * TIPO_INSCRICAO_TERCEIRO
     * Este campo deve estar preenchido somente quando o
     * Cedente original do título for outro. Caso não haja
     * sacador/avalista preencher com '0' (zero) ou 'branco' (espaço)
     * POSICAO 154 154
     */
    public static final String TIPO_INSCRICAO_TERCEIRO = "TIPO_INSCRICAO_TERCEIRO";

    /**
     * NUMERO INSCRICAO TERCEIRO
     * Este campo deve estar preenchido somente quando o
     * Cedente original do título for outro. Caso não haja
     * sacador/avalista preencher com '0' (zero) ou 'branco' (espaço)
     * POSICAO 155 169
     */
    public static final String NUMERO_INSCRICAO_TERCEIRO = "NUMERO_INSCRICAO_TERCEIRO";

    /**
     * NOME DO SACADOR / AVALISTA
     * POSICAO 170 209
     */
    public static final String NOME_SACADOR = "NOME_SACADOR";

    /**
     * CODIGO DO BANCO CORRESPONDENTE NA COMPENSACAO
     * NAO TRATADO - PREENCHER COM '0'
     * POSICAO 210 212
     */
    public static final String CODIGO_BANCO_CORRESP = "CODIGO_BANCO_CORRESP";

    /**
     * NOSSO NUMERO NO BANCO CORRESPONDENTE NA COMPENSACAO
     * NAO TRATADO - PREENCHER COM ' '
     * POSICAO 213 232
     */
    public static final String NOSSO_NUMERO = "NOSSO_NUMERO";

    /* BRANCOS
     * COMPLEMENTO DE REGISTRO
     * POSICAO 233 240
     * PICTURE X(33)
     * CONTEUDO BRANCOS
     */
    public static final String BRANCOS = "BRANCOS";

        public LineCnab240BBSegmentoQ() {

//*****************************Registro Header de Lote****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("Q"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_INSCRICAO, new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(ENDERECO, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(BAIRRO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(CEP, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(SUFIXO_CEP, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CIDADE, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(TIPO_INSCRICAO_TERCEIRO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_INSCRICAO_TERCEIRO, new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(NOME_SACADOR, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(CODIGO_BANCO_CORRESP, new FieldDefaultArchetype("000"));
        addFieldArchetype(NOSSO_NUMERO, new FieldFillerArchetype(20, ' '));
        addFieldArchetype(BRANCOS, new FieldFillerArchetype(8, ' '));

    }
}
