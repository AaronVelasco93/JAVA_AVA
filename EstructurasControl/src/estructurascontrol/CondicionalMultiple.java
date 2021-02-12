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
public class CondicionalMultiple {
    
    public static void main(String[] args) {
       
        int a ;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa o 1 o 2 o 5:");
            a= entrada.nextInt();
        switch (a){
            case 1:
                System.out.println("Estas en el case 1");
                System.out.println("Buenos dias");
                break;
            case 2:
                System.out.println("Estas en el case 2");
                System.out.println("Buenas tardes");
                break;
            case 5:
                System.out.println("Estas en el case 5");
                System.out.println("Buenas noches");
                break;
            default:
                System.out.println("Sin coincidencia");
                
        }
        
        
        
    }
    
}
