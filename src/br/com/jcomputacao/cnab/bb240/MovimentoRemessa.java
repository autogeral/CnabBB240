package br.com.jcomputacao.cnab.bb240;

/**
 * 21/11/2011 08:58:32
 * @author murilo
 */
public enum MovimentoRemessa {
    /**
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
     * */
    ENTRADA_TITULO, PEDIDO_BAIXA, CONCESSAO_ABATIMENTO, CANCELAMENTO_ABATIMENTO,
    ALTERACAO_VENCIMENTO, CONCESSAO_DESCONTO, CANCELAMENTO_DESCONTO, PROTESTAR,
    CANCELA_INSTRUCAO_PROTESTO, RECUSA_ALEGACAO_SACADO, ALTERACAO_OUTROS_DADOS,
    ALTERACAO_MODALIDADE;
}
