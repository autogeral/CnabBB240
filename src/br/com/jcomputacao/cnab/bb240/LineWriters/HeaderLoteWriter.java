/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBHeaderLote;
import br.com.jcomputacao.cnab.bb240.models.remessa.HeaderLoteModel;

/**
 *
 * @author Marcos
 */
public class HeaderLoteWriter{

    public LineModel getHeaderLoteLine(HeaderLoteModel hlm){
      LineModel line = new LineCnab240BBHeaderLote().createModel();
      line.setFieldValue(LineCnab240BBHeaderLote.AGENCIA_MANTENEDORA, hlm.getAgenciaMantenedora());
      line.setFieldValue(LineCnab240BBHeaderLote.COBRANCA_CEDENTE, hlm.getCobrancaCedente());
      line.setFieldValue(LineCnab240BBHeaderLote.DATA_GRAVACAO_ARQUIVO, hlm.getDataGravacaoRemessaRetorno());
      line.setFieldValue(LineCnab240BBHeaderLote.DIGITO_VERIFICADOR_1, String.valueOf(hlm.getDigitoVerificadorAgencia()));
      line.setFieldValue(LineCnab240BBHeaderLote.DIGITO_VERIFICADOR_2, String.valueOf(hlm.getDigitoVerificadorContaCorrente()));
      line.setFieldValue(LineCnab240BBHeaderLote.CODIGO_DO_LOTE, hlm.getLoteServico());
      line.setFieldValue(LineCnab240BBHeaderLote.MENSAGEM_1, hlm.getMensagem1());
      line.setFieldValue(LineCnab240BBHeaderLote.NOME_EMPRESA, hlm.getNomeEmpresa());
      line.setFieldValue(LineCnab240BBHeaderLote.CARTEIRA_COBRANCA, hlm.getNumeroCarteiraCobranca());
      line.setFieldValue(LineCnab240BBHeaderLote.NUMERO_CONTA, hlm.getNumeroContaCorrente());
      line.setFieldValue(LineCnab240BBHeaderLote.CONVENIO_COBRANCA, hlm.getNumeroConvenioCobranca());
      line.setFieldValue(LineCnab240BBHeaderLote.INSCRICAO_NUMERO, hlm.getNumeroInscricao());
      line.setFieldValue(LineCnab240BBHeaderLote.N_SEQ_ARQUIVO_RET, hlm.getNumeroRemessaRetorno());
      line.setFieldValue(LineCnab240BBHeaderLote.VARIACAO_CARTEIRA_COBRANCA, hlm.getNumeroVariacaoCarteiraCobranca());
      line.setFieldValue(LineCnab240BBHeaderLote.CAMPO_REMESSA_TESTE, hlm.getRemessaTeste());
      line.setFieldValue(LineCnab240BBHeaderLote.CODIGO_INSCRICAO, hlm.getTipoInscricao());
      line.setFieldValue(LineCnab240BBHeaderLote.OPERACAO, String.valueOf(hlm.getTipoOperacao()));
      return line;
    };
}
