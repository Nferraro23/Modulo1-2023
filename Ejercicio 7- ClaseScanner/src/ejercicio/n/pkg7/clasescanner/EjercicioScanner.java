
package ejercicio.n.pkg7.clasescanner;
    //Importar librerias con clase scanner

import java.util.Scanner;

public class EjercicioScanner {

   
    public static void main(String[] args) {
        //Variables
        int num;
        int nac;
        int fecha;
        int resta;
        String nombre;
        String apellido;
        //Datos
        fecha = 2023;
        //Crear objetos scanner
        Scanner lector = new Scanner(System.in);
        //Pedir datos de usuario
        System.out.print("Ingresar su Nombre: ");
        nombre = lector.nextLine();
        System.out.print("Ingresar su Apellido: ");
        apellido = lector.nextLine();
        System.out.print("Ingrese el ano de su nacimiento: ");
        nac = lector.nextInt();
        //Operacion
        resta= fecha - nac;
        //Muestro en pantalla la edad
        System.out.println("--Edad--: " + resta);
            
        
        
        
        
        
    }
    
}
