/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Essa classe só pode ser utilizada para
 * tipo de impressão 1 ou 2.
 * Banco do Brasil não trata impressão 3
 * @author Marcos
 */
public class LineCnab240BBSegmentoS extends LineArchetype{
    
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
    public static final String CODIGO_SEGMENTO = "CODIGO_SERVICO";

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
     * IDENTIFICACAO DA IMPRESSAO
     * 8' – para Bloqueto por email. Esse segmento é utilizado no
     * Banco do Brasil somente para informar o email de sacados
     * que receberão seus títulos por email. Para isso, é necessário
     * o cadastramento prévio dessa opção no seu convênio de
     * cobrança junto ao Banco do Brasil. Nesse caso, solicite a sua
     * agência de relacionamento
     * 1 ESPACO
     * POSICAO 018 018
     */
    public static final String IDENTIFICAO_IMPRESSAO = "IDENTIFICAO_IMPRESSAO";

    /**
     * NUMERO DA LINHA A SER IMPRESSA
     * 2 ESPACOS
     * POSICAO 019 020
     */
    public static final String NUMERO_LINHA = "NUMERO_LINHA";

    /**
     * MENSAGEM A SER IMPRESSA
     * POSICAO 021 160
     * 140 ESPACOS
     */
    public static final String MENSAGEM_IMPRESSA = "MENSAGEM_IMPRESSA";

    /**
     * TIPO DO CARACTER A SER IMPRESSO
     * POSICAO 161 162
     * INFORMAR 2 ZEROS
     */
    public static final String TIPO_CARACTER = "TIPO_CARACTER";

    /**
     * USO EXCLUSIVO DA FEBRABAN / CNAB
     * CAMPO NAO TRATADO PELO BB
     * POSICAO 163 240
     * INFORMAR 78 BRANCOS ' '
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

     public LineCnab240BBSegmentoS() {

//*****************************Segmento S****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldDefaultArchetype("001"));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("S"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(IDENTIFICAO_IMPRESSAO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_LINHA, new FieldDefaultArchetype("00"));
        addFieldArchetype(MENSAGEM_IMPRESSA, new FieldStringFixedLengthArchetype(140));
        addFieldArchetype(TIPO_CARACTER, new FieldDefaultArchetype("00"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(78, ' '));

    }
}
