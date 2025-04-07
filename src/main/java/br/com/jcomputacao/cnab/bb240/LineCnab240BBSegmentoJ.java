package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 20/03/2015 11:01:23
 *
 * @author Thiago
 */
public class LineCnab240BBSegmentoJ extends LineArchetype {

    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCOS_COMPENSACAO";
    /**
     * CODIGO DO LOTE LOTE DE SERVICO POSICAO 004 007
     */
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";

    /**
     * TIPO DE REGISTRO - DEFAULT 3 REGISTRO HEADER DO LOTE POSICAO 008 008
     */
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";

    /**
     * Nº Seqüencial do Registro no Lote
     */
    public static final String NUMERO_REGISTRO = "NUMERO_REGISTRO";

    /**
     * Código de Segmento do Reg. Detalhe
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";

    /**
     * TIPO MOVIMENTO 15 15 1
     */
    public static String TIPO_MOVIMENTO = "TIPO_MOVIMENTO";

    /**
     * CÓDIGO DA INSTRUÇÃO DO MOVIMENTO
     */
    public static String CODIGO_MOVIMENTO = "CODIGO_MOVIMENTO";

    /**
     * Código de Barras 18 61 44 - Num
     */
    public static String CODIGO_BARRAS = "CODIGO_BARRAS";

    /**
     * Nome do Cedente 62 91 30 - Alfa
     */
    public static String NOME_CEDENTE = "NOME_CEDENTE";
    
     /**
     * Data do Vencimento (Nominal) 128 135 8 - Num
     */
    public static String VENCIMENTO = "VENCIMENTO";

    /**
     * Valor do Documento (Nominal)92 99 8 - Num
     */
    public static String VALOR_DOCUMENTO_NOMINAL = "VALOR_DOCUMENTO_NOMINAL";

    /**
     * Valor do Título (Nominal) 100 114 13 2 Num
     */
    public static String VALOR_TITULO = "VALOR_TITULO";

    /**
     * Valor do Desconto + Abatimento 115 129 13 2 Num
     */
    public static String VALOR_DESCONTO = "VALOR_DESCONTO";

    /**
     * Valor da Mora + Multa 130 144 13 2 Num
     */
    public static String VALOR_MULTA_MORA = "VALOR_MULTA_MORA";

    /**
     * Data do Pagamento 145 152 8 - Num P009 15.3J
     */
    public static String DATA_PAGAMENTO = "DATA_PAGAMENTO";

    /**
     * Valor do Pagamento 153 167 13 2 Num
     */
    public static String VALOR_PAGAMENTO = "VALOR_PAGAMENTO";

    /**
     * Quantidade da Moeda 168 182 10 5 Num
     */
    public static String QUANTIDADE_MOEDA = "QUANTIDADE_MOEDA";

    /**
     * Referência Sacado Nº do Docto Atribuído pela Empresa 183 202 20 - Alfa
     */
    public static String N_DOC_ATRIBUIDO_EMPRESA = "N_DOC_ATRIBUIDO_EMPRESA";

    /**
     * Nosso Número Nº do Docto Atribuído pelo Banco 203 222 20 - Alfa
     */
    public static String NOSSO_NUMERO = "NOSSO_NUMERO";

    /**
     * Código de Moeda 223 224 2 - Num
     */
    public static String CODIGO_MOEDA = "CODIGO_MOEDA";

    /**
     * CNAB Uso Exclusivo FEBRABAN/CNAB 225 230 6 - Alfa Brancos
     */
    public static String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * Ocorrências Códigos das Ocorrências p/ Retorno 231 240 10 - Alfa
     */
    public static String OCORRENCIAS = "OCORRENCIAS";

    public LineCnab240BBSegmentoJ() {
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(NUMERO_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(TIPO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_BARRAS, new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(NOME_CEDENTE, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(VENCIMENTO, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VALOR_TITULO, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(VALOR_DESCONTO, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(VALOR_MULTA_MORA, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(DATA_PAGAMENTO, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VALOR_PAGAMENTO, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(QUANTIDADE_MOEDA, new FieldDecimalFixedLengthArchetype(10, 5));
        addFieldArchetype(N_DOC_ATRIBUIDO_EMPRESA, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NOSSO_NUMERO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(CODIGO_MOEDA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldStringFixedLengthArchetype(6));
        addFieldArchetype(OCORRENCIAS, new FieldStringFixedLengthArchetype(10));
    }
}
