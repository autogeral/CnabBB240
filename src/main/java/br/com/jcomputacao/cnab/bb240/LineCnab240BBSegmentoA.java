package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/03/2015 17:12:25
 *
 * @author Thiago
 */
public class LineCnab240BBSegmentoA extends LineArchetype {

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
     * Código da Câmara Centralizadora 18 20 3
     */
    public static String CAMARA = "CAMARA";

    /**
     * Codigo do banco do FAvorecido - 21 23 3 - Num
     */
    public static String CODIGO_BANCO_FAVORECIDO = "CODIGO_BANCO_FAVORECIDO";

    /**
     * Ag. Mantenedora da Cta do Favor. 24 28 5 - Num
     */
    public static String AG_MANTENEDORA_CTA_FAVOR = "AG_MANTENEDORA_CTA_FAVOR";

    /**
     * Dígito Verificador da Agência 29 29 1 - Alfa
     */
    public static String DIGITO_VERIFICADOR_AGENCIA = "DIGITO_VERIFICADOR_AGENCIA";

    /**
     * Número da Conta Corrente 30 41 12 - Num
     */
    public static String NUMERO_CONTA_CORRENTE = "NUMERO_CONTA_CORRENTE";

    /**
     * Dígito Verificador da Conta 42 42 1 - Alfa
     */
    public static String DIGITO_VERIFICADOR_CONTA = "DIGITO_VERIFICADOR_CONTA";

    /**
     * Dígito Verificador da AG/Conta 43 43 1 - Alfa
     */
    public static String DIGITO_VERIFICADOR_AG_CONTA = "DIGITO_VERIFICADOR_AG_CONTA";

    /**
     * Nome do Favorecido 44 73 30 - Alfa
     */
    public static String NOME_FAVORECIDO = "NOME_FAVORECIDO";

    /**
     * Nº do Docum. Atribuído p/ Empresa 74 93 20 - Alfa
     */
    public static String N_DOCUMENTO_ATRIBUIDO_PARA_EMPRESA = "N_DOCUMENTO_ATRIBUIDO_PARA_EMPRESA";

    /**
     * Data do Pagamento 94 101 8 - Num
     */
    public static String DATA_PAGAMENTO = "DATA_PAGAMENTO";

    /**
     * Tipo da Moeda 102 104 3 - Alfa
     */
    public static String TIPO_MOEDA = "TIPO_MOEDA";

    /**
     * Quantidade da Moeda 105 119 10,5 Num
     */
    public static String QUANTIDADE_MOEDA = "QUANTIDADE_MOEDA";

    /**
     * Valor do Pagamento 120 134 13,2 Num
     */
    public static String VALOR_PAGAMENTO = "VALOR_PAGAMENTO";

    /**
     * Nº do Docum. Atribuído pelo Banco 135 154 20 - Alfa G043
     */
    public static String NOSSO_NUMERO = "NOSSO_NUMERO";

    /**
     * Data Real da Efetivação Pagto 155 162 8 - Num
     */
    public static String DATA_REAL = "DATA_REAL";

    /**
     * Valor Real da Efetivação do Pagto 163 177 13 2 Num
     */
    public static String VALOR_REAL = "VALOR_REAL";

    /**
     * Outras Informações – Vide formatação em G031 para identificação de
     * Deposito Judicial e Pgto.Salários de servidores pelo SIAPE 178 217 40 -
     * Alfa
     */
    public static String INFORMACAO_2 = "INFORMACAO_2";

    /**
     * Compl. Tipo Serviço 218 219 2 - Alfa
     */
    public static String CODIGO_FINALIDADE_DOC = "CODIGO_FINALIDADE_DOC";

    /**
     * Codigo finalidade da TED 220 224 5 - Alfa
     */
    public static String CODIGO_FINALIDADE_TED = "CODIGO_FINALIDADE_TED";

    /**
     * Complemento de finalidade pagto. 225 226 2 - Alfa
     */
    public static String CODIGO_FINALIDADE_COMPLEMENTAR = "CODIGO_FINALIDADE_COMPLEMENTAR";

    /**
     * Uso Exclusivo FEBRABAN/CNAB 227 229 3 - Alfa Brancos
     */
    public static String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * Aviso ao Favorecido 230 230 1 - Num
     */
    public static String AVISO = "AVISO";

    /**
     * Códigos das Ocorrências p/ Retorno 231 240 10 - Alfa
     */
    public static String OCORRENCIAS = "OCORRENCIAS";

    public LineCnab240BBSegmentoA() {

//*****************************Registro Segmento A****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(NUMERO_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(TIPO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CAMARA, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_BANCO_FAVORECIDO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(AG_MANTENEDORA_CTA_FAVOR, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_CONTA_CORRENTE, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(DIGITO_VERIFICADOR_CONTA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(DIGITO_VERIFICADOR_AG_CONTA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NOME_FAVORECIDO, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(N_DOCUMENTO_ATRIBUIDO_PARA_EMPRESA, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(DATA_PAGAMENTO, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(TIPO_MOEDA, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(QUANTIDADE_MOEDA, new FieldDecimalFixedLengthArchetype(10, 5));
        addFieldArchetype(VALOR_PAGAMENTO, new FieldDecimalFixedLengthArchetype(13, 5));
        addFieldArchetype(NOSSO_NUMERO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(DATA_REAL, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VALOR_REAL, new FieldDecimalFixedLengthArchetype(13, 1));
        addFieldArchetype(INFORMACAO_2, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(CODIGO_FINALIDADE_DOC, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_FINALIDADE_TED, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_FINALIDADE_COMPLEMENTAR, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(AVISO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(OCORRENCIAS, new FieldStringFixedLengthArchetype(10));
    }

}
