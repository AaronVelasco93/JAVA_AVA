/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;
/**
 *
 * @author Aaron
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
    
    //&& Operador de AND: y
    //|| Operador or : O
    // ! Operador nor : negacion
  /*  
    AND
    expre  &&  expre  = false
    a==b     C>D 
    a=1     C=85
    b=10    d=115
    false   false
    0       0  
    
    
    A B Resultado
    0 0 0      
    0 1 0
    1 0 0
    1 1 1
    */
   /* 
    int a= 10, b=10;
    int C = 8, D=15;
    System.out.println( (a==b) && (C>D) );     
   */ 
    
    
    
 /*   
    OR
    expre  ||  expre  = true
    a==b     C>D 
    a=10     C=85
    b=10    d=115
    true    false
    1       0
    A B Resultado 
    0 0 0
    1 0 1
    0 1 1
    1 1 1
   */
    /*
    int a= 10, b=10;
    int C = 85, D=115;
    System.out.println( (a==b) || (C>D) );
    */
    
    //not !
    /*
    A B Resultado AND
    0 0 0      
    0 1 0
    1 0 0
    1 1 1*/
    int a= 10, b=10;
    int C = 85, D=115;
    //                   true       true
    //                   true     ! false -> verdadero
    System.out.println( (a==b) && !(C>D) ); // true
    
        
    
    
    }
     
}
