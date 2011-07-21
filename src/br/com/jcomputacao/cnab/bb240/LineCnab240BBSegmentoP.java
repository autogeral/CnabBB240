/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240BBSegmentoP extends LineArchetype  {

    /**
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCOS_COMPENSACAO";

    /**
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     */
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";

    /**
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";

    /**
     * SEQUENCIAL DE REGISTRO - NUMERICO
     * POSICAO 009 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";

    /**
     * CODIGO DO SEGMENTO DE REGISTRO - DEFAULT P
     * POSICAO 014 014
     * CONTEUDO 'P'
     */
    public static final String CODIGO_SEGMENTO_REGISTRO = "CODIGO_SEGMENTO_REGISTRO";

    /**
     * EXCLUSIVO FEBRABAN - BRANCOS
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 015 015
     * CONTEUDO '  '
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * CODIGO DO MOVIMENTO DE REMESSA - NUMERICO
     * Códigos de Movimento para Remessa tratados pelo Banco do Brasil:
     * 01 – Entrada de títulos
     * 02 – Pedido de baixa
     * 04 – Concessão de Abatimento
     * 05 – Cancelamento de Abatimento
     * 06 – Alteração de Vencimento
     * 07 – Concessão de Desconto
     * 08 – Cancelamento de Desconto
     * 09 – Protestar
     * 10 – Cancela/Sustação da Instrução de protesto
     * 30 – Recusa da Alegação do Sacado
     * 31 – Alteração de Outros Dados
     * 40 – Alteração de Modalidade.
     * POSICAO 016 017
     * PICTURE 9(02)
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";

    /**
     * AGENCIA MANTENEDORA
     * POSICAO 018 022
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";

    /**
     * DIGITO VERIFICADOR DA AGENCIA
     * POSICAO 023 023
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA = "DIGITO_VERIFICADOR_AGENCIA";

    /**
     * NUMERO DA CONTA - NUMERICO 12
     * POSICAO 024 035
     */
    public static final String NUMERO_CONTA = "NUMERO_CONTA";

    /**
     * DIGITO VERIFICADOR DA CONTA
     * POSICAO 036 036
     */
    public static final String DIGITO_VERIFICADOR_CONTA = "DIGITO_VERIFICADOR_CONTA";

    /**
     * BRANCOS
     * POSICAO 037 037
     */
    public static final String BRANCOS_1 = "BRANCOS_1";

    /**
     * IDENTIFICACAO DO TITULO NO BANCO
     * POSICAO 038 057
     * 20 POSICOES
     */
    public static final String IDENTIFICACAO_TITULO_BANCO = "IDENTIFICACAO_TITULO_BANCO";


    public LineCnab240BBSegmentoP(){

        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldDefaultArchetype("001"));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO_REGISTRO, new FieldDefaultArchetype("P"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldDefaultArchetype(" "));
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_CONTA, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(DIGITO_VERIFICADOR_CONTA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(BRANCOS_1, new FieldDefaultArchetype(" "));
        addFieldArchetype(IDENTIFICACAO_TITULO_BANCO, new FieldStringFixedLengthArchetype(20));
    }

}
