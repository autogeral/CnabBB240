package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240BBSegmentoU extends LineArchetype {

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
     * CODIGO DE MOVIMENTO DE RETORNO
     * POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_RETORNO = "CODIGO_MOVIMENTO_RETORNO";
    /**
     * JUROS MULTA ENCARGOS
     * 13 ESPACOS
     * POSICAO 018 032
     */
    public static final String JUROS_MULTA = "JUROS_MULTA";
    /**
     * VALOR DESCONTOS CONCEDIDO
     * POSICAO 033 047
     * PICTURE 9(01)
     */
    public static final String VALOR_DESCONTO = "VALOR_DESCONTO";
    /**
     * VALOR DO ABATIMENTO CONCEDIDO
     * POSICAO 048 062
     */
    public static final String VALOR_ABATIMENTO = "VALOR_ABATIMENTO";
    /**
     * VALOR DO IOF RECOLHIDO
     * POSICAO 063 077
     */
    public static final String VALOR_IOF = "VALOR_IOF";
    /**
     * VALOR PAGO PELO SACADO
     * POSICAO 078 092
     */
    public static final String VALOR_PAGO_SACADO = "VALOR_PAGO_SACADO";
    /**
     * VALOR LIQUIDO A SER CREDITADO
     * POSICAO 093 107
     */
    public static final String VALOR_LIQUIDO_CREDITADO = "VALOR_LIQUIDO_CREDITADO";
    /**
     * VALOR DE OUTRAS DESPESAS
     * POSICAO 108 122
     */
    public static final String VALOR_DESPESAS = "VALOR_DESPESAS";
    /**
     * VALOR DOS OUTROS CREDITOS
     * POSICAO 123 137
     */
    public static final String VALOR_CREDITOS = "VALOR_CREDITOS";
    /**
     * DATA OCORRENCIA
     * POSICAO 138 145
     */
    public static final String DATA_OCORRENCIA_1 = "DATA_OCORRENCIA";
    /**
     * DATA EFETIVACAO DO CREDITO
     * POSICAO 146 153
     */
    public static final String DATA_EFETIVACAO_CREDITO = "DATA_EFETIVACAO_CREDITO";
    /**
     * CODIGO DA OCORRENCIA
     * POSICAO 154 157
     */
    public static final String CODIGO_OCORRENCIA = "CODIGO_OCORRENCIA";
    /**
     * DATA OCORRENCIA 2
     * POSICAO 158 165
     */
    public static final String DATA_OCORRENCIA_2 = "DATA_OCORRENCIA_2";
    /**
     * VALOR DA OCORRENCIA
     * POSICAO 166 180
     */
    public static final String VALOR_OCORRENCIA = "VALOR_OCORRENCIA";
    /**
     * COMPLEMENTO DA OCORRENCIA
     * POSICAO 181 210
     */
    public static final String COMPLEMENTO_OCORRENCIA = "COMPLEMENTO_OCORRENCIA";
    /**
     * CODIGO BANCO CORRESPONDENTE COMPENSACAO
     * POSICAO 211 213
     */
    public static final String CODIGO_BANCO_CORRESP = "CODIGO_BANCO_CORRESP";
    /**
     * NOSSO NUMERO BANCO CORRESPONDENTE
     * POSICAO 214 233
     */
    public static final String NOSSO_NUMERO_BNC_CORRESP = "NOSSO_NUMERO_BNC_CORRESP";

    /**
     * USO EXCLUSIVO FEBRABAN
     * POSICAO 233 240
     * PICTURE X(33)
     * CONTEUDO BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    public LineCnab240BBSegmentoU() {

//*****************************Registro Header de Lote****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("U"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(JUROS_MULTA, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(VALOR_DESCONTO, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(VALOR_ABATIMENTO, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(VALOR_IOF, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(VALOR_PAGO_SACADO, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(VALOR_LIQUIDO_CREDITADO, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(VALOR_DESPESAS, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(VALOR_CREDITOS, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(DATA_OCORRENCIA_1, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DATA_EFETIVACAO_CREDITO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CODIGO_OCORRENCIA, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(DATA_OCORRENCIA_2, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_OCORRENCIA, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(COMPLEMENTO_OCORRENCIA, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(CODIGO_BANCO_CORRESP, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NOSSO_NUMERO_BNC_CORRESP, new FieldIntegerFixedLengthArchetype(20));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(7, ' '));

    }
}
