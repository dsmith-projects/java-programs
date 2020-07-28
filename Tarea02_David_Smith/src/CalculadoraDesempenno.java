// CalculadoraDesempeño.java - David Smith Solano - 5 julio, 2020
// Clase que realiza los cálculos para establecer el desempeño de un empleado en un mes determinado

public class CalculadoraDesempenno { // Clase que realiza los cálculos del desempeño de un empleado en un mes determinado 

    // Variables de instancias de la clase
    private double calificacionFinal;
    private double porcentajePuntualidad;
    private double porcentajeResponsabilidad;
    private double porcentajeIniciativaCreatividad;
    private double porcentajeCompannerismo;
    private String resultadoCualitativo;

    /** 
     * Método constructor de la clase CalculadoraDesempenno
     * Establece los valores por defecto de los atributos de cualquier instancia de clase
     */
    public CalculadoraDesempenno(){
        setCalificacionFinal(0);
        setPorcentajePuntualidad(0);
        setPorcentajeResponsabilidad(0);
        setPorcentajeIniciativaCreatividad(0);
        setPorcentajeCompannerismo(0);
        setResultadoCualitativo("Sin evaluación realizada");
    }

    
    /** 
     * Establece un valor para el atributo de clase
     * @param _calificacionFinal
     */
    private void setCalificacionFinal(double _calificacionFinal){
        calificacionFinal = _calificacionFinal;
    }
    
    
    /** 
     * Establece un valor para el atributo de clase
     * @param _porcentajePuntualidad
     */
    private void setPorcentajePuntualidad(double _porcentajePuntualidad){
        porcentajePuntualidad = _porcentajePuntualidad;
    }
    
    
    /** 
     * Establece un valor para el atributo de clase
     * @param _porcentajeResponsabilidad
     */
    private void setPorcentajeResponsabilidad(double _porcentajeResponsabilidad){
        porcentajeResponsabilidad = _porcentajeResponsabilidad;
    }
    
    
    /** 
     * Establece un valor para el atributo de clase
     * @param _porcentajeIniciativaCreatividad
     */
    private void setPorcentajeIniciativaCreatividad(double _porcentajeIniciativaCreatividad){
        porcentajeIniciativaCreatividad = _porcentajeIniciativaCreatividad;
    }
    
    
    /** 
     * Establece un valor para el atributo de clase
     * @param _porcentajeCompannerismo
     */
    private void setPorcentajeCompannerismo(double _porcentajeCompannerismo){
        porcentajeCompannerismo = _porcentajeCompannerismo;
    }
    
    
    /** 
     * Establece un valor para el atributo de clase
     * @param _resultadoCualitativo
     */
    private void setResultadoCualitativo(String _resultadoCualitativo){
        resultadoCualitativo = _resultadoCualitativo;
    }

    
    /** 
     * Retorna el valor asignado al atributo de clase calificacionFinal
     * @return double
     */
    public double getCalificacionFinal(){
        return calificacionFinal;
    }

    
    /** 
     * Retorna el valor asignado al atributo de clase porcentajePuntualidad
     * @return double
     */
    public double getPorcentajePuntualidad(){
        return porcentajePuntualidad;
    }

    
    /** 
     * Retorna el valor asignado al atributo de clase porcentajeResponsabilidad
     * @return double
     */
    public double getPorcentajeResponsabilidad(){
        return porcentajeResponsabilidad;
    }

    
    /** 
     * Retorna el valor asignado al atributo de clase porcentajeIniciativaCreatividad
     * @return double
     */
    public double getPorcentajeIniciativaCreatividad(){
        return porcentajeIniciativaCreatividad;
    }

    
    /** 
     * Retorna el valor asignado al atributo de clase porcentajeCompannerismo
     * @return double
     */
    public double getPorcentajeCompannerismo(){
        return porcentajeCompannerismo;
    }

    
    /** 
     * Retorna el valor asignado al atributo de clase resultadoCualitativo
     * @return String
     */
    public String getResultadoCualitativo(){
        return resultadoCualitativo;
    }

    
    /** 
     * Método que calcula la puntualidad según 4 tipos de tardías posibles que tienen diferente puntaje
     * @param cantTardiasMenor1Hora
     * @param cantTardiasMenor2Horas
     * @param cantTardiasMenor3Horas
     * @param cantTardiasinjustificadas
     */
    public void calcularPuntualidad(int cantTardiasMenor1Hora, int cantTardiasMenor2Horas, int cantTardiasMenor3Horas, int cantTardiasinjustificadas){
        int totalDiasConTardias = 0;
        double puntosPerdidos = 0;
        
        totalDiasConTardias = cantTardiasMenor1Hora + cantTardiasMenor2Horas + cantTardiasMenor3Horas + cantTardiasinjustificadas;

        if(valorValido(totalDiasConTardias)){
            if(valorValido(cantTardiasMenor1Hora) && valorValido(cantTardiasMenor2Horas) && valorValido(cantTardiasMenor3Horas) && valorValido(cantTardiasinjustificadas)){
                puntosPerdidos = (0.5 * cantTardiasMenor1Hora) + (1.0 * cantTardiasMenor2Horas) + (1.5 * cantTardiasMenor3Horas) + (5.0 * cantTardiasinjustificadas);
                setPorcentajePuntualidad(25.0 - puntosPerdidos);
            }
        }
    }

    
    /** 
     * Método que asigna la nota de responsabilidad después calcular su valor porcentual
     * @param notaResponsabilidad
     */
    public void calcularResponsabilidad(double notaResponsabilidad){
        if(esNotaValida(notaResponsabilidad)){
            setPorcentajeResponsabilidad(calcularPorcentaje(notaResponsabilidad));
        } 
    }

    
    /** 
     * Método que asigna la nota de iniciativa y creatividad después calcular su valor porcentual
     * @param notaIniciativaCreatividad
     */
    public void calcularIniciativaCreatividad(double notaIniciativaCreatividad){
        if(esNotaValida(notaIniciativaCreatividad)){
            setPorcentajeIniciativaCreatividad(calcularPorcentaje(notaIniciativaCreatividad));
        }
    }

    
    /** 
     * Método que calcula la nota de compañerismo después de promediar la nota asignada por varios compañeros(as)
     * @param notaCompannero1
     * @param notaCompannero2
     * @param notaCompannero3
     * @param notaCompannero4
     * @param notaCompannero5
     */
    public void calcularCompannerismo(double notaCompannero1, double notaCompannero2, double notaCompannero3, double notaCompannero4, double notaCompannero5){
        if(esNotaValida(notaCompannero1) && esNotaValida(notaCompannero2) && esNotaValida(notaCompannero3) && esNotaValida(notaCompannero4) && esNotaValida(notaCompannero5)){
            double notaPromedioCompanneros = (notaCompannero1 + notaCompannero2 + notaCompannero3 + notaCompannero4 + notaCompannero5) / 5.0;
            setPorcentajeCompannerismo(calcularPorcentaje(notaPromedioCompanneros));   
        }
    }

    
    /** 
     * Método que reciba una nota en base 100 y calcula su valor en base 25
     * @param nota
     * @return double
     */
    public double calcularPorcentaje(double nota){
        double porcentaje = (25.0 * nota) / 100 ;
        return porcentaje;
    }

    
    /** 
     * Método que verifica si una nota ingresada por el usuario se encuentra dentro del rango esperado
     * @param nota
     * @return boolean
     */
    public boolean esNotaValida(double nota){
        boolean notaValida = false;
        if(nota >= 0 && nota <= 100){
            notaValida = true;
        }
        return notaValida;
    }

    
    /** 
     * Método que verifica si la cantidad de días con tardías ingresada por el usuario se encuentra dentro del rango esperado
     * @param cantidadTardiasPorMes
     * @return boolean
     */
    public boolean valorValido(int cantidadTardiasPorMes){
        boolean esValido = false;
        if(cantidadTardiasPorMes >= 0 && cantidadTardiasPorMes <= 31){
            esValido = true;
        }
        return esValido;
    }

