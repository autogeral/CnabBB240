package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoJ;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoJModel;

/**
 * 20/03/2015 16:12:21
 * @author Thiago
 */
public class SegmentoJWriter {

    
      public static LineModel getSegmentoALine(SegmentoJModel hlm) {
        LineModel line = new LineCnab240BBSegmentoJ().createModel();
        line.setFieldValue(LineCnab240BBSegmentoJ.CODIGO_BANCO_COMPENSACAO, hlm.getCodigoBanco());        
        line.setFieldValue(LineCnab240BBSegmentoJ.CODIGO_DO_LOTE, hlm.getLoteServico());
        line.setFieldValue(LineCnab240BBSegmentoJ.TIPO_DE_REGISTRO, hlm.getTipoRegistro());
        line.setFieldValue(LineCnab240BBSegmentoJ.NUMERO_REGISTRO, hlm.getNumeroSquencialRegistroLote());
        line.setFieldValue(LineCnab240BBSegmentoJ.CODIGO_SEGMENTO, hlm.getCodigoSegmentoReDetalhe());
        line.setFieldValue(LineCnab240BBSegmentoJ.TIPO_MOVIMENTO, hlm.getTipoMovimento());
        line.setFieldValue(LineCnab240BBSegmentoJ.CODIGO_MOVIMENTO, hlm.getCodigoInstrucaoMovimento());
        line.setFieldValue(LineCnab240BBSegmentoJ.CODIGO_BARRAS, hlm.getCodigoBarras());
        line.setFieldValue(LineCnab240BBSegmentoJ.NOME_CEDENTE, hlm.getNomeCedente());
        line.setFieldValue(LineCnab240BBSegmentoJ.VENCIMENTO, hlm.getDataVencimento());
        line.setFieldValue(LineCnab240BBSegmentoJ.VALOR_TITULO, hlm.getValorTitulo());
        line.setFieldValue(LineCnab240BBSegmentoJ.VALOR_DESCONTO, hlm.getValorDesconto());
        line.setFieldValue(LineCnab240BBSegmentoJ.VALOR_MULTA_MORA, hlm.getValorMoraMulta());
        line.setFieldValue(LineCnab240BBSegmentoJ.DATA_PAGAMENTO, hlm.getDataPagamento());
        line.setFieldValue(LineCnab240BBSegmentoJ.VALOR_PAGAMENTO, hlm.getValorPagamento());
        line.setFieldValue(LineCnab240BBSegmentoJ.QUANTIDADE_MOEDA, hlm.getQuantidadeMoeda());
        line.setFieldValue(LineCnab240BBSegmentoJ.N_DOC_ATRIBUIDO_EMPRESA, hlm.getnDoctoAtributoEmpresa());
        line.setFieldValue(LineCnab240BBSegmentoJ.NOSSO_NUMERO, hlm.getnDoctoAtributoBanco());
        line.setFieldValue(LineCnab240BBSegmentoJ.CODIGO_MOEDA, hlm.getCodigoMoeda());
        line.setFieldValue(LineCnab240BBSegmentoJ.EXCLUSIVO_FEBRABAN, hlm.getCnab());
        line.setFieldValue(LineCnab240BBSegmentoJ.OCORRENCIAS, hlm.getOcorrencias());
        return line;
      }
}
