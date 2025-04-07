package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 20/03/2015 10:11:07
 *
 * @author Thiago
 */
public class LineCnab240BBSegmentoB extends LineArchetype {

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
     * Uso Exclusivo FEBRABAN/CNAB 227 229 3 - Alfa Brancos
     */
    public static String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * Tipo de Inscrição do Favorecido 18 18 1 - Num
     */
    public static String TIPO_INSCRICAO = "TIPO_INSCRICAO";

    /**
     * Nº de Inscrição do Favorecido 19 32 14 - Num
     */
    public static String NUMERO_INSCRICAO_FAVORECIDO = "NUMERO_INSCRICAO_FAVORECIDO";

    /**
     * Nome da Rua, Av, Pça, Etc 33 62 30 - Alfa
     */
    public static String LOGRADOURO = "LOGRADOURO";

    /**
     * Nº do Local 63 67 5 - Num
     */
    public static String NUMERO_LOCAL = "NUMERO_LOCAL";

    /**
     * Complemento Casa, Apto, Etc 68 82 15 - Alfa
     */
    public static String COMPLEMENTO = "COMPLEMENTO";

    /**
     * Bairro 83 97 15 - Alfa
     */
    public static String BAIRRO = "BAIRRO";

    /**
     * Nome da Cidade 98 117 20 - Alfa
     */
    public static String NOME_CIDADE = "NOME_CIDADE";

    /**
     * CEP 118 122 5 - Num
     */
    public static String CEP = "CEP";

    /**
     * Complemento CEP 123 125 3 - Alfa
     */
    public static String COMPLEMENTO_CEP = "COMPLEMENTO_CEP";

    /**
     * Sigla do Estado 126 127 2 - Alfa
     */
    public static String ESTADO = "ESTADO";

    /**
     * Data do Vencimento (Nominal) 128 135 8 - Num
     */
    public static String VENCIMENTO = "VENCIMENTO";

    /**
     * Valor do Documento (Nominal) 136 150 13 2 Num
     */
    public static String VALOR_DOCUMENTO_NOMINAL = "VALOR_DOCUMENTO_NOMINAL";

    /**
     * Valor do Abatimento 151 165 13 2 Num
     */
    public static String VALOR_ABATIMENTO = "VALOR_ABATIMENTO";

    /**
     * Valor do Desconto 166 180 13 2 Num
     */
    public static String VALOR_DESCONTO = "VALOR_DESCONTO";

    /**
     * Valor da Mora 181 195 13 2 Num
     */
    public static String VALO_MORA = "VALOR_MORA";

    /**
     * Valor da Multa 196 210 13 2 Num
     */
    public static String VALO_MULTA = "VALOR_MULTA";

    /**
     * Código/Documento do Favorecido 211 225 15 - Alfa
     */
    public static String CODIGO_DOC_FAVORECIDO = "CODIGO_DOC_FAVORECIDO";

    /**
     * Aviso ao Favorecido 226 226 1 - Num
     */
    public static String AVISO_FAVORECIDO = "AVISO_FAVORECIDO";

    /**
     * Uso Exclusivo para o SIAPE 227 232 6 - Num
     */
    public static String EXCLUSIVO_SIAPE = "EXCLUSIVO_SIAPE";

    /**
     * Identificação do Banco no SPB Código ISPB 233 240 8 - Num
     */
    public static String CODIGO_SPB = "CODIGO_SPB";

    public LineCnab240BBSegmentoB() {
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(NUMERO_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_INSCRICAO_FAVORECIDO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(LOGRADOURO, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(NUMERO_LOCAL, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(COMPLEMENTO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(BAIRRO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(NOME_CIDADE, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(CEP, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(COMPLEMENTO_CEP, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(ESTADO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(VENCIMENTO, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VALOR_DOCUMENTO_NOMINAL, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(VALOR_ABATIMENTO, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(VALOR_DESCONTO, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(VALO_MORA, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(VALO_MULTA, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(CODIGO_DOC_FAVORECIDO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(AVISO_FAVORECIDO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(EXCLUSIVO_SIAPE, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(CODIGO_SPB, new FieldIntegerFixedLengthArchetype(8));
    }

}
