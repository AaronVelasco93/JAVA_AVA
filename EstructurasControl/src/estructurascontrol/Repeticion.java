/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascontrol;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Repeticion {
    
    
    public static void main(String[] args) {
        
        /**
         *for (inicializacion ; condicion ; incremento){
         * bloque de instrucciones
         * 1
         * 2
         * }
         * 
         **/
        /*
        int Numero;
        
        for (Numero = 15; Numero <= 10; Numero ++) {
            
            //numero= 6
            System.out.println(" Numero = "+Numero);
            
        }
        */
        /*
        
        
        int inicio; 
        int fin;
        
        System.out.print("Ingresa el inicio en numero positivo: ");
             inicio = entrada.nextInt();
        System.out.print("Ingresa tu fin, en numero positivo;");
             fin = entrada.nextInt();
        for (int i = inicio; i <= fin; i++) {
            
            System.out.println("Hola: "+ i );
        }
                */
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        numero = entrada.nextInt();
        
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println(numero+" X "+i+" = "+(numero*i));
            
        }
        
        
        /**
         *Generar un programa que me pregunte
         * que tabla de multiplicar quiero y hasta donde 
         * quiero la multiplicacion
         * 
         * 8
         * 56
         **/
        
        
        
        
        
        
    }
    
}
