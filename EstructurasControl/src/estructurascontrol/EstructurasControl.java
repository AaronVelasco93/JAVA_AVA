package estructurascontrol;

import java.util.Scanner;

public class EstructurasControl {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         *if (condicion){
         *  bloque de instruccion a ejecutar 
         * }
         * 
         **/
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("-----Comparacion de dos numero iguales-----");
        
        int Numero1;
        int Numero2;
        int Operacion;
        //entrada de datos por parte del usuario
        
        System.out.print("Ingresa el valor del numero1:");
            Numero1 = entradaDatos.nextInt();
        System.out.print("Ingresa el valor del numero2:");
            Numero2 = entradaDatos.nextInt();
          
        if (Numero1 == Numero2) {// s es verdadero 
            System.out.println("Son los mismos ");
                
            Operacion = Numero1+ Numero2;
            
            System.out.println("La suma de los dos numeros es:"+Operacion);
            
        }
        
        
        
    }
    
}
