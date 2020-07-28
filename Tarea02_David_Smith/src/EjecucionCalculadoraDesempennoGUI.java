// EjecucionCalculadoraDesempeño.java - David Smith Solano - 5 julio, 2020
// Clase que 'main' que instancia la clase CalculadoraDesempeño y maneja i/o para cálculo del desempeño del empleado
import java.util.InputMismatchException; // Para el manejo de excepciones
import javax.swing.JOptionPane; // Necesito la clase JOptionPane para leer input del usuario y mostrar mensajes

public class EjecucionCalculadoraDesempennoGUI {
    public static void main(final String[] args) throws Exception { // método 'main': punto de partida del program

        // Creo una instancia de la clase CalculadoraDesempenno
        final CalculadoraDesempenno calculadoraDesempenno = new CalculadoraDesempenno();
        
        String tituloInicial = "Evaluación Mensual del Desempeño";
        String mensajeInicial = "\n" + tituloInicial + ":\n";
        mensajeInicial += "\nRubros a evaluar:\n\n";
        mensajeInicial += "1. PUNTUALIDAD (25%)\n";
        mensajeInicial += "2. RESPONSABILIDAD (25%)\n";
        mensajeInicial += "3. INICIATIVA Y CREATIVIDAD (25%)\n";
        mensajeInicial += "4. COMPAÑERISMO (25%)";

        JOptionPane.showMessageDialog(null, mensajeInicial, tituloInicial, JOptionPane.PLAIN_MESSAGE);

        // Variables necesarias para calcular el porcentaje de puntualidad
        int cantTardiasMenor1H, cantTardiasMenor2H, cantTardiasMenor3H, cantTardiasInjustificadas;

        // Input de datos para calcular el porcentaje de puntualidad
        String tituloPuntualidad = "1. Puntualidad\n";
        String mensajePuntualidad = "PUNTUALIDAD:";
        mensajePuntualidad += "\n\nLa puntualidad representa el 25% de la calificación final en donde el empleado se le penaliza bajo los siguientes criterios:\n\n";
        mensajePuntualidad += "• 0.5 puntos por cada día que llegó tarde por menos de 1 hora.\n";
        mensajePuntualidad += "• 1 punto por cada día que llegó tarde por menos de 2 horas.\n";
        mensajePuntualidad += "• 1.5 puntos por cada día que llegó tarde por menos de 3 horas.\n";
        mensajePuntualidad += "• 5 puntos por cada ausencia injustificada";
        JOptionPane.showMessageDialog(null, mensajePuntualidad, tituloPuntualidad, JOptionPane.PLAIN_MESSAGE);

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        String mensajeAlertaRangoValidoDias = "El número no puede ser menor a cero, ni mayor a 31. Intente de nuevo.\n";
        String entradaInvalida = "¡Entrada inválida! Ingrese un número de días mayor o igual a 0 y menor o igual a 31. \nExcepción: ";
        String mensajeIngreseNumeroDias = "\n\nIngrese el número de días con tardías:";
        String mensajeMenor1Hora = mensajeIngreseNumeroDias + "\n\nMenor a 1 hora: ";

        do{
            try{
                cantTardiasMenor1H = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeMenor1Hora, tituloPuntualidad, JOptionPane.QUESTION_MESSAGE));
                if(cantTardiasMenor1H < 0 || cantTardiasMenor1H > 31){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoDias, tituloPuntualidad, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, entradaInvalida + e + "\n", tituloPuntualidad, JOptionPane.ERROR_MESSAGE);
                cantTardiasMenor1H = -1;
            }
        }while(cantTardiasMenor1H < 0 || cantTardiasMenor1H > 31);
        
        String mensajeMenor2Hora = mensajeIngreseNumeroDias + "\n\nMenor a 2 horas: ";

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                cantTardiasMenor2H = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeMenor2Hora, tituloPuntualidad, JOptionPane.QUESTION_MESSAGE));
                if(cantTardiasMenor2H < 0 || cantTardiasMenor2H > 31){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoDias, tituloPuntualidad, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, entradaInvalida + e + "\n", tituloPuntualidad, JOptionPane.ERROR_MESSAGE);
                cantTardiasMenor2H = -1;
            }
        }while(cantTardiasMenor2H < 0 || cantTardiasMenor2H > 31);
        
        String mensajeMenor3Hora = mensajeIngreseNumeroDias + "\n\nMenor a 3 horas: ";

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                cantTardiasMenor3H = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeMenor3Hora, tituloPuntualidad, JOptionPane.QUESTION_MESSAGE));
                if(cantTardiasMenor3H < 0 || cantTardiasMenor3H > 31){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoDias, tituloPuntualidad, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, entradaInvalida + e + "\n", tituloPuntualidad, JOptionPane.ERROR_MESSAGE);
                cantTardiasMenor3H = -1;
            }
        }while(cantTardiasMenor3H < 0 || cantTardiasMenor3H > 31);
        
        String mensajeInjustificadas = mensajeIngreseNumeroDias + "\n\nInjustificadas: ";

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                cantTardiasInjustificadas = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeInjustificadas, tituloPuntualidad, JOptionPane.QUESTION_MESSAGE));
                if(cantTardiasInjustificadas < 0 || cantTardiasInjustificadas > 31){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoDias, tituloPuntualidad, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, entradaInvalida + e + "\n", tituloPuntualidad, JOptionPane.ERROR_MESSAGE);
                cantTardiasInjustificadas = -1;
            }
        }while(cantTardiasInjustificadas < 0 || cantTardiasInjustificadas > 31);

        // Llamado al método que realiza el cálculo del porcentaje de puntualidad
        calculadoraDesempenno.calcularPuntualidad(cantTardiasMenor1H, cantTardiasMenor2H, cantTardiasMenor3H, cantTardiasInjustificadas);

        // Variables necesarias para calcular el porcentaje de responsabilidad
        double notaResponsabilidad;

        // Mensaje de alerta cuando la nota ingresada no está en un rango entre 0 y 100
        String mensajeAlertaRangoValidoNotas = "El número no puede ser menor a cero, ni mayor a 100. Intente de nuevo.\n";
        String notaInvalida = "¡Entrada inválida! Ingrese un número entero mayor o igual a 0 y menor o igual a 100. \nExcepción: ";
        
        // Output e input de datos para calcular el porcentaje de responsabilidad
        String tituloResponsabilidad = "2. Responsabilidad\n";
        String mensajeResponsabilidad = "RESPONSABILIDAD:";
        mensajeResponsabilidad += "\n\nLa responsabilidad representa el 25% de la calificación final en donde el jefe registra una nota de 0 a 100 y sobre esta se calcula el porcentaje obtenido:\n\n";
        JOptionPane.showMessageDialog(null, mensajeResponsabilidad, tituloResponsabilidad, JOptionPane.PLAIN_MESSAGE);

 
        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        String mensajeIngreseNotaResponsabilidad = "Ingrese la nota de responsabilidad: ";
        do{
            try{
                notaResponsabilidad = Double.parseDouble(JOptionPane.showInputDialog(null, mensajeIngreseNotaResponsabilidad, tituloResponsabilidad, JOptionPane.QUESTION_MESSAGE));
                if(notaResponsabilidad < 0 || notaResponsabilidad > 100){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoNotas, tituloPuntualidad, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, notaInvalida + e + "\n", tituloResponsabilidad, JOptionPane.ERROR_MESSAGE);
                notaResponsabilidad = -1;
            }
        }while(notaResponsabilidad < 0 || notaResponsabilidad > 100);


        // Llamado al método que realiza el cálculo del porcentaje de responsabilidad
        calculadoraDesempenno.calcularResponsabilidad(notaResponsabilidad);

        // Variables necesarias para calcular el porcentaje de iniciativa y creatividad
        double notaIniciativaCreatividad;

        // Input de datos para calcular el porcentaje de iniciativa y creatividad
        String tituloIniciativaCreatividad = "3. Iniciativa y Creatividad\n";
        String mensajeIniciativaCreatividad = "INICIATIVA Y CREATIVIDAD:";
        mensajeIniciativaCreatividad += "\n\nLa iniciativa  y  creatividad representa  el  25%  de  la  calificación  final  en  donde  el  jefe registra una nota de 0 a 100 y sobre esta se calcula el porcentaje obtenido:\n\n";
        JOptionPane.showMessageDialog(null, mensajeIniciativaCreatividad, tituloIniciativaCreatividad, JOptionPane.PLAIN_MESSAGE);
        

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        String mensajeIngreseNotaIniciativaCreatividad = "Ingrese la nota de iniciativa y creatividad: ";
        do{
            try{
                notaIniciativaCreatividad = Double.parseDouble(JOptionPane.showInputDialog(null, mensajeIngreseNotaIniciativaCreatividad, tituloIniciativaCreatividad, JOptionPane.QUESTION_MESSAGE));
                if(notaIniciativaCreatividad < 0 || notaIniciativaCreatividad > 100){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoNotas, tituloIniciativaCreatividad, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, notaInvalida + e + "\n", tituloIniciativaCreatividad, JOptionPane.ERROR_MESSAGE);
                notaIniciativaCreatividad = -1;
            }
        }while(notaIniciativaCreatividad < 0 || notaIniciativaCreatividad > 100);

        // Llamado al método que realiza el cálculo del porcentaje de iniciativa y creatividad
        calculadoraDesempenno.calcularIniciativaCreatividad(notaIniciativaCreatividad);
        
        // Variables necesarias para calcular el porcentaje de compañerismo
        double notaCompannero1, notaCompannero2, notaCompannero3, notaCompannero4, notaCompannero5;

        // Output e input de datos para obtener las notas de las evaluaciones de los 5 compañeros(as)
        String tituloCompannerismo = "4. Compañerismo\n";
        String mensajeCompannerismo = "COMPAÑERISMO:";
        mensajeCompannerismo += "\n\nEl  compañerismorepresenta  el  25%  de  la  calificación  final  en  donde  5 compañerosregistra una nota de 0 a 100evaluando el compañerismo del empleado a evaluar, sobre estasse calcula el promedio y con base al resultado se calcula el porcentaje obtenido:\n\n";
        JOptionPane.showMessageDialog(null, mensajeCompannerismo, tituloCompannerismo, JOptionPane.PLAIN_MESSAGE);
        

        String mensajeIngreseNotasCompanneros = "\n\nIngrese las notas asignadas por los/as compañeros/as:";
        String mensajeCompannero1 = mensajeIngreseNotasCompanneros + "\n\nCompañero/a 1:";
        String mensajeCompannero2 = mensajeIngreseNotasCompanneros + "\n\nCompañero/a 2:";
        String mensajeCompannero3 = mensajeIngreseNotasCompanneros + "\n\nCompañero/a 3:";
        String mensajeCompannero4 = mensajeIngreseNotasCompanneros + "\n\nCompañero/a 4:";
        String mensajeCompannero5 = mensajeIngreseNotasCompanneros + "\n\nCompañero/a 5:";

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                notaCompannero1 = Double.parseDouble(JOptionPane.showInputDialog(null, mensajeCompannero1, tituloCompannerismo, JOptionPane.QUESTION_MESSAGE));
                if(notaCompannero1 < 0 || notaCompannero1 > 100){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoNotas, tituloCompannerismo, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, notaInvalida + e + "\n", tituloCompannerismo, JOptionPane.ERROR_MESSAGE);
                notaCompannero1 = -1;
            }
        }while(notaCompannero1 < 0 || notaCompannero1 > 100);

        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                notaCompannero2 = Double.parseDouble(JOptionPane.showInputDialog(null, mensajeCompannero2, tituloCompannerismo, JOptionPane.QUESTION_MESSAGE));
                if(notaCompannero2 < 0 || notaCompannero2 > 100){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoNotas, tituloCompannerismo, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, notaInvalida + e + "\n", tituloCompannerismo, JOptionPane.ERROR_MESSAGE);
                notaCompannero2 = -1;
            }
        }while(notaCompannero2 < 0 || notaCompannero2 > 100);
        
        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                notaCompannero3 = Double.parseDouble(JOptionPane.showInputDialog(null, mensajeCompannero3, tituloCompannerismo, JOptionPane.QUESTION_MESSAGE));
                if(notaCompannero3 < 0 || notaCompannero3 > 100){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoNotas, tituloCompannerismo, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, notaInvalida + e + "\n", tituloCompannerismo, JOptionPane.ERROR_MESSAGE);
                notaCompannero3 = -1;
            }
        }while(notaCompannero3 < 0 || notaCompannero3 > 100);
        
        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                notaCompannero4 = Double.parseDouble(JOptionPane.showInputDialog(null, mensajeCompannero4, tituloCompannerismo, JOptionPane.QUESTION_MESSAGE));
                if(notaCompannero4 < 0 || notaCompannero4 > 100){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoNotas, tituloCompannerismo, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, notaInvalida + e + "\n", tituloCompannerismo, JOptionPane.ERROR_MESSAGE);
                notaCompannero4 = -1;
            }
        }while(notaCompannero4 < 0 || notaCompannero4 > 100);
        
        // Bloque de ciclo y manejo de excepción para obtener el input correcto del usuario
        do{
            try{
                notaCompannero5 = Double.parseDouble(JOptionPane.showInputDialog(null, mensajeCompannero5, tituloCompannerismo, JOptionPane.QUESTION_MESSAGE));
                if(notaCompannero5 < 0 || notaCompannero5 > 100){
                    JOptionPane.showMessageDialog(null, mensajeAlertaRangoValidoNotas, tituloCompannerismo, JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, notaInvalida + e + "\n", tituloCompannerismo, JOptionPane.ERROR_MESSAGE);
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
        String tituloResultadoEvaluacion = "Resultado Evaluación del Desempeño";
        String resultadoFinal = String.format("\n>>>> NOTA FINAL: %.2f\n>>>> RESULTADO CUALITATIVO: %s\n\n", notaFinal, resultadoCualitativo);
        JOptionPane.showMessageDialog(null, resultadoFinal, tituloResultadoEvaluacion, JOptionPane.INFORMATION_MESSAGE);

    } // fin del main

} // Fin de la clase EjecucionCalculadoraDesempenno
