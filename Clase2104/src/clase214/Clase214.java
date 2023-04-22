
package clase214;

import java.util.Scanner;

public class Clase214 {

 
    public static void main(String[] args) {
        
        /*
        
            int contarnumpar = 0;
            int contarnumimpar =0;
            
        for (int ini = 0; ini <= 100; ini++){
        

            
            System.out.println("El valor de ini es: " + ini);
        
       
            
            if (ini%2 == 0){
            
                contarnumpar ++;
            
            
            } else {
            
            contarnumimpar ++;
            }
            } 
        System.out.println ("Cantidad de numeros pares son : "+ contarnumpar );
        System.out.println ("Cantidad de numeros impares son: "+ contarnumimpar );

            }
            }
    
*/
        
        /*
                int num=0;
                        Scanner leer= new Scanner (System.in);
                        System.out.println ("Ingrese un numero: ");
                        num = leer.nextInt ();
                for (int i =-50; i < num ;i++){
                    
                    if(i%3==0){
                        
                        System.out.println (" El numero " + i + " es multipplo de 3");
                        
                }else {
                        System.out.println (" El numero " + i + " no es multimplo de 3");       
                 
                    }     
                }
    }
}

*/
        
        int resultado = 1;
        int num = 0;
        
        Scanner leer = new Scanner (System.in);
    
        System.out.println ("Ingrese un numero : ");
        num = leer.nextInt ();
        
        
        
        for (int i = 2; i <num + 1 ; i++){
        
        
            resultado *=i;
        
            System.out.println ("ini vale : " + i + " de " + num);
        
        }
            System.out.println(resultado);




}
    }