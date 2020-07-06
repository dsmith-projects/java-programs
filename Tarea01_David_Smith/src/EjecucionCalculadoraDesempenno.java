// EjecucionCalculadoraDesempeño.java - David Smith Solano - 5 julio, 2020
// Clase que 'main' que instancia la clase CalculadoraDesempeño y maneja i/o para cálculo del desempeño del empleado
import java.util.Scanner; // Necesito la clase Scanner para leer input de consola e imprimir en consola

public class EjecucionCalculadoraDesempenno {
    public static void main(final String[] args) throws Exception { // método 'main': punto de partida del program

        // Creo objeto Scanner para leer/escribir y una instancia de la clase CalculadoraDesempenno
        final Scanner entrada = new Scanner(System.in);
        final CalculadoraDesempenno calculadoraDesempenno = new CalculadoraDesempenno();
        System.out.println("\n >>> EVALUACIÓN MENSUAL DEL DESEMPEÑO <<<\n");

        // Variables necesarias para calcular el porcentaje de puntualidad
        int cantTardiasMenor1H, cantTardiasMenor2H, cantTardiasMenor3H, cantTardiasInjustificadas;

        // Input de datos para calcular el porcentaje de puntualidad
        System.out.println("\n\t**** PUNTUALIDAD ****");
        System.out.println();
        System.out.println("Ingrese el número de días con tardías:");
        System.out.print("\t- Menor a 1 hora: ");
        cantTardiasMenor1H = entrada.nextInt();
        System.out.print("\t- Menor a 2 hora: ");
        cantTardiasMenor2H = entrada.nextInt();
        System.out.print("\t- Menor a 3 hora: ");
        cantTardiasMenor3H = entrada.nextInt();
        System.out.print("\t- Injustificadas: ");
        cantTardiasInjustificadas = entrada.nextInt();

        // Llamado al método que realiza el cálculo del porcentaje de puntualidad
        calculadoraDesempenno.calcularPuntualidad(cantTardiasMenor1H, cantTardiasMenor2H, cantTardiasMenor3H, cantTardiasInjustificadas);

        // Variables necesarias para calcular el porcentaje de responsabilidad
        double notaResponsabilidad;

        // Output e input de datos para calcular el porcentaje de responsabilidad
        System.out.println("\n\t**** RESPONSABILIDAD ****");
        System.out.println();
        System.out.print("Ingrese la nota de responsabilidad: ");
        notaResponsabilidad = entrada.nextDouble();

        // Llamado al método que realiza el cálculo del porcentaje de responsabilidad
        calculadoraDesempenno.calcularResponsabilidad(notaResponsabilidad);

        // Variables necesarias para calcular el porcentaje de iniciativa y creatividad
        double notaIniciativaCreatividad;

        // Input de datos para calcular el porcentaje de iniciativa y creatividad
        System.out.println("\n\t**** INICIATIVA Y CREATIVIDAD ****");
        System.out.println();
        System.out.print("Ingrese la nota de iniciativa y creatividad: ");
        notaIniciativaCreatividad = entrada.nextDouble();
        

        // Llamado al método que realiza el cálculo del porcentaje de iniciativa y creatividad
        calculadoraDesempenno.calcularIniciativaCreatividad(notaIniciativaCreatividad);
        
        // Variables necesarias para calcular el porcentaje de compañerismo
        double notaCompannero1, notaCompannero2, notaCompannero3, notaCompannero4, notaCompannero5;

        // Output e input de datos para obtener las notas de las evaluaciones de los 5 compañeros(as)
        System.out.println("\n\t**** COMPAÑERISMO ****");
        System.out.println();
        System.out.println("Ingrese las notas asignadas por los/as compañeros/as:");
        System.out.print("\t- Compañero/a 1: ");
        notaCompannero1 = entrada.nextInt();
        System.out.print("\t- Compañero/a 2: ");
        notaCompannero2 = entrada.nextInt();
        System.out.print("\t- Compañero/a 3: ");
        notaCompannero3 = entrada.nextInt();
        System.out.print("\t- Compañero/a 4: ");
        notaCompannero4 = entrada.nextInt();
        System.out.print("\t- Compañero/a 5: ");
        notaCompannero5 = entrada.nextInt();

        // Llamado al método que realiza el cálculo del porcentaje de compañerismo
        calculadoraDesempenno.calcularCompannerismo(notaCompannero1, notaCompannero2, notaCompannero3, notaCompannero4, notaCompannero5);
        
        // Variables necesarias para mostrar la calificación final
        double notaFinal;
        String resultadoCualitativo = "";
        
        // Cálculo de los porcentaje para obtener la calificación final y almacenamienton en 'notaFinal'
        calculadoraDesempenno.calcularCalificacionFinal();
        notaFinal = calculadoraDesempenno.getCalificacionFinal();
        
        // Obtención del resultado cualitativo y almacenamienton en 'resultadoCualitativo'
        calculadoraDesempenno.obtenerResultadoCualitativo();
        resultadoCualitativo = calculadoraDesempenno.getResultadoCualitativo();
        
        // Impresión en consola de la calificación final y resultado cualitativo del empleado
        System.out.printf("\n>>>> NOTA FINAL: %.2f\n>>>> RESULTADO CUALITATIVO: %s\n\n", notaFinal, resultadoCualitativo);
        
        // Cierra en ingreso de datos para evitar problemas de seguridad
        entrada.close();

    } // fin del main

} // Fin de la clase EjecucionCalculadoraDesempenno
