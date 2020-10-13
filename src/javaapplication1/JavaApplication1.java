/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Presencial 2º
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
              
              int opcion;
              String nombre;
              int bisiesto;
            
              
                Scanner entrada=new Scanner(System.in);
                System.out.println("Introduzca lo que desea hacer");
                
            do{
                System.out.println("1. Saludar  ");
                System.out.println("2. Despedirse  ");
                System.out.println("3. Introduzca un año");
                System.out.println("4. Salir  ");
                System.out.println("--> ");
                opcion=entrada.nextInt();
                entrada.nextLine();
            
                 switch(opcion){
                
                     case 1: System.out.println("Introduzca su nombre");
                    
                         nombre=entrada.nextLine();
                       
                        break;
                        
                     case 2: 
                          System.out.println("Introduzca su nombre");
                          System.out.println("Au revoir");
                        break;
                        
                     case 3:System.out.print(" Inserte "); 
                            bisiesto=entrada.nextInt();
                            if(bisiesto%4==0){
                                
                                if(bisiesto%400==0)System.out.println("El año es bisiesto");
                                else if(bisiesto%100==0) System.out.println("No es bisiesto");
                                else System.out.println("El año es bisiesto");
                            }
                            else System.out.println("El año no es bisiesto");
//                             entrada.nextLine();
                                    
                        break;
                             
                        
                     case 4: System.out.println("Programa terminado");
                     break;
                
              
                
                 }
              } while(opcion!=4);
   }
                
}
