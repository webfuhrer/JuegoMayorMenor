/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegomayormenor;

/**
 *
 * @author luis
 */
public class Aleatorio {
    public static int obtenerNumero()
    {
        double d=Math.random();
        d=d*9+1;
        int numero=(int)d;
        return numero;
        
    }
}
