/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBTrailerArquivo;
import br.com.jcomputacao.cnab.bb240.model.retorno.TraillerArquivoRetornoModel;

/**
 *
 * @author Marcos
 */
public class TraillerArquivoWriter {

    public static LineModel getTraillerArquivoWriter(TraillerArquivoRetornoModel tam){
        LineModel line = new LineCnab240BBTrailerArquivo().createModel();
        line.setFieldValue(LineCnab240BBTrailerArquivo.TOTAL_LOTES_ARQUIVO, tam.getQuantidadeLotes());
        line.setFieldValue(LineCnab240BBTrailerArquivo.TOTAL_REGISTROS_ARQUIVO, tam.getQuantidadeRegistros());
        return line;
    }

}
