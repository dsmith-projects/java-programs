// Suma.java - David Smith - 28 junio, 2020  - tomado de Deitel
// Programa que muestra la suma de dos enteros y usa JOptionPane

import javax.swing.JOptionPane;

public class Suma 
{
    // el método main empieza la ejecución de la aplicación en Java
    public static void main (String[] args)
    {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        //Scanner entrada = new Scanner(System.in);

        int numero1; // primer número a sumar
        int numero2; // segundo número a sumar
        int suma; // suma de número 1 y número 2

        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el primer número entero:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el segundo número entero:"));
        
        suma = numero1 + numero2;

        String mensaje = String.format("La suma es %d\n", suma);
        JOptionPane.showMessageDialog(null, mensaje); // muestra la suma

    } // fin del método main

} // fin de la clase Suma