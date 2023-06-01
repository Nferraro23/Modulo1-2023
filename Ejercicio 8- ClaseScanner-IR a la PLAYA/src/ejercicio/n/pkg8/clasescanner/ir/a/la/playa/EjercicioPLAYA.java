
package ejercicio.n.pkg8.clasescanner.ir.a.la.playa;
//Importar libreria con clase Scanner

import java.util.Scanner;

public class EjercicioPLAYA{


    public static void main(String[] args) {
        //Variables
        String nombre;
        int grados;

        //Crear objetos scanner
        Scanner lector = new Scanner(System.in);
        //Pedir datos
        System.out.print("Pedir Nombre: ");
        nombre = lector.nextLine();
        System.out.print("Grados: ");
        grados = lector.nextInt();
        
        if (grados >= 30){
        System.out.println("--Ir a la playa--");
        }else if (grados <= 30 && grados >= 25){
        System.out.println("--Ir a caminar--");
        }else {
        System.out.println("--Abrigarce--");
           }
        }
    }

