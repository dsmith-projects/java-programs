// EjecucionCalculadoraDesempeño.java - David Smith Solano - 5 julio, 2020
// Clase que 'main' que instancia la clase CalculadoraDesempeño y maneja i/o para cálculo del desempeño del empleado
import java.util.InputMismatchException; // Para el manejo de excepciones
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
        
        System.out.println("\nIngrese el número de días con tardías:");

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Menor a 1 hora: ");
                cantTardiasMenor1H = entrada.nextInt();
                if(cantTardiasMenor1H < 0 || cantTardiasMenor1H > 31){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 31. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número de días mayor o igual a 0 y menor o igual a 31. \nExcepción: " + e + "\n");
                cantTardiasMenor1H = -1;
            }
        }while(cantTardiasMenor1H < 0 || cantTardiasMenor1H > 31);
        
        System.out.println("\nIngrese el número de días con tardías:");

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Menor a 2 horas: ");
                cantTardiasMenor2H = entrada.nextInt();
                if(cantTardiasMenor2H < 0 || cantTardiasMenor2H > 31){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 31. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número de días mayor o igual a 0 y menor o igual a 31. \nExcepción: " + e + "\n");
                cantTardiasMenor2H = -1;
            }
        }while(cantTardiasMenor2H < 0 || cantTardiasMenor2H > 31);
        
        System.out.println("\nIngrese el número de días con tardías:");

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Menor a 3 hora: ");
                cantTardiasMenor3H = entrada.nextInt();
                if(cantTardiasMenor3H < 0 || cantTardiasMenor3H > 31){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 31. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número de días mayor o igual a 0 y menor o igual a 31. \nExcepción: " + e + "\n");
                cantTardiasMenor3H = -1;
            }
        }while(cantTardiasMenor3H < 0 || cantTardiasMenor3H > 31);
        
        System.out.println("\nIngrese el número de días con tardías:");

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Injustificadas: ");
                cantTardiasInjustificadas = entrada.nextInt();
                if(cantTardiasInjustificadas < 0 || cantTardiasInjustificadas > 31){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 31. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 31. \nExcepción: " + e + "\n");
                cantTardiasInjustificadas = -1;
            }
        }while(cantTardiasInjustificadas < 0 || cantTardiasInjustificadas > 31);

        // Llamado al método que realiza el cálculo del porcentaje de puntualidad
        calculadoraDesempenno.calcularPuntualidad(cantTardiasMenor1H, cantTardiasMenor2H, cantTardiasMenor3H, cantTardiasInjustificadas);

        // Variables necesarias para calcular el porcentaje de responsabilidad
        double notaResponsabilidad;

        // Output e input de datos para calcular el porcentaje de responsabilidad
        System.out.println("\n\t**** RESPONSABILIDAD ****");
        System.out.println();
 
        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("Ingrese la nota de responsabilidad: ");
                notaResponsabilidad = entrada.nextDouble();
                if(notaResponsabilidad < 0 || notaResponsabilidad > 100){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 100. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 100. \nExcepción: " + e + "\n");
                notaResponsabilidad = -1;
            }
        }while(notaResponsabilidad < 0 || notaResponsabilidad > 100);


        // Llamado al método que realiza el cálculo del porcentaje de responsabilidad
        calculadoraDesempenno.calcularResponsabilidad(notaResponsabilidad);

        // Variables necesarias para calcular el porcentaje de iniciativa y creatividad
        double notaIniciativaCreatividad;

        // Input de datos para calcular el porcentaje de iniciativa y creatividad
        System.out.println("\n\t**** INICIATIVA Y CREATIVIDAD ****");
        System.out.println();

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("Ingrese la nota de iniciativa y creatividad: ");
                notaIniciativaCreatividad = entrada.nextDouble();
                if(notaIniciativaCreatividad < 0 || notaIniciativaCreatividad > 100){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 100. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 100. \nExcepción: " + e + "\n");
                notaIniciativaCreatividad = -1;
            }
        }while(notaIniciativaCreatividad < 0 || notaIniciativaCreatividad > 100);

        // Llamado al método que realiza el cálculo del porcentaje de iniciativa y creatividad
        calculadoraDesempenno.calcularIniciativaCreatividad(notaIniciativaCreatividad);
        
        // Variables necesarias para calcular el porcentaje de compañerismo
        double notaCompannero1, notaCompannero2, notaCompannero3, notaCompannero4, notaCompannero5;

        // Output e input de datos para obtener las notas de las evaluaciones de los 5 compañeros(as)
        System.out.println("\n\t**** COMPAÑERISMO ****");
        System.out.println();
        System.out.println("Ingrese las notas asignadas por los/as compañeros/as:");

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Compañero/a 1: ");
                notaCompannero1 = entrada.nextDouble();
                if(notaCompannero1 < 0 || notaCompannero1 > 100){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 100. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 100. \nExcepción: " + e + "\n");
                notaCompannero1 = -1;
            }
        }while(notaCompannero1 < 0 || notaCompannero1 > 100);

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Compañero/a 2: ");
                notaCompannero2 = entrada.nextDouble();
                if(notaCompannero2 < 0 || notaCompannero2 > 100){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 100. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 100. \nExcepción: " + e + "\n");
                notaCompannero2 = -1;
            }
        }while(notaCompannero2 < 0 || notaCompannero2 > 100);
        
        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Compañero/a 3: ");
                notaCompannero3 = entrada.nextDouble();
                if(notaCompannero3 < 0 || notaCompannero3 > 100){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 100. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 100. \nExcepción: " + e + "\n");
                notaCompannero3 = -1;
            }
        }while(notaCompannero3 < 0 || notaCompannero3 > 100);
        
        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Compañero/a 4: ");
                notaCompannero4 = entrada.nextDouble();
                if(notaCompannero4 < 0 || notaCompannero4 > 100){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 100. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 100. \nExcepción: " + e + "\n");
                notaCompannero4 = -1;
            }
        }while(notaCompannero4 < 0 || notaCompannero4 > 100);
        
        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                System.out.print("\t- Compañero/a 5: ");
                notaCompannero5 = entrada.nextDouble();
                if(notaCompannero5 < 0 || notaCompannero5 > 100){
                    System.out.print("\nEl número no puede ser menor a cero, ni mayor a 100. Intente de nuevo.\n");
                }
            }
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.print("\n¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 100. \nExcepción: " + e + "\n");
                notaCompannero5 = -1;
            }
        }while(notaCompannero5 < 0 || notaCompannero5 > 100);
        
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