    /** 
     * Método que calcula la calificación final del desempeño del empleado en un mes determinado
     */
    public void calcularCalificacionFinal(){
        double calificacion = getPorcentajePuntualidad() + getPorcentajeResponsabilidad() + 
        getPorcentajeIniciativaCreatividad() + getPorcentajeCompannerismo();
        
        // La calificación no puede ser inferior a 40. De serlo, se asigna la menor calificación, 40.
        if(calificacion < 40){
            calificacion = 40;
        }
        setCalificacionFinal(calificacion);
    }

    /** 
     * Método que establece el resultado cualitativo del desempeño del empleado basado en la nota final
     */
    public void obtenerResultadoCualitativo(){
        
        if(getCalificacionFinal() >= 90){
            setResultadoCualitativo("Excelente");
        }
        if(getCalificacionFinal() >= 80 && getCalificacionFinal() < 90){
            setResultadoCualitativo("Muy bueno");
        }
        if(getCalificacionFinal() >= 70 && getCalificacionFinal() < 80){
            setResultadoCualitativo("Bueno");
        }
        if(getCalificacionFinal() >= 60 && getCalificacionFinal() < 70){
            setResultadoCualitativo("Regular");
        }
        if(getCalificacionFinal() >= 50 && getCalificacionFinal() < 60){
            setResultadoCualitativo("Malo");
        }
        if(getCalificacionFinal() >= 40 && getCalificacionFinal() < 50){
            setResultadoCualitativo("Muy malo");
        }
        if(getCalificacionFinal() < 40){
            setResultadoCualitativo("Sin evaluación realizada");
        }
        
    }
}