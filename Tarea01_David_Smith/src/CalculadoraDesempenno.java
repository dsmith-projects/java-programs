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

    // Método constructor de la clase CalculadoraDesempenno
    public CalculadoraDesempenno(){
        setCalificacionFinal(0);
        setPorcentajePuntualidad(0);
        setPorcentajeResponsabilidad(0);
        setPorcentajeIniciativaCreatividad(0);
        setPorcentajeCompannerismo(0);
        setResultadoCualitativo("Sin evaluación realizada");
    }
    
    private void setCalificacionFinal(double _calificacionFinal){
        calificacionFinal = _calificacionFinal;
    }
    
    private void setPorcentajePuntualidad(double _porcentajePuntualidad){
        porcentajePuntualidad = _porcentajePuntualidad;
    }
    
    private void setPorcentajeResponsabilidad(double _porcentajeResponsabilidad){
        porcentajeResponsabilidad = _porcentajeResponsabilidad;
    }
    
    private void setPorcentajeIniciativaCreatividad(double _porcentajeIniciativaCreatividad){
        porcentajeIniciativaCreatividad = _porcentajeIniciativaCreatividad;
    }
    
    private void setPorcentajeCompannerismo(double _porcentajeCompannerismo){
        porcentajeCompannerismo = _porcentajeCompannerismo;
    }
    
    private void setResultadoCualitativo(String _resultadoCualitativo){
        resultadoCualitativo = _resultadoCualitativo;
    }

    public double getCalificacionFinal(){
        return calificacionFinal;
    }

    public double getPorcentajePuntualidad(){
        return porcentajePuntualidad;
    }

    public double getPorcentajeResponsabilidad(){
        return porcentajeResponsabilidad;
    }

    public double getPorcentajeIniciativaCreatividad(){
        return porcentajeIniciativaCreatividad;
    }

    public double getPorcentajeCompannerismo(){
        return porcentajeCompannerismo;
    }

    public String getResultadoCualitativo(){
        return resultadoCualitativo;
    }

    public void calcularPuntualidad(int cantTardiasMenor1Hora, int cantTardiasMenor2Horas, int cantTardiasMenor3Horas, int cantTardiasinjustificadas){
        int totalDiasConTardias = 0;
        double puntosPerdidos = 0;
        
        totalDiasConTardias = cantTardiasMenor1Hora + cantTardiasMenor2Horas + cantTardiasMenor3Horas + cantTardiasinjustificadas;

        if(valorValido(totalDiasConTardias)){
            if(valorValido(cantTardiasMenor1Hora) && valorValido(cantTardiasMenor2Horas) && valorValido(cantTardiasMenor3Horas) && valorValido(cantTardiasinjustificadas)){
                puntosPerdidos = (0.5 * cantTardiasMenor1Hora) + (1.0 * cantTardiasMenor2Horas) + (1.5 * cantTardiasMenor3Horas) + (5.0 * cantTardiasinjustificadas);
            }
        }
        
        setPorcentajePuntualidad(25.0 - puntosPerdidos);
    }

    public void calcularResponsabilidad(double notaResponsabilidad){
        if(esNotaValida(notaResponsabilidad)){
            setPorcentajeResponsabilidad(calcularPorcentaje(notaResponsabilidad));
        } 
    }

    public void calcularIniciativaCreatividad(double notaIniciativaCreatividad){
        if(esNotaValida(notaIniciativaCreatividad)){
            setPorcentajeIniciativaCreatividad(calcularPorcentaje(notaIniciativaCreatividad));
        }
    }

    public void calcularCompannerismo(double notaCompannero1, double notaCompannero2, double notaCompannero3, double notaCompannero4, double notaCompannero5){
        if(esNotaValida(notaCompannero1) && esNotaValida(notaCompannero2) && esNotaValida(notaCompannero3) && esNotaValida(notaCompannero4) && esNotaValida(notaCompannero5)){
            double notaPromedioCompanneros = (notaCompannero1 + notaCompannero2 + notaCompannero3 + notaCompannero4 + notaCompannero5) / 5.0;
            setPorcentajeCompannerismo(calcularPorcentaje(notaPromedioCompanneros));   
        }
    }

    public double calcularPorcentaje(double nota){
        double porcentaje = (25.0 * nota) / 100 ;
        return porcentaje;
    }

    public boolean esNotaValida(double nota){
        boolean notaValida = false;
        if(nota >= 0 && nota <= 100){
            notaValida = true;
        }
        return notaValida;
    }

    public boolean valorValido(int cantidadTardiasPorMes){
        boolean esValido = false;
        if(cantidadTardiasPorMes >= 0 && cantidadTardiasPorMes <= 31){
            esValido = true;
        }
        return esValido;
    }

    public void calcularCalificacionFinal(){
        double calificacion = getPorcentajePuntualidad() + getPorcentajeResponsabilidad() + 
        getPorcentajeIniciativaCreatividad() + getPorcentajeCompannerismo();
        
        // La calificación no puede ser inferior a 40. De serlo, se asigna la menor calificación, 40.
        if(calificacion < 40){
            calificacion = 40;
        }
        setCalificacionFinal(calificacion);
    }

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