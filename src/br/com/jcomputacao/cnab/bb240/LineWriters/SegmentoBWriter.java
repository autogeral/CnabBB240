package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoB;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoBModel;

/**
 * 20/03/2015 15:48:31
 * @author Thiago
 */
public class SegmentoBWriter {

      public static LineModel getSegmentoALine(SegmentoBModel hlm) {
        LineModel line = new LineCnab240BBSegmentoB().createModel();
      
         line.setFieldValue(LineCnab240BBSegmentoB.CODIGO_BANCO_COMPENSACAO, hlm.getCodigoBanco());
         line.setFieldValue(LineCnab240BBSegmentoB.CODIGO_DO_LOTE, hlm.getLoteServico());
         line.setFieldValue(LineCnab240BBSegmentoB.TIPO_DE_REGISTRO, hlm.getTipoRegistro());
         line.setFieldValue(LineCnab240BBSegmentoB.NUMERO_REGISTRO, hlm.getNumeroSquencialRegistroLote());
         line.setFieldValue(LineCnab240BBSegmentoB.CODIGO_BANCO_COMPENSACAO, hlm.getCodigoSegmentoReDetalhe());
         line.setFieldValue(LineCnab240BBSegmentoB.EXCLUSIVO_FEBRABAN, hlm.getCnab());
         line.setFieldValue(LineCnab240BBSegmentoB.TIPO_INSCRICAO, hlm.getTipoInscricaoFavorecido());
         line.setFieldValue(LineCnab240BBSegmentoB.NUMERO_INSCRICAO_FAVORECIDO, hlm.getnInscricaoFavorecido());
         line.setFieldValue(LineCnab240BBSegmentoB.LOGRADOURO, hlm.getLogradouro());
         line.setFieldValue(LineCnab240BBSegmentoB.NUMERO_LOCAL, hlm.getNumeroLocal());
         line.setFieldValue(LineCnab240BBSegmentoB.COMPLEMENTO, hlm.getComplemento());
         line.setFieldValue(LineCnab240BBSegmentoB.BAIRRO, hlm.getBairro());
         line.setFieldValue(LineCnab240BBSegmentoB.NOME_CIDADE, hlm.getNomeCidade());
         line.setFieldValue(LineCnab240BBSegmentoB.CEP, hlm.getCep());
         line.setFieldValue(LineCnab240BBSegmentoB.COMPLEMENTO_CEP, hlm.getComplementoCep());
         line.setFieldValue(LineCnab240BBSegmentoB.ESTADO, hlm.getEstado());
         line.setFieldValue(LineCnab240BBSegmentoB.VENCIMENTO, hlm.getVencimento());
         line.setFieldValue(LineCnab240BBSegmentoB.VALOR_DOCUMENTO_NOMINAL, hlm.getValorDocumento());
         line.setFieldValue(LineCnab240BBSegmentoB.VALOR_ABATIMENTO, hlm.getValorAbatimento());
         line.setFieldValue(LineCnab240BBSegmentoB.VALOR_DESCONTO, hlm.getDesconto());
         line.setFieldValue(LineCnab240BBSegmentoB.VALO_MORA, hlm.getMora());
         line.setFieldValue(LineCnab240BBSegmentoB.VALO_MULTA, hlm.getMulta());
         line.setFieldValue(LineCnab240BBSegmentoB.CODIGO_DOC_FAVORECIDO, hlm.getCodigoDocumentoFavorecido());
         line.setFieldValue(LineCnab240BBSegmentoB.AVISO_FAVORECIDO, hlm.getAviso());
         line.setFieldValue(LineCnab240BBSegmentoB.EXCLUSIVO_SIAPE, hlm.getSiape());
         line.setFieldValue(LineCnab240BBSegmentoB.CODIGO_SPB, hlm.getIspb());
        
        
        return line;
      }
}
