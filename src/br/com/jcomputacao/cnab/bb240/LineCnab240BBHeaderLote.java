/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author David
 */
public class LineCnab240BBHeaderLote extends LineArchetype {

    /**
     * CODIGO DO BANCO - DEFAULT 001 POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCOS_COMPENSACAO";

    /**
     * CODIGO DO LOTE LOTE DE SERVICO POSICAO 004 007
     */
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";

    /**
     * TIPO DE REGISTRO - DEFAULT 1 REGISTRO HEADER DO LOTE POSICAO 008 008
     */
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";

    /**
     * OPERACAO TIPO DE OPERACAO POSICAO 009 009 CONTEUDO 'R'=REMESSA
     * 'T'=RETORNO
     */
    public static final String OPERACAO = "OPERACAO";

    /**
     * CODIGO DO SERVICO IDENTIFICACAO DO TIPO DE SERVICO POSICAO 010 011
     * CONTEUDO '01'
     */
    public static final String CODIGO_SERVICO = "CODIGO_SERVICO";

    /**
     * CODIGO DO SERVICO IDENTIFICACAO DO TIPO DE SERVICO POSICAO 012 013
     * CONTEUDO ' '
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * LAYOUT DO LOTE NUMERO DA VERSAO DO LAYOUT DO LOTE POSICAO 014 016 PICTURE
     * 9(03) CONTEUDO '042'
     */
    public static final String LAYOUT_LOTE = "LAYOUT_LOTE";

    /**
     * BRANCOS COMPLEMENTO DE REGISTRO POSICAO 017 017 CONTEUDO BRANCOS
     */
    public static final String BRANCOS_LAYOUT_LOTE = "BRANCOS_LAYOUT_LOTE";

    /**
     * CODIGO DE INSCRICAO TIPO DE INSCRICAO DA EMPRESA POSICAO 018 018 PICTURE
     * 9(01) CONTEUDO '1'=CPF / '2'=CNPJ
     */
    public static final String CODIGO_INSCRICAO = "CODIGO_INSCRICAO_2";

    /**
     * INSCRICAO NUMERO NUMERO DE INSCRICAO DA EMPRESA NUMERO DO CNPJ - CPF
     * POSICAO 019 033 PICTURE 9(15) CONTEUDO NOTA 2
     */
    public static final String INSCRICAO_NUMERO = "INSCRICAO_NUMERO_2";

    /**
     * NUMERO DO CONVENIO DE COBRANCA POSICAO 034 042 PICTURE 9(9) CONTEUDO NOTA
     * 2
     */
    public static final String CONVENIO_COBRANCA = "CONVENIO_COBRANCA";

    /**
     * COBRANCA CEDENTE BB POSICAO 043 046 PICTURE 9(4) CONTEUDO NOTA 2
     */
    public static final String COBRANCA_CEDENTE = "COBRANCA_CEDENTE";

    /**
     * NUMERO CARTEIRA COBRANCA POSICAO 047 048 PICTURE 9(2) CONTEUDO NOTA 2
     */
    public static final String CARTEIRA_COBRANCA = "CARTEIRA_COBRANCA";

    /**
     * VARIACAO DA CARTEIRA DE COBRANCA POSICAO 049 051 PICTURE 9(3) CONTEUDO
     * NOTA 2
     */
    public static final String VARIACAO_CARTEIRA_COBRANCA = "VARIACAO_CARTEIRA_COBRANCA";

    /**
     * CAMPO PARA REMESSA DE TESTE CASO NAO FOR TESTE PREENCHER COM BRANCOS AO
     * CONTRARIO PREENCHER COM TS POSICAO 052 053 PICTURE 9(2) CONTEUDO NOTA 2
     */
    public static final String CAMPO_REMESSA_TESTE = "CAMPO_REMESSA_TESTE";

    /* AGENCIA
     * AGENCIA MANTENEDORA DA CONTA
     * POSICAO 054 058
     * PICTURE 9(05)
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";

    /**
     * DIGITO VERIFICADOR DA CONTA POSICAO 059 059 PICTURE X(01)
     */
    public static final String DIGITO_VERIFICADOR_1 = "DIGITO_VERIFICADOR_1";

