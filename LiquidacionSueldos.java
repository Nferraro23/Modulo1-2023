
package liquidacionsueldos;

import java.util.Scanner;

public class LiquidacionSueldos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        String NOMBRE =" ";
        int area=0, ANTIGUEDAD= 0;
        
        System.out.println ("************");
        System.out.println ("******LIQUIDACION******");
        System.out.println ("TATOOINE S.A");
        System.out.print(" INGRESE NOMBRE DEL TRABAJADOR ");
        NOMBRE= entrada.nextLine();
        System.out.print (" CANTIDAD DE AÑOS DE SERVICIO ");
        ANTIGUEDAD= entrada.nextInt ();
        System.out.println("************");
        System.out.println("***01-DEPARTAMENTO DE ATENCION AL CLIENTE***");
        System.out.println("***02-DEPARTAMENTO DE LOGISTICA***");
        System.out.println("***03-GERENCIA***");
        System.out.println("************");
        System.out.println("************");
        System.out.print("***INGRESE UN NUMERO DE AREA*** : ");
        area= entrada.nextInt ();
        
        //logica
        
        if (area ==1) {
        
            if (ANTIGUEDAD ==1){ 
            System.out.println (" EL TRABAJADOR : " + NOMBRE + " ANTIGUEDAD " + ANTIGUEDAD);
            System.out.println ("DEL area ATENCION AL CLIENTE");
            System.out.println ("TIENE 6 DIAS DE VACACIONES");
            }   
            
            } else if (ANTIGUEDAD <=2 && ANTIGUEDAD <= 6){
            System.out.println (" EL TRABAJADOR : " + NOMBRE + " ANTIGUEDAD " + ANTIGUEDAD);
            System.out.println ("DEL area ATENCION AL CLIENTE");
            System.out.println ("TIENE 14 DIAS DE VACACIONES");
            
            } else if (ANTIGUEDAD >=7){
            System.out.println (" EL TRABAJADOR :" + NOMBRE + " ANTIGUEDAD " + ANTIGUEDAD);
            System.out.println ("DEL area ATENCION AL CLIENTE");
            System.out.println ("TIENE 20 DIAS DE VACACIONES");
                
            
            } else if (area ==2){
                    if (ANTIGUEDAD ==1){ 
            System.out.println (" EL TRABAJADOR : " + NOMBRE + " ANTIGUEDAD " + ANTIGUEDAD);
            System.out.println ("DEL area LOGISTICA");
            System.out.println ("TIENE 7 DIAS DE VACACIONES");
            } else if (ANTIGUEDAD >=2 && ANTIGUEDAD <=6){
            System.out.println (" EL TRABAJADOR : " + NOMBRE + " ANTIGUEDAD " + ANTIGUEDAD);
            System.out.println ("DEL area LOGISTICA");
            System.out.println ("TIENE 15 DIAS DE VACACIONES");
            }else if (ANTIGUEDAD ==7){
            System.out.println (" EL TRABAJADOR : " + NOMBRE + " ANTIGUEDAD " + ANTIGUEDAD);
            System.out.println ("DEL area LOGISTICA");
            System.out.println ("TIENE 30 DIAS DE VACACIONES");
            }
            }
            }
            }