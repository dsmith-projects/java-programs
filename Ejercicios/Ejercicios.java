// Ejercicios.java - David Smith - 29 de junio, 2020
// Ejercicios del capítulo 1, página 40-42
import java.util.Scanner; 

public class Ejercicios
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3, suma, resta, producto, division, promedio, menor, mayor;
        
        // Ejercicio 1.15
        System.out.print("Escriba el primer número: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número: ");
        num2 = entrada.nextInt();

        System.out.print("Escriba el tercer número: ");
        num3 = entrada.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division  = num1 / num2;
        promedio = (num1 + num2 + num3) / 3;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Cociente: " + division);

        // Ejercicio 1.16
        if (num1 > num2)
        System.out.printf("%d es más grande\n", num1);

        if (num1 == num2)
        System.out.println("Estos números son iguals");

        // Ejercicio 1.17
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Producto: " + producto);
        
        if (num1 < num2){
            if (num1 < num3){
                if (num2 < num3){
                    menor = num1;
                    mayor = num3;
                }else{
                    mayor = num2;
                    menor = num1;
                }
            }else{
                mayor = num2;
                menor = num3;
            }
        }else{
            if (num2 < num3){
                if (num1 < num3){
                    menor = num2;
                    mayor = num3;
                }else{
                    menor = num2;
                    mayor = num1;
                }
            }else{
                menor = num3;
                mayor = num1;
                
            }
        }

        System.out.printf("%d es el menor\n", menor);
        System.out.printf("%d es el mayor\n", mayor);
        
    }
}