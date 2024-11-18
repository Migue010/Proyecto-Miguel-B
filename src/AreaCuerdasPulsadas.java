public class AreaCuerdasPulsadas extends Areas{
    private String DirectorAgrupacion;
    private String Grupo;


    public AreaCuerdasPulsadas() {
    }

    public AreaCuerdasPulsadas(String nombreInstrumento, String nombreEstudiante, int edad, String directorAgrupacion, String grupo) {
        super(nombreInstrumento, nombreEstudiante, edad);
        DirectorAgrupacion = directorAgrupacion;
        Grupo = grupo;
    }

    public String getDirectorAgrupacion() {
        return DirectorAgrupacion;
    }

    public void setDirectorAgrupacion(String directorAgrupacion) {
        DirectorAgrupacion = directorAgrupacion;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del Instrumento:  "+ NombreInstrumento +" Nombre del Estudiante: "+ NombreEstudiante +" Edad del Estudiante: "+ edad +" Nombre del Director de la Agrupacion: "+ DirectorAgrupacion +" Grupo al que pertenece: "+ Grupo);
    }
}
