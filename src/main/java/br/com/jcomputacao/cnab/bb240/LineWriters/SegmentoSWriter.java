/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoS;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoSModel;

/**
 *
 * @author Marcos
 */
public class SegmentoSWriter {

    public static LineModel getSegmentoSLine(SegmentoSModel ssm){
        LineModel line = new LineCnab240BBSegmentoS().createModel();
        line.setFieldValue(LineCnab240BBSegmentoS.MENSAGEM_IMPRESSA, ssm.getMensagemImpressa());
        line.setFieldValue(LineCnab240BBSegmentoS.CODIGO_MOVIMENTO_REMESSA, ssm.getNumeroCodigoRemessa());
        line.setFieldValue(LineCnab240BBSegmentoS.IDENTIFICAO_IMPRESSAO, ssm.getNumeroIdentificacaoImpressao());
        line.setFieldValue(LineCnab240BBSegmentoS.CODIGO_DO_LOTE, ssm.getNumeroLoteServico());
        line.setFieldValue(LineCnab240BBSegmentoS.SEQUENCIAL_REGISTRO, ssm.getNumeroSequencial());
        return line;
    }
}
