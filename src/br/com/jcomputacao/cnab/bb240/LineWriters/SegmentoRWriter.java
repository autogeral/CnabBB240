/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoR;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoRModel;

/**
 *
 * @author Marcos
 */
public class SegmentoRWriter {

    public static LineModel getSegmentoRLine(SegmentoRModel srm){
        LineModel line = new LineCnab240BBSegmentoR().createModel();
        line.setFieldValue(LineCnab240BBSegmentoR.CODIGO_MULTA, srm.getCodigoMulta());
        line.setFieldValue(LineCnab240BBSegmentoR.DATA_MULTA, srm.getDataMulta());
        line.setFieldValue(LineCnab240BBSegmentoR.MENSAGEM_3, srm.getMensagem3());
        line.setFieldValue(LineCnab240BBSegmentoR.CODIGO_MOVIMENTO_REMESSA, srm.getNumeroCodigoRemessa());
        line.setFieldValue(LineCnab240BBSegmentoR.CODIGO_DO_LOTE, srm.getNumeroLoteServico());
        line.setFieldValue(LineCnab240BBSegmentoR.SEQUENCIAL_REGISTRO, srm.getNumeroSequencial());
        line.setFieldValue(LineCnab240BBSegmentoR.VALOR_MULTA, srm.getValorPercMulta());
        return line;
    }

}
