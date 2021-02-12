/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascontrol;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class If2 {

    public static void main(String[] args) {
        /*
         int a;
         a= 13;
        
         if ((a+1) < 10){
         a=0;
         System.out.println("Hola");
         }
        
         a=1;
         System.out.println("El Valor de a es: "+a);
         */
        /*
         int a;
         int b;
         int X;
         int Y;

         //and 
         a = 10;
         b = 7;
         X = 56;
         Y = 56;

         if ((a < b) || (X == Y)) {
         System.out.println("Esta afirmacion es verdadera");

         }
         */
        /**
         * if (condicion){ bloque de instrucciones }else{ bloque de
         * instrucciones }
         *
         *
         */
        //comparacion de numero
//PROGRAMA QUE TE DIGA SI PUEDES ENTRAR A UN BAR

        //TIENES QUE TENER MAS DE 18
        Scanner entrada = new Scanner(System.in);
        int Edad;
        final int EdadEstablecida = 18;
       
        int conocer=0;//si conoces

        System.out.println("Cadenero: ¿Cual es tu edad?;");

        System.out.print("Persona: Mi edada es de: ");
        Edad = entrada.nextInt();
        
        System.out.println("Persona: conosco a alguien ...");

        System.out.println("Cadenero revisa a la persona");

        System.out.println("..........");

        if (Edad >= 18) {
            System.out.println("Cadenero: Puedes pasar");

        } else if (conocer == 1){
            System.out.println("cadenero: Puedes pasar apesar de que no cumples con la edad");
        }else{
            System.out.println("Cadenero: no puedes pasar por que no cumples con la edad y tampoco conoces a nadie ");
        
        }
        
        
        System.out.println("Persona: gracias");

    }
}
