package br.com.jcomputacao.cnab.bb240.LineWriters;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.bb240.LineCnab240BBArquivoHeader;
import br.com.jcomputacao.cnab.bb240.models.remessa.HeaderArquivoModel;

/**
 *
 * @author Thiago Balthazar
 */
public class HeaderArquivoWriter {

    public static LineModel getHeaderArquivoLine(HeaderArquivoModel ham) {
        LineModel line = new LineCnab240BBArquivoHeader().createModel();
                    
        //Dados da Empresa        
        line.setFieldValue(LineCnab240BBArquivoHeader.TIPO_INSCRICAO, ham.getTipoInscricao());
        line.setFieldValue(LineCnab240BBArquivoHeader.NUMERO_INSCRICAO, ham.getNumeroInscricao());
        line.setFieldValue(LineCnab240BBArquivoHeader.CODIGO_CONVENIO, ham.getCodigoConvenio());
        line.setFieldValue(LineCnab240BBArquivoHeader.AGENCIA_MANTENEDORA, ham.getAgenciaMantenedora());
        line.setFieldValue(LineCnab240BBArquivoHeader.DIGITO_VER_AGENCIA, ham.getDigitoVerificadorAgencia());
        line.setFieldValue(LineCnab240BBArquivoHeader.NUMERO_CONTA_COR, ham.getNumeroConta());
        line.setFieldValue(LineCnab240BBArquivoHeader.DIGITO_VER_CONTA, ham.getDigitoVerificadorConta());
        line.setFieldValue(LineCnab240BBArquivoHeader.DIGITO_VER_AG_CONTA, ham.getDigitoVerificadorAgencia());
        line.setFieldValue(LineCnab240BBArquivoHeader.NOME_EMPRESA, ham.getNomeEmpresa());
        line.setFieldValue(LineCnab240BBArquivoHeader.NOME_BANCO, ham.getNomeBanco());
        line.setFieldValue(LineCnab240BBArquivoHeader.EXCLUSIVO_FEBRABAN, ham.getExclusivoFebraban1());
        
        //DADOS ARQUIVO
        line.setFieldValue(LineCnab240BBArquivoHeader.CODIGO_REM_RET, ham.getCodigoRemessaRetorno());
        line.setFieldValue(LineCnab240BBArquivoHeader.DATA_GERACAO_ARQUIVO, ham.getDataHoraGeracao());
        line.setFieldValue(LineCnab240BBArquivoHeader.HORA_GERACAO_ARQUIVO, ham.getDataHoraGeracao());
        line.setFieldValue(LineCnab240BBArquivoHeader.NUM_SEQUENCIAL_ARQUIVO, ham.getNumeroSequencialRegistro());
        line.setFieldValue(LineCnab240BBArquivoHeader.DENSIDADE_GRAVACAO, ham.getDensidadeGravacaoArquivo());
        line.setFieldValue(LineCnab240BBArquivoHeader.RESERVADO_BANCO, ham.getReservadoBanco());
        line.setFieldValue(LineCnab240BBArquivoHeader.RESERVADO_EMPRESA, ham.getReservadoEmpresa());
        line.setFieldValue(LineCnab240BBArquivoHeader.EXCLUSIVO_FEBRABAN_2, ham.getExclusivoFebraban2());
        line.setFieldValue(LineCnab240BBArquivoHeader.IDENTIFICACAO, ham.getIdentificacao());
        line.setFieldValue(LineCnab240BBArquivoHeader.CONTROLE_VANS, ham.getControleVans());
        line.setFieldValue(LineCnab240BBArquivoHeader.TIPO_SERVICO, ham.getTipoServico());
        
        return line;
    }
}
