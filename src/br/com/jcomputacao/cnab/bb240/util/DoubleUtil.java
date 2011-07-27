/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.util;

/**
 *
 * @author Marcos
 */
public class DoubleUtil {

    public static double getDouble2Dec(String number){
        String full = number.substring(0, (number.length()-3));
        String decimal = number.substring((number.length()-2), (number.length()-1));
        String completeNumber = full + "." + decimal;
        double returningNumber = Double.parseDouble(completeNumber);
        return returningNumber;
    }
}
