/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author David
 */
public class LineCnab240BBTrailerArquivo extends LineArchetype{

//*****************************REGISTRO TRAILER DE LOTE*************************

    /**
     * CODIGO DO BANCO
     * NUMER DO BANCO NA CAMARA DE COMPENSACAO
     * POSIOCAO 001 003
     * PICTURE 9(03)
     * CONTE�DO 341
     */

     public static final String CODIGO_BANCO_TRAILER = "CODIGO_BANCO_TRAILER";

    /**
     * CODIGO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     * PICTURE 9(04)
     * CONTEUDO NOTA 1
     */

     public static final String CODIGO_LOTE_TRAILER = "CODIGO_LOTE_TRAILER";

    /**
     * TIPO DE REGISTRO
     * REGISTRO TRAILER DE LOTE
     * POSICAO 008 008
     * PICTURE 9(01)
     * CONTE�DO '5'
     */

     public static final String TIPO_REGISTRO_TRAILER = "TIPO_REGISTRO_TRAILER";

    /**
     * BRANCOS
     * COMPLEMENTO DE REGISTRO
     * POSI��O 009 017
     * PICTURE X(09)
     * CONTE�DO BRANCOS
     */

     public static final String BRANCOS_REGISTRO_TRAILER_ARQUIVO = "BRANCOS_REGISTRO_TRAILER_ARQUIVO";

    /**
     * TOTAL DE LOTES DE REGISTROS
     * QUANTIDADE DE LOTES DO ARQUIVO
     * POSICAO 024 029
     * PICTURE 9(06)
     * CONTE�DO NOTA 26
     */

     public static final String TOTAL_LOTES_ARQUIVO = "TOTAL_LOTES_ARQUIVO";

    /**
     * TOTAL DE REGISTROS NO ARQUIVO
     * QUANTIDADE DE REGISTROS DO ARQUIVO
     * POSICAO 024 029
     * PICTURE 9(06)
     * CONTE�DO NOTA 26
     */

     public static final String TOTAL_REGISTROS_ARQUIVO = "TOTAL_REGISTROS_ARQUIVO";

    /**
     * BRANCOS
     * COMPLEMENTO DE REGISTRO
     * POSICAO 036 240
     * PICTURE X(205)
     * CONTE�DO BRANCOS
     */

     public static final String TOTAL_LOTES_REGISTROS_BRANCOS = "TOTAL_LOTES_REGISTROS_BRANCOS";

    public LineCnab240BBTrailerArquivo(){
         addFieldArchetype(CODIGO_BANCO_TRAILER, new FieldDefaultArchetype("001"));
         addFieldArchetype(CODIGO_LOTE_TRAILER, new FieldDefaultArchetype("9999"));
         addFieldArchetype(TIPO_REGISTRO_TRAILER, new FieldDefaultArchetype("9"));
         addFieldArchetype(BRANCOS_REGISTRO_TRAILER_ARQUIVO, new FieldFillerArchetype(9, ' '));
         addFieldArchetype(TOTAL_LOTES_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
         addFieldArchetype(TOTAL_REGISTROS_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
         addFieldArchetype(TOTAL_LOTES_REGISTROS_BRANCOS, new FieldStringFixedLengthArchetype(205));
    }
}