    /**
     * NUMERO DA CONTA CORRENTE POSICAO 060 071 PICTURE 9(12)
     */
    public static final String NUMERO_CONTA = "NUMERO_CONTA";

    /**
     * DIGITO VERIFICADOR DA CONTA POSICAO 072 072 PICTURE X(01)
     */
    public static final String DIGITO_VERIFICADOR_2 = "DIGITO_VERIFICADOR_2";

    /**
     * COMPLEMENTO DE REGISTRO POSICAO 073 073 PICTURE X(01) CONTEUDO BRANCOS
     */
    public static final String BRANCOS_CONTA_2 = "BRANCOS_CONTA_2";

    /**
     * NOME DA EMPRESA NOME DA EMPRESA POSICAO 074 103 PICTURE X(30)
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";

    /**
     * MENSAGEM 1 Para utilizar a Mensagem 1 é necessário não ter informado
     * sacador/avalista. Esse campo só é tratado quando a Mensagem 3, do
     * segmento R, não estiver sendo utilizada ('brancos'). Além disso, quando
     * acatada essa mensagem será impressa em todos os bloquetos do lote. Caso
     * não queira utilizar o campo, informar 'brancos' POSICAO 104 143 PICTURE
     * X(40)
     */
    public static final String MENSAGEM_1 = "MENSAGEM_1";

    /**
     * MENSAGEM 2 Informar 'brancos' POSICAO 144 183 PICTURE X(40)
     */
    public static final String MENSAGEM_2 = "MENSAGEM_2";

    /**
     * N.� SEQ. ARQUIVO RET. NUMERO SEQUENCIAL DO ARQUIVO DE RETORNO POSICAO 184
     * 191 PICTURE 9(08)
     */
    public static final String N_SEQ_ARQUIVO_RET = "N_SEQ_ARQUIVO_RET";

    /**
     * DATA DE GRAVA��O DATA DE GRAVA��O DO ARQUIVO POSICAO 192 199 PICTURE
     * 9(08) DDMMAAAA
     */
    public static final String DATA_GRAVACAO_ARQUIVO = "DATA_GRAVACAO_ARQUIVO";

    /* DATA DE CREDITO
     * DATA DO CREDITO
     * POSICAO 200 207
     * PICTURE 9(08)
     * DDMMAAAA
     */
    public static final String DATA_DE_CREDITO = "DATA_DE_CREDITO";

    /* BRANCOS
     * COMPLEMENTO DE REGISTRO
     * POSICAO 208 240
     * PICTURE X(33)
     * CONTEUDO BRANCOS
     */
    public static final String BRANCOS = "BRANCOS";

    public LineCnab240BBHeaderLote() {

//*****************************Registro Header de Lote****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldDefaultArchetype("001"));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("1"));
        addFieldArchetype(OPERACAO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_SERVICO, new FieldDefaultArchetype("01"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldDefaultArchetype("  "));
        addFieldArchetype(LAYOUT_LOTE, new FieldDefaultArchetype("042"));
        addFieldArchetype(BRANCOS_LAYOUT_LOTE, new FieldDefaultArchetype(" "));
        addFieldArchetype(CODIGO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(INSCRICAO_NUMERO, new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(CONVENIO_COBRANCA, new FieldStringFixedLengthArchetype(9));
        addFieldArchetype(COBRANCA_CEDENTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(CARTEIRA_COBRANCA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VARIACAO_CARTEIRA_COBRANCA, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CAMPO_REMESSA_TESTE, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(DIGITO_VERIFICADOR_1, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_CONTA, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(DIGITO_VERIFICADOR_2, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(BRANCOS_CONTA_2, new FieldDefaultArchetype(" "));
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(MENSAGEM_1, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(MENSAGEM_2, new FieldFillerArchetype(40, ' '));
        addFieldArchetype(N_SEQ_ARQUIVO_RET, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(DATA_GRAVACAO_ARQUIVO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DATA_DE_CREDITO, new FieldFillerArchetype(8, ' '));
        addFieldArchetype(BRANCOS, new FieldFillerArchetype(33, ' '));

    }
}
