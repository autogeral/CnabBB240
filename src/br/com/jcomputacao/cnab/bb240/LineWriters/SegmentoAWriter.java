package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoA;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoAModel;

/**
 * 20/03/2015 15:08:27
 *
 * @author Thiago
 */
public class SegmentoAWriter {

    public static LineModel getSegmentoALine(SegmentoAModel hlm) {
        LineModel line = new LineCnab240BBSegmentoA().createModel();

        line.setFieldValue(LineCnab240BBSegmentoA.CODIGO_BANCO_COMPENSACAO, hlm.getCodigoBanco());
        line.setFieldValue(LineCnab240BBSegmentoA.CODIGO_DO_LOTE, hlm.getLote());
        line.setFieldValue(LineCnab240BBSegmentoA.TIPO_DE_REGISTRO, hlm.getRegistro());
        line.setFieldValue(LineCnab240BBSegmentoA.NUMERO_REGISTRO, hlm.getNumeroSequencial());
        line.setFieldValue(LineCnab240BBSegmentoA.CODIGO_SEGMENTO, hlm.getSegmento());
        line.setFieldValue(LineCnab240BBSegmentoA.TIPO_MOVIMENTO, hlm.getTipoMovimento());
        line.setFieldValue(LineCnab240BBSegmentoA.CODIGO_MOVIMENTO, hlm.getCodigoInstrucaoMoviemtno());
        line.setFieldValue(LineCnab240BBSegmentoA.CAMARA, hlm.getCodigoCamaraCentralizada());
        line.setFieldValue(LineCnab240BBSegmentoA.CODIGO_BANCO_FAVORECIDO, hlm.getCodigoBancoFavorecido());
        line.setFieldValue(LineCnab240BBSegmentoA.AG_MANTENEDORA_CTA_FAVOR, hlm.getAgMantenedoraCtaFavor());
        line.setFieldValue(LineCnab240BBSegmentoA.DIGITO_VERIFICADOR_AGENCIA, hlm.getDigitoVerificadorAgencia());
        line.setFieldValue(LineCnab240BBSegmentoA.NUMERO_CONTA_CORRENTE, hlm.getNumeroContaCorrente());
        line.setFieldValue(LineCnab240BBSegmentoA.DIGITO_VERIFICADOR_CONTA, hlm.getDigitoVerificadorConta());
        line.setFieldValue(LineCnab240BBSegmentoA.NOME_FAVORECIDO, hlm.getNome());
        line.setFieldValue(LineCnab240BBSegmentoA.N_DOCUMENTO_ATRIBUIDO_PARA_EMPRESA, hlm.getNumeroDocumAtributoEmpresa());
        line.setFieldValue(LineCnab240BBSegmentoA.DATA_PAGAMENTO, hlm.getDataPagamento());
        line.setFieldValue(LineCnab240BBSegmentoA.TIPO_MOEDA, hlm.getTipoMoeda());
        line.setFieldValue(LineCnab240BBSegmentoA.QUANTIDADE_MOEDA, hlm.getQuantidadeMoeda());
        line.setFieldValue(LineCnab240BBSegmentoA.VALOR_PAGAMENTO, hlm.getValorPagamento());
        line.setFieldValue(LineCnab240BBSegmentoA.NOSSO_NUMERO, hlm.getnDocumentoAtributoBanco());
        line.setFieldValue(LineCnab240BBSegmentoA.DATA_PAGAMENTO, hlm.getDataPagamento());
        line.setFieldValue(LineCnab240BBSegmentoA.VALOR_REAL, hlm.getValorReal());
        line.setFieldValue(LineCnab240BBSegmentoA.INFORMACAO_2, hlm.getInformacao2());
        line.setFieldValue(LineCnab240BBSegmentoA.CODIGO_FINALIDADE_DOC, hlm.getCodigoFinalidadeDoc());
        line.setFieldValue(LineCnab240BBSegmentoA.CODIGO_FINALIDADE_TED, hlm.getCodigoFinalidadeTED());
        line.setFieldValue(LineCnab240BBSegmentoA.CODIGO_FINALIDADE_COMPLEMENTAR, hlm.getCodigoFinalidadeComplementar());
        line.setFieldValue(LineCnab240BBSegmentoA.EXCLUSIVO_FEBRABAN, hlm.getCnab());
        line.setFieldValue(LineCnab240BBSegmentoA.AVISO, hlm.getAviso());
        line.setFieldValue(LineCnab240BBSegmentoA.OCORRENCIAS, hlm.getOcorrencias());

        return line;
    }
}
