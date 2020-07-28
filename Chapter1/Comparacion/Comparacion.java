// Comparacion.java - David Smith - 28 junio 2020 - tomado de Deitel
// Compara enteros utilizando instrucciones if, operadores relaciones 
// y de igualdad
import java.util.Scanner;

public class Comparacion 
{
    // el método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args)
    {
        // crea  objeto Scanner para obtener la entrada de la ventada de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; // primer número a comparar
        int numero2; // segundo número a comparar

        System.out.print("Escriba el primer número entero: "); // indicador
        numero1 = entrada.nextInt(); // leer el primer número del usuario

        System.out.print("Escriba el segundo número entero: "); // indicador
        numero2 = entrada.nextInt(); // leer el segundo número del usuario

        if(numero1 == numero2){
            System.out.printf("%d == %d\n", numero1, numero2);
        }
        if(numero1 != numero2){
            System.out.printf("%d != %d\n", numero1, numero2);
        }
        if(numero1 < numero2){
            System.out.printf("%d < %d\n", numero1, numero2);
        }
        if(numero1 > numero2){
            System.out.printf("%d > %d\n", numero1, numero2);
        }
        if(numero1 <= numero2){
            System.out.printf("%d <= %d\n", numero1, numero2);
        }
        if(numero1 >= numero2){
            System.out.printf("%d >= %d\n", numero1, numero2);
        }
    } // fin del método main
} // fin de la clase Comparación