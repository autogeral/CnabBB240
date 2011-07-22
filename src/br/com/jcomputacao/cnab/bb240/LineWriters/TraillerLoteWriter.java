/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBTrailerLote;
import br.com.jcomputacao.cnab.bb240.models.remessa.TraillerLoteModel;

/**
 *
 * @author Marcos
 */
public class TraillerLoteWriter {

    public static LineModel getTraillerLoteLine(TraillerLoteModel tlm){
        LineModel line = new LineCnab240BBTrailerLote().createModel();
        line.setFieldValue(LineCnab240BBTrailerLote.CODIGO_LOTE_TRAILER, tlm.getNumeroLoteServico());
        line.setFieldValue(LineCnab240BBTrailerLote.TOTAL_LOTES_REGISTROS, tlm.getNumeroRegistrosLote());
        return line;
    }
}
