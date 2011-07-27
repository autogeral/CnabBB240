/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoP;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoPModel;

/**
 *
 * @author Marcos
 */
public class SegmentoPWriter {

    public static LineModel getSegmentoPLine(SegmentoPModel la){
        LineModel line = new LineCnab240BBSegmentoP().createModel();
        line.setFieldValue(LineCnab240BBSegmentoP.CODIGO_MOVIMENTO_REMESSA, la.getCodigoRemessa());
        line.setFieldValue(LineCnab240BBSegmentoP.DIGITO_VERIFICADOR_AGENCIA, String.valueOf(la.getDigitoVerificadorAgencia()));
        line.setFieldValue(LineCnab240BBSegmentoP.DIGITO_VERIFICADOR_CONTA, String.valueOf(la.getDigitoVerificadorContaCorrente()));
        line.setFieldValue(LineCnab240BBSegmentoP.IDENTIFICACAO_TITULO_BANCO, la.getIdentificacaoTituloBanco());
        line.setFieldValue(LineCnab240BBSegmentoP.AGENCIA_MANTENEDORA, la.getNumeroAgencia());
        line.setFieldValue(LineCnab240BBSegmentoP.NUMERO_CONTA, la.getNumeroContaCorrente());
        line.setFieldValue(LineCnab240BBSegmentoP.CODIGO_DO_LOTE, la.getNumeroLote());
        line.setFieldValue(LineCnab240BBSegmentoP.SEQUENCIAL_REGISTRO, la.getNumeroSequencial());
        return line;
    }

}
