package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author David
 */
public class LineCnab240BBTrailerLote extends LineArchetype {

//*****************************REGISTRO TRAILER DE LOTE*************************
    /**
     * CODIGO DO BANCO NUMER DO BANCO NA CAMARA DE COMPENSACAO POSIOCAO 001 003
     * PICTURE 9(03) CONTE�DO 341
     */
    public static final String CODIGO_BANCO_TRAILER = "CODIGO_BANCO_TRAILER";

    /**
     * CODIGO LOTE LOTE DE SERVICO POSICAO 004 007 PICTURE 9(04) CONTEUDO NOTA 1
     */
    public static final String CODIGO_LOTE_TRAILER = "CODIGO_LOTE_TRAILER";

    /**
     * TIPO DE REGISTRO REGISTRO TRAILER DE LOTE POSICAO 008 008 PICTURE 9(01)
     * CONTE�DO '5'
     */
    public static final String TIPO_REGISTRO_TRAILER = "TIPO_REGISTRO_TRAILER";

    /**
     * BRANCOS COMPLEMENTO DE REGISTRO POSI��O 009 017 PICTURE X(09) CONTE�DO
     * BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * TOTAL DE LOTES DE REGISTROS QUANTIDADE DE REGISTROS DO ARQUIVO POSICAO
     * 024 029 PICTURE 9(06) CONTE�DO NOTA 26
     */
    public static final String TOTAL_LOTES_REGISTROS = "TOTAL_LOTES_REGISTROS";

    /**
     * Somatória dos Valores 24 41
     */
    public static final String SOMATORIA_VALORES = "SOMATORIA_VALORES";

    /**
     * Somatória de Quantidade de Moedas 42 59 13 5
     */
    public static final String SOMATORIA_QUANTIDADE_MOEDA = "SOMATORIA_QUANTIDADE_MOEDA";

    /**
     * Número Aviso de Débito 60 65 6
     */
    public static final String NUMERO_AVISO_DEBITO = "NUMERO_AVISO_DEBITO";

    /**
     * Uso Exclusivo FEBRABAN/CNAB 66 230 165
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    /**
     * Códigos das Ocorrências para Retorno 231 240 10 -
     */
    public static final String OCORRENCIAS = "OCORRENCIAS";
    
    
    public LineCnab240BBTrailerLote() {
        addFieldArchetype(CODIGO_BANCO_TRAILER, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_LOTE_TRAILER, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_REGISTRO_TRAILER, new FieldDefaultArchetype("5"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(9, ' '));
        addFieldArchetype(TOTAL_LOTES_REGISTROS, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(217, ' '));
     
    }
}
