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
public class JuegoMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero_intentos=0;
        int numero_aleatorio=Aleatorio.obtenerNumero();
        System.out.println("n"+numero_aleatorio);
        int numero_usuario=EntradaSalida.pedirNumero();
        
//numero_intentos=numero_intentos+1;
        numero_intentos++;
        while(numero_aleatorio!=numero_usuario)
        {
            if(numero_aleatorio>numero_usuario)
            {
                System.out.println("Mayor");
            }
            else
            {
                System.out.println("Menor");
            }
            numero_usuario=EntradaSalida.pedirNumero();
            numero_intentos++;
        }
        /*    if (numero_intentos<3)
            {
            System.out.println("Enhorabuena, solo has necesitado "+
                    numero_intentos+" intentos");
            }
            else
            {
                System.out.println("No se te recomienda comprar lotería");
            }*/
                if (numero_intentos==1)
                {
                    System.out.println("Eres un pro");
                }
                else if(numero_intentos>3)
                {
                    System.out.println("Eres un zoquete");
                }
                else
                {
                    System.out.println("Ha estado bien");
                }
            
            
    }
    
}
