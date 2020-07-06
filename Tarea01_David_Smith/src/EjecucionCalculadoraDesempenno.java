//
//
import java.util.Scanner;

public class EjecucionCalculadoraDesempenno {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        CalculadoraDesempenno calculadoraDesempenno = new CalculadoraDesempenno();
        System.out.println("Hello, World!");

        // Variables necesarias para calcular el porcentaje de puntualidad
        int cantTardiasMenor1H, cantTardiasMenor2H, cantTardiasMenor3H, cantTardiasInjustificadas;
        double porcentajePuntualidad;

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

        // Output del cálculo del porcentaje de puntualidad
        calculadoraDesempenno.calcularPuntualidad(cantTardiasMenor1H, cantTardiasMenor2H, cantTardiasMenor3H, cantTardiasInjustificadas);
        //System.out.printf("Puntualidad: %.2f\n", porcentajePuntualidad);

        // Variables necesarias para calcular el porcentaje de responsabilidad
        double notaResponsabilidad, porcentajeResponsabilidad;

        // Input de datos para calcular el porcentaje de responsabilidad
        System.out.println("\n\t**** RESPONSABILIDAD ****");
        System.out.println();
        System.out.print("Ingrese la nota de responsabilidad: ");
        notaResponsabilidad = entrada.nextDouble();
        

        // Output del cálculo del porcentaje de responsabilidad
        calculadoraDesempenno.calcularResponsabilidad(notaResponsabilidad);
        //System.out.printf("Responsabilidad: %.2f\n", porcentajeResponsabilidad);

        // Variables necesarias para calcular el porcentaje de iniciativa y creatividad
        double notaIniciativaCreatividad, porcentajeIniciativaCreatividad;

        // Input de datos para calcular el porcentaje de iniciativa y creatividad
        System.out.println("\n\t**** INICIATIVA Y CREATIVIDAD ****");
        System.out.println();
        System.out.print("Ingrese la nota de iniciativa y creatividad: ");
        notaIniciativaCreatividad = entrada.nextDouble();
        

        // Output del cálculo del porcentaje de iniciativa y creatividad
        calculadoraDesempenno.calcularIniciativaCreatividad(notaIniciativaCreatividad);
        //System.out.printf("Iniciativa y creatividad: %.2f\n", porcentajeIniciativaCreatividad);
        
        
        // Variables necesarias para calcular el porcentaje de compañerismo
        double notaCompannero1, notaCompannero2, notaCompannero3, notaCompannero4, notaCompannero5;
        double porcentajeCompannerismo;

        // Input de datos para calcular el porcentaje de compañerismo
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

        // Output del cálculo del porcentaje de compañerismo
        calculadoraDesempenno.calcularCompannerismo(notaCompannero1, notaCompannero2, notaCompannero3, notaCompannero4, notaCompannero5);
        //System.out.printf("Compañerismo: %.2f\n", porcentajeCompannerismo);
        
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
        System.out.printf("\n>>>>> Nota Final: %.2f\n>>>> Resultado cualitativo: %s\n", notaFinal, resultadoCualitativo);
        

    }
}
