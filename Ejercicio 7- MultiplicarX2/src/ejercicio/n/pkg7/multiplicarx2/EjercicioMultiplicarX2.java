
package ejercicio.n.pkg7.multiplicarx2;

import java.util.Scanner;

public class EjercicioMultiplicarX2{

    public static void main(String[] args) {
        //Variables
        int num;
        int resultado;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingresar numero: ");
        num= lector.nextInt();
        resultado = num * 2;
        System.out.println("Multiplicado x 2 : " + resultado);
        
        
        
        
    }
    
}
