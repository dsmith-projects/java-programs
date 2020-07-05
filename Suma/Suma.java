// Suma.java - David Smith - 28 junio, 2020  - tomado de Deitel
// Programa que muestra la suma de dos enteros 
import java.util.Scanner; // el programa usa la clase Scanner

public class Suma 
{
    // el método main empieza la ejecución de la aplicación en Java
    public static void main (String[] args)
    {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; // primer número a sumar
        int numero2; // segundo número a sumar
        int suma; // suma de número 1 y número 2

        System.out.print("Escriba el primer número entero: "); // indicador
        numero1 = entrada.nextInt(); // leer el primer número del usuario

        System.out.print("Escriba el segundo número entero: "); // indicador
        numero2 = entrada.nextInt(); // leer el segundo número del usuario

        suma = numero1 + numero2;

        System.out.printf("La suma es %d\n", suma); // muestra la suma

    } // fin del método main

} // fin de la clase Suma