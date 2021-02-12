/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascontrol;

/**
 *
 * @author Aaron
 */
public class Test {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <=5; i++) {
            
            System.out.println("------Ejecucion i : "+i+"------");
            
                for (int j = 1; j <= 3; j++) {
                    System.out.println("Ejecucion j : "+j+"---Pertenece a la evaluacion i "+i);
                }
            
        }
        
    }
    
}
