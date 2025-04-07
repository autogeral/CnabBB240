/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoT;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoTModel;

/**
 *
 * @author Marcos
 */
public class SegmentoTWriter {

    public static LineModel getSegmentoTLine(SegmentoTModel stm){
        LineModel line = new LineCnab240BBSegmentoT().createModel();
        line.setFieldValue(LineCnab240BBSegmentoT.DATA_VENCIMENTO_TITULO, stm.getDataVencimentoTitulo());
        line.setFieldValue(LineCnab240BBSegmentoT.IDENTIFICACAO_REJEICOES_OUTROS, stm.getIdentificacao());
        line.setFieldValue(LineCnab240BBSegmentoT.IDENTIFICACAO_TITULO, stm.getIdentificacaoTitulo());
        line.setFieldValue(LineCnab240BBSegmentoT.IDENTIFICACAO_TITULO_EMPRESA, stm.getIdentificacaoTituloEmpresa());
        line.setFieldValue(LineCnab240BBSegmentoT.AGENCIA_MANTENEDORA, stm.getNumeroAgencia());
        line.setFieldValue(LineCnab240BBSegmentoT.AGENCIA_COBRADORA_RECEBEDORA, stm.getNumeroAgenciaCobradoraRecebedora());
        line.setFieldValue(LineCnab240BBSegmentoT.NUMERO_BANCO, stm.getNumeroBanco());
        line.setFieldValue(LineCnab240BBSegmentoT.CODIGO_CARTEIRA, stm.getNumeroCodigoCarteira());
        line.setFieldValue(LineCnab240BBSegmentoT.CODIGO_MOEDA, stm.getNumeroCodigoMoeda());
        line.setFieldValue(LineCnab240BBSegmentoT.CODIGO_MOVIMENTO_RETORNO, stm.getNumeroCodigoRetorno());
        line.setFieldValue(LineCnab240BBSegmentoT.NUMERO_CONTA_CORRENTE, stm.getNumeroContaCorrente());
        line.setFieldValue(LineCnab240BBSegmentoT.DIGITO_VERIFICADOR_AGENCIA, stm.getNumeroDigitoVerificadorAgencia());
        line.setFieldValue(LineCnab240BBSegmentoT.DIGITO_VERIFICADOR_AG_RECEBEDORA, stm.getNumeroDigitoVerificadorAgenciaCobRec());
        line.setFieldValue(LineCnab240BBSegmentoT.DIGITO_VERIFICADOR_CONTA_AGENCIA, stm.getNumeroDigitoVerificadorAgenciaContaCorrente());
        line.setFieldValue(LineCnab240BBSegmentoT.DIGITO_VERIFICADOR_CONTA, stm.getNumeroDigitoVerificadorContaCorrente());
        line.setFieldValue(LineCnab240BBSegmentoT.NUMERO_DOC_COBRANCA, stm.getNumeroDocCobranca());
        line.setFieldValue(LineCnab240BBSegmentoT.CODIGO_DO_LOTE, stm.getNumeroLoteServico());
        line.setFieldValue(LineCnab240BBSegmentoT.SEQUENCIAL_REGISTRO, stm.getNumeroSequencial());
        line.setFieldValue(LineCnab240BBSegmentoT.VALOR_NOMINAL, stm.getValorNominalTitulo());
        line.setFieldValue(LineCnab240BBSegmentoT.VALOR_TARIFA_CUSTAS, stm.getValorTarifaCustas());
        return line;
    }

}
