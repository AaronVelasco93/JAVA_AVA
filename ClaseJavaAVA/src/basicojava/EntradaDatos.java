package basicojava;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //para leer desde el teclado 
        //clase de tipo escaner y es estatica
        
        Scanner EntradaDeTeclado = new Scanner(System.in);
        
        /**
         * metodos
         *EntradaDeTeclado.nextInt() Lee un numero entero (int por teclado)
         *EntradaDeTeclado.nextDouble Lee un numero real (double)
         *EntradaDeTeclado.nextLine() Lee una cadenra de caracteres hasta que se pulsa la tecla enter intro 
         **/
        /*
        //Ejemplo de entrada de dato 1
         int numero;
         
         System.out.println("---Ingresando Datos---");
         System.out.print("Ingresa un dato numerico entero: ");
         numero = EntradaDeTeclado.nextInt();
         
         System.out.println("Tu dato numerico ingresado es: "+ numero);
         */
/*
        //Ejemplo de entrada de dato 2
        
        //Programa: Pedir al usuario su edad y que muestre la edad que tendra el siguiente año
        //EntradaDeTeclado -> Scanner 
        
        int edad;
        System.out.print("Ingresa tu edad: ");
            edad= EntradaDeTeclado.nextInt();
            
        edad+=1;
        //edad = edad + 1
        System.out.println("El proximo año tu edad sera de: "+edad+" Años");
 */
        //ejemplo de programa 3
        
        
        //diseñar un programa que calcule la longitus y el area de una circunferencia
        //logitud= 2PI * radio
        //area = PI * radio2 
        //EntradaDeTeclado -> Scanner
        
        final double PI = 3.1416;//Pi como una constante
        double radio; //por que pude tener decimales
        double area, longitud; //declaracion en double por decimales
        
        //Pedir el radio al usuario
        System.out.print("Escriba el Radio: ");
            radio=EntradaDeTeclado.nextDouble();
            
            longitud = (2 *PI)* radio;
            area = PI * (radio*radio);
            System.out.println("La longitud de el circulo es:"+ longitud);
            System.out.println("El area es: "+area);
        
        
                 
                 
        
        
        
    }
    
}
