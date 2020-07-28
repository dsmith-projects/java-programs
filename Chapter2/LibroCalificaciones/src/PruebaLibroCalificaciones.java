//import java.util.Scanner;

// PruebaLibroCalificaciones.java - David Smith - 5 julio, 2020 - Tomado de Deitel
// Crea un objeto LibroCalificaciones y llama a su método mostrarMensaje

public class PruebaLibroCalificaciones {
    
    // Método main
    public static void main(String[] args)
    {
        
        // Objeto Scanner
        //Scanner entrada = new Scanner(System.in);
        LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones("CS101 Introducción a la programación en Java");
        LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones("CS102 Estructura de datos en Java");

        // Muestra el valor inicial del nombre del curso
        System.out.printf("El nombre del curso de libroCalificaciones1 es: %s\n", libroCalificaciones1.obtenerNombreDelCurso());
        System.out.printf("El nombre del curso de libroCalificaciones2 es: %s\n", libroCalificaciones2.obtenerNombreDelCurso());

        //System.out.println("Escriba el nombre del curso: ");
        //String elNombre = entrada.nextLine(); // lee una línea de texto
        //miLibroCalificaciones.establecerNombreDelCurso(elNombre);

        //System.out.println();
        
        // muestra mensaje de bienvenida
       // miLibroCalificaciones.mostrarMensaje();
    } // fin del main
} // fin de la clase
