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

    public static LineModel getTraillerLoteLine(TraillerLoteModel tlm) {
        LineModel line = new LineCnab240BBTrailerLote().createModel();
        line.setFieldValue(LineCnab240BBTrailerLote.CODIGO_LOTE_TRAILER, tlm.getCodigoBanco());
        line.setFieldValue(LineCnab240BBTrailerLote.CODIGO_LOTE_TRAILER, tlm.getLoteServico());
        line.setFieldValue(LineCnab240BBTrailerLote.TIPO_REGISTRO_TRAILER, tlm.getTipoRegistro());
        line.setFieldValue(LineCnab240BBTrailerLote.EXCLUSIVO_FEBRABAN, tlm.getCnab1());
        line.setFieldValue(LineCnab240BBTrailerLote.TOTAL_LOTES_REGISTROS, tlm.getQtdRegistroLote());
        line.setFieldValue(LineCnab240BBTrailerLote.SOMATORIA_VALORES, tlm.getSomatoriaValores());
        line.setFieldValue(LineCnab240BBTrailerLote.SOMATORIA_QUANTIDADE_MOEDA, tlm.getSomatoriaQtdMoedas());
        line.setFieldValue(LineCnab240BBTrailerLote.NUMERO_AVISO_DEBITO, tlm.getNumeroAvisoDebito());
        line.setFieldValue(LineCnab240BBTrailerLote.EXCLUSIVO_FEBRABAN_2, tlm.getCnab());
        line.setFieldValue(LineCnab240BBTrailerLote.OCORRENCIAS, tlm.getOcorrencia());

        return line;
    }
}
