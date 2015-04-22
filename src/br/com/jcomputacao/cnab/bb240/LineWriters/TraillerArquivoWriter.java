/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBTrailerArquivo;
import br.com.jcomputacao.cnab.bb240.models.remessa.TraillerArquivoModel;

/**
 *
 * @author Marcos
 */
public class TraillerArquivoWriter {

    public static LineModel getTraillerArquivoWriter(TraillerArquivoModel tam) {
        LineModel line = new LineCnab240BBTrailerArquivo().createModel();
        line.setFieldValue(LineCnab240BBTrailerArquivo.CODIGO_BANCO_TRAILER, tam.getCodigoBancoCompensacao());
        line.setFieldValue(LineCnab240BBTrailerArquivo.CODIGO_LOTE_TRAILER, tam.getLote());
        line.setFieldValue(LineCnab240BBTrailerArquivo.TIPO_REGISTRO_TRAILER, tam.getRegistro());
        line.setFieldValue(LineCnab240BBTrailerArquivo.BRANCOS_REGISTRO_TRAILER_ARQUIVO, tam.getExclusivoFebraban1());
        line.setFieldValue(LineCnab240BBTrailerArquivo.TOTAL_LOTES_ARQUIVO, tam.getQtdLotes());        
        line.setFieldValue(LineCnab240BBTrailerArquivo.TOTAL_REGISTROS_ARQUIVO, tam.getQtdRegistro());
        line.setFieldValue(LineCnab240BBTrailerArquivo.TOTAL_LOTES_REGISTROS_BRANCOS, tam.getExclusivoFebraban2());
        
        return line;
    }

}
