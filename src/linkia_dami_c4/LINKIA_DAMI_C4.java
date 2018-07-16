/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c4;

import java.util.Scanner;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alternativa a leer datos por línea de comandos
        Scanner sc = new Scanner(System.in); 
        int op=0;
        
       /*
        //Alternativa a leer datos por línea de comandos
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Introduce una edad entre un rango de 0 a 99 años");
        int edad = sc.nextInt();
       
        System.out.println("Introduce tu nombre");
        String nombre = sc.next();
        
        System.out.println("Tu nombre es:" + nombre);
        
        
      
        
        System.out.println("Introduce el número de la tabla que quieras obtener:");
        int tabla = sc.nextInt();
       
        
        
        
        for(int i = 1;i<=10;i++){
            System.out.println("El resultado es:" + tabla + "x" + i + " = " + (tabla*i));
          op = 3;   
        }*/
          /*
        Recibe un numero : 2
        2 x 1 = 2
        2 x 2 = 4
        ....
        2 x 10 = 20
        */
        //Bucle 
        /*
        pedir el numero de la tabla de multiplicar
        2 x i = 2 * i -> 2 x 1 = (2x1)
        2 x i+1(2) = 2 * (i+1)
        2 x i+2
        */
        
        int cont=0;
        int aux = 0;
        
        do{
            System.out.println("Introduce una opción");
            System.out.println("1-Sumar 1");
            System.out.println("2-Pasar los números");
            System.out.println("0-Salir");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                   cont++; 
                break;
                case 2:
                    aux += cont;
                    System.out.println("Has conseguido :" + aux + " puntos crack!");
                    System.out.println("El valor de tus puntos máximos en la partida ha sido: " + cont);
                    cont = 0;
                    System.out.println("Contador reseteado");
                break;
                case 3:
                    System.out.println("Hasta luego lucas!");
                break;
                default:
                    System.out.println("No es una opción correcta!");
            } 
        }while(op != 0);
        
        
        
    }
    
}
