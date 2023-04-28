
package juego;

import java.util.Random;
import java.util.Scanner;

public class Juego {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
            String resp1= "";
            String resp2= "";
            int numerorandom;
            String jugador1 = "";
            String jugador2 = "";
            Random RD= new Random();
            
            //Numero Random
            
            numerorandom= RD.nextInt(3)+1;
            
            //Inicio del juego
            
            System.out.println("-------------------------");
            System.out.println("Juego piedra-papel-tijera");
            System.out.println("-------------------------");
            
            //Pedir opcion al juegador
            
            System.out.print("Ingrese su Nombre : ");
            jugador1 =leer.next();
            
            //Dar inicio al juego
            
            System.out.println("-----Inicio del juego-----");
            System.out.println("---La P es Piedra---------");
            System.out.println("---La L es Papel----------");
            System.out.println("---La T es Tijera---------");
            
            //Pedir al juegador que ingrese la opcion
            
            System.out.println("\nINTRODUCIR LA OPCION P-L-T\n" + jugador1 + " : ");
            resp1=leer.next();
            
            //numeros en letras
            
            switch(numerorandom){
            
                case 1 : resp2="p";
            
                    break;
                    
                case 2 : resp2="T";
                
                    break;
                   
                case 3 : resp2="L";
                
                    break;
            }
            
            System.out.println( "\n LA OPCION DE R2D fue : " +resp2 );
             
            //Logica del juego
            
            if(resp1.equals("P" ) && resp2.equals ( "P" ) ){
            
            System.out.println("\nEMPATE!!!\n");
            
           
            } 
            
            if(resp1.equals("P" ) && resp2.equals ( "L" ) ){
            
            System.out.println("\nGANADOR!!!\n" +jugador1 + "\n");
            
            
            } 
            
            if(resp1.equals("L" ) && resp2.equals ( "L" ) ){
            
            System.out.println("\nEMPATE!!!\n");
            
            
            } 
            
            if(resp1.equals("L" ) && resp2.equals ( "P" ) ){
            
            System.out.println("\nGANADOR!!!\n" +jugador1 + "\n");
            
            }
            
            if(resp1.equals("L" ) && resp2.equals ( "T" ) ){
            
            System.out.println("\nGANADOR!!!\n" +jugador2 + "\n");
            
            }
            
            if(resp1.equals("T" ) && resp2.equals ( "T" ) ){
            
            System.out.println("\nGANADOR!!!\n" +jugador2 + "\n");
            
            }
            
            if(resp1.equals("T" ) && resp2.equals ( "P" ) ){
            
            System.out.println("\nGANADOR!!!\n" +jugador1 + "\n");
            
            }
            
            if(resp1.equals("P" ) && resp2.equals ( "L" ) ){
            
            System.out.println("\nGANADOR!!!\n" +jugador1 + "\n");
            
            }
            
    }
}
