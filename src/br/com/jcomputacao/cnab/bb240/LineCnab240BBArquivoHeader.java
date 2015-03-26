package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Thiago Balthazar 16/03/2015
 */
public class LineCnab240BBArquivoHeader extends LineArchetype {

    /**
     * CODIGO DO BANCO - DEFAULT 001 POSICAO 001 003
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCOS";
    /**
     * TIPOS DE REGISTRO POSICAO 004 008 - DEFAULT ZEROS
     */
    public static final String LOTE_TIPO_REGISTRO = "LOTE_TIPO_REGISTRO";
    /*
     Lote de Serviço 
     POSICAO 004 ATÉ 007 DEFAULT - '0000'    
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";

    /**
     * BRANCOS - EXCLUSIVO FEBRABAN POSICAO 009 017 - BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    /**
     * TIPO INSCRICAO DA EMPRESA POSICAO 018 018
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * NUMERO INSCRICAO DA EMPRESA POSICAO 019 032
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * CODIGO DO CONVENIO NO BANCO POSICAO 033 052
     */
    public static final String CODIGO_CONVENIO = "CODIGO_CONVENIO";
    /**
     * AGENCIA MANTENEDORA DA AGENCIA POSICAO 053 057
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";
    /**
     * DIGITO VERIFICADOR DA AGENCIA POSICAO 058 058
     */
    public static final String DIGITO_VER_AGENCIA = "DIGITO_VER_AGENCIA";
    /**
     * NUMERO DA CONTA CORRENTE POSICAO 059 070
     */
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";
    /**
     * DIGITO VERIFICADOR CONTA CORRENTE POSICAO 071 071
     */
    public static final String DIGITO_VER_CONTA = "DIGITO_VER_CONTA";
    /**
     * DIGITO VERIFICADOR DA AG/CONTA
     */
    public static final String DIGITO_VER_AG_CONTA = "DIGITO_VER_AG_CONTA";
    /**
     * BRANCO POSICAO 072 072
     */
    public static final String BRANCO = "BRANCO";
    /**
     * NOME DA EMPRESA POSICAO 073 102
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";
    /**
     * NOME DO BANCO POSICAO 103 132
     */
    public static final String NOME_BANCO = "NOME_BANCO";
    /**
     * BRANCOS - EXCLUSIVO FEBRABAN - 2 POSICAO 133 142 - BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";
    /**
     * CODIGO DE REMESSA OU RETORNO POSICAO 143 143
     */
    public static final String CODIGO_REM_RET = "CODIGO_REM_RET";
    /**
     * DATA DE GERACAO DO ARQUIVO POSICAO 144 151
     */
    public static final String DATAHORA_GERACAO_ARQUIVO = "DATA_GERACAO_ARQUIVO";
    /**
     * NUMERO SEQUENCIAL DO ARQUIVO POSICAO 158 163
     */
    public static final String NUM_SEQUENCIAL_ARQUIVO = "NUM_SEQUENCIAL_ARQUIVO";
    /**
     * NUMERO VERSAO DO LAYOUT - '084' POSICAO 164 166
     */
    public static final String VERSAO_LAYOUT = "VERSAO_LAYOUT";
    /**
     * DENSIDADE DE GRAVACAO DO ARQUIVO POSICAO 167 171
     */
    public static final String DENSIDADE_GRAVACAO = "DENSIDADE_GRAVACAO";
    /**
     * RESERVADO BANCO POSICAO 172 191
     */
    public static final String RESERVADO_BANCO = "RESERVADO_BANCO";
    /**
     * RESERVADO EMPRESA POSICAO 192 211
     */
    public static final String RESERVADO_EMPRESA = "RESERVADO_EMPRESA";
    /**
     * EXCLUSIVO FEBRABAN 3 - 29 BRANCOS POSICAO 103 132
     */
    public static final String EXCLUSIVO_FEBRABAN_3 = "EXCLUSIVO_FEBRABAN_3";
    /**
     * Identificação cobrança sem papel POSICAO 223 225
     */
    public static final String IDENTIFICACAO = "IDENTIFICACAO";
    /**
     * USO EXCLUSIVO DAS VANS
     */
    public static final String CONTROLE_VANS = "CONTROLE_VANS";
    /**
     * TIPO DE SERVICO
     */
    public static final String TIPO_SERVICO = "TIPO_SERVICO";
    /**
     * CODIGO DE OCORRENCIAS
     */
    public static final String CODIGO_OCORRENCIA = "CODIGO_OCORRENCIA";
    
    
    public LineCnab240BBArquivoHeader() {

        //DADOS DE CONTROLE
        addFieldArchetype(CODIGO_BANCO, new FieldDefaultArchetype("001"));
        addFieldArchetype(LOTE_SERVICO, new FieldDefaultArchetype("0000"));
        addFieldArchetype(LOTE_TIPO_REGISTRO, new FieldDefaultArchetype("0"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(9, ' '));

        //DADOS DA EMPRESA
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(14));        
        addFieldArchetype(CODIGO_CONVENIO, new FieldStringFixedLengthArchetype(20));      
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(DIGITO_VER_AGENCIA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(12));        
        addFieldArchetype(DIGITO_VER_CONTA, new FieldStringFixedLengthArchetype(1));        
        addFieldArchetype(DIGITO_VER_AG_CONTA, new FieldDefaultArchetype("0"));
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(10, ' '));
        

        //DADOS DO ARQUIVO        
        addFieldArchetype(CODIGO_REM_RET, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DATAHORA_GERACAO_ARQUIVO, new FieldDateFixedLengthArchetype("ddMMyyyyHHmmss"));
        addFieldArchetype(NUM_SEQUENCIAL_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(VERSAO_LAYOUT, new FieldDefaultArchetype("040"));
        addFieldArchetype(DENSIDADE_GRAVACAO, new FieldDefaultArchetype("00000"));
        addFieldArchetype(RESERVADO_BANCO, new FieldFillerArchetype(20, ' '));
        addFieldArchetype(RESERVADO_EMPRESA, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_3, new FieldFillerArchetype(11, ' '));
    }
}
