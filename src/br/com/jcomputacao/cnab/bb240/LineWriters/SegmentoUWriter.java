/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoU;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoUModel;

/**
 *
 * @author Marcos
 */
public class SegmentoUWriter {

    public static LineModel getSegmentoULine(SegmentoUModel sum){
        LineModel line = new LineCnab240BBSegmentoU().createModel();
        line.setFieldValue(LineCnab240BBSegmentoU.DATA_EFETIVACAO_CREDITO, sum.getDataEfetivacaoCredito());
        line.setFieldValue(LineCnab240BBSegmentoU.DATA_OCORRENCIA_1, sum.getDataOcorrencia());
        line.setFieldValue(LineCnab240BBSegmentoU.CODIGO_MOVIMENTO_RETORNO, sum.getNumeroCodigoRetorno());
        line.setFieldValue(LineCnab240BBSegmentoU.CODIGO_DO_LOTE, sum.getNumeroLoteServico());
        line.setFieldValue(LineCnab240BBSegmentoU.SEQUENCIAL_REGISTRO, sum.getNumeroSequencial());
        line.setFieldValue(LineCnab240BBSegmentoU.VALOR_ABATIMENTO, sum.getValorAbatimentoConcedCancel());
        line.setFieldValue(LineCnab240BBSegmentoU.VALOR_DESCONTO, sum.getValorDesconto());
        line.setFieldValue(LineCnab240BBSegmentoU.VALOR_IOF, sum.getValorIOF());
        line.setFieldValue(LineCnab240BBSegmentoU.JUROS_MULTA, sum.getValorJurosMultaEncargos());
        line.setFieldValue(LineCnab240BBSegmentoU.VALOR_LIQUIDO_CREDITADO, sum.getValorLiquidoCreditado());
        line.setFieldValue(LineCnab240BBSegmentoU.VALOR_DESPESAS, sum.getValorOutrasDespesas());
        line.setFieldValue(LineCnab240BBSegmentoU.VALOR_CREDITOS, sum.getValorOutrosCreditos());
        line.setFieldValue(LineCnab240BBSegmentoU.VALOR_PAGO_SACADO, sum.getValorPagoSacado());
        return line;
    }

}
