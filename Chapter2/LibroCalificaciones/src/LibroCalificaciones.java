// LibroCalificaciones.java - David Smith - 5 julio, 2020 - Tomado de Deitel
// Ejemplo clase con un método

public class LibroCalificaciones 
{
    private String nombreDelCurso;

    public LibroCalificaciones(String nombre){
        nombreDelCurso = nombre;
    }

    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre;
    }

    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }

    public void mostrarMensaje()
    {
        System.out.printf("Bienvenid@ al libro de calificaciones para \n%s!\n", obtenerNombreDelCurso());
    }
    
}