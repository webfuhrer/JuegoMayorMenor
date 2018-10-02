/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegomayormenor;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class EntradaSalida {
    public static int pedirNumero()
    {
        System.out.println("Introduce un número");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        return n;
    }
}
