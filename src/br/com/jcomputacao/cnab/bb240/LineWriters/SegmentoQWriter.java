/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBSegmentoQ;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoQModel;

/**
 *
 * @author Marcos
 */
public abstract class SegmentoQWriter {

    public LineModel getSegmentoQLine(SegmentoQModel soq){
        LineModel line = new LineCnab240BBSegmentoQ().createModel();
        line.setFieldValue(LineCnab240BBSegmentoQ.BAIRRO, soq.getBairro());
        line.setFieldValue(LineCnab240BBSegmentoQ.CIDADE, soq.getCidade());
        line.setFieldValue(LineCnab240BBSegmentoQ.ENDERECO, soq.getEndereco());
        line.setFieldValue(LineCnab240BBSegmentoQ.NOME, soq.getNome());
        line.setFieldValue(LineCnab240BBSegmentoQ.NOME_SACADOR, soq.getNomeSacador());
        line.setFieldValue(LineCnab240BBSegmentoQ.CEP, soq.getNumeroCep());
        line.setFieldValue(LineCnab240BBSegmentoQ.CODIGO_MOVIMENTO_REMESSA, soq.getNumeroCodigoRemessa());
        line.setFieldValue(LineCnab240BBSegmentoQ.CODIGO_INSCRICAO, soq.getNumeroInscricao());
        line.setFieldValue(LineCnab240BBSegmentoQ.NUMERO_INSCRICAO_TERCEIRO, soq.getNumeroInscricaoSacador());
        line.setFieldValue(LineCnab240BBSegmentoQ.CODIGO_DO_LOTE, soq.getNumeroLoteServico());
        line.setFieldValue(LineCnab240BBSegmentoQ.SEQUENCIAL_REGISTRO, soq.getNumeroSequencial());
        line.setFieldValue(LineCnab240BBSegmentoQ.SUFIXO_CEP, soq.getNumeroSufixoCep());
        line.setFieldValue(LineCnab240BBSegmentoQ.TIPO_INSCRICAO, soq.getNumeroTipoInscricao());
        line.setFieldValue(LineCnab240BBSegmentoQ.TIPO_INSCRICAO_TERCEIRO, soq.getNumeroTipoInscricaoSacador());
        line.setFieldValue(LineCnab240BBSegmentoQ.UF, soq.getUnidadeFederacao());
        return line;
    }
}
