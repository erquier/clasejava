package primerprograma;

import java.util.Scanner; //importacion de codigo de la clase scanner desde la biblioteca java


public class PrimerPrograma {

   
    public static void main(String[] args) {
       
        System.out.println("Empezamos el programa \n");
        String nombre;
        int edad;
        
        Scanner entradaEscaner=new Scanner(System.in);
        
        System.out.print("Digite un nombre: ");
        nombre=entradaEscaner.next();
        System.out.print("Digite su edad: ");
        edad=entradaEscaner.nextInt();
        
        System.out.println("Su nombre es: " +nombre);
        System.out.println("Su edad es: " +edad);
    }
    
}
