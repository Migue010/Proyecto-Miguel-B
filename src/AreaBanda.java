public class AreaBanda extends Areas{
    private String DirectorAgrupacion;
    private String TipoBanda;

    public AreaBanda() {

    }

    public AreaBanda(String nombreInstrumento, String nombreEstudiante, int edad, String directorAgrupacion, String tipoBanda) {
        super(nombreInstrumento, nombreEstudiante, edad);
        DirectorAgrupacion = directorAgrupacion;
        TipoBanda = tipoBanda;
    }

    public AreaBanda(String directorAgrupacion, String tipoBanda) {
        DirectorAgrupacion = directorAgrupacion;
        TipoBanda = tipoBanda;
    }

    public String getDirectorAgrupacion() {
        return DirectorAgrupacion;
    }

    public void setDirectorAgrupacion(String directorAgrupacion) {
        DirectorAgrupacion = directorAgrupacion;
    }

    public String getTipoBanda() {
        return TipoBanda;
    }

    public void setTipoBanda(String tipoBanda) {
        TipoBanda = tipoBanda;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del instrumento: "+ NombreInstrumento +" Nombre del Estudiante: "+ NombreEstudiante +" Edad del Estudiante: "+ edad +" Años "+ "Nombre del Director de la Agrupacion: "+ DirectorAgrupacion +" Banda Infantil/Mayores: "+ TipoBanda);
    }
}
