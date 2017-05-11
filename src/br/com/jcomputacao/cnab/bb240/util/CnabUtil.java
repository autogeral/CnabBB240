package br.com.jcomputacao.cnab.bb240.util;

/**
 *
 * @author murilo.lima
 */
public class CnabUtil {

    public static String getAgenciaDigito(String numeroConta) {
        String key = "contaCorrente.agencia.digito";
        String value = System.getProperty(numeroConta + "." + key);
        if (value != null) {
            return value;
        }
        return System.getProperty(key, "4");
    }
}
