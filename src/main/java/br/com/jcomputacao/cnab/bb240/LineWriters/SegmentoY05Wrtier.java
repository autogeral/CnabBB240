/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoY05;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoY05Model;

/**
 *
 * @author Marcos
 */
public class SegmentoY05Wrtier {

    public static LineModel getSegmentoY05Line(SegmentoY05Model sym){
        LineModel line = new LineCnab240BBSegmentoY05().createModel();
        line.setFieldValue(LineCnab240BBSegmentoY05.IDENTIFICACAO_CHEQUE_1, sym.getIdentificacaoCheque1());
        line.setFieldValue(LineCnab240BBSegmentoY05.IDENTIFICACAO_CHEQUE_2, sym.getIdentificacaoCheque2());
        line.setFieldValue(LineCnab240BBSegmentoY05.IDENTIFICACAO_CHEQUE_3, sym.getIdentificacaoCheque3());
        line.setFieldValue(LineCnab240BBSegmentoY05.IDENTIFICACAO_CHEQUE_1, sym.getIdentificacaoCheque1());
        line.setFieldValue(LineCnab240BBSegmentoY05.IDENTIFICACAO_CHEQUE_1, sym.getIdentificacaoCheque1());
        line.setFieldValue(LineCnab240BBSegmentoY05.IDENTIFICACAO_CHEQUE_1, sym.getIdentificacaoCheque1());
        return line;
    }
}
