public class AreaCuerdasFrotadas extends Areas {

    private int tamañoInstrumento;
    private  String DirectorAgrupacion;


    public AreaCuerdasFrotadas() {
    }

    public AreaCuerdasFrotadas(String nombreInstrumento, String nombreEstudiante, int edad, int tamañoInstrumento, String directorAgrupacion) {
        super(nombreInstrumento, nombreEstudiante, edad);
        this.tamañoInstrumento = tamañoInstrumento;
        DirectorAgrupacion = directorAgrupacion;
    }

    public int getTamañoInstrumento() {
        return tamañoInstrumento;
    }

    public void setTamañoInstrumento(int tamañoInstrumento) {
        this.tamañoInstrumento = tamañoInstrumento;
    }

    public String getDirectorAgrupacion() {
        return DirectorAgrupacion;
    }

    public void setDirectorAgrupacion(String directorAgrupacion) {
        DirectorAgrupacion = directorAgrupacion;
    }


    public void mostrarInfo(){
        System.out.println("Nombre del Instrumento: "+ NombreInstrumento +" Nombre del Estudiante: "+ NombreEstudiante +" Edad Del Estudiante: "+ edad +" Tamaño del Instrumento: "+ tamañoInstrumento +" Director de la Agrupacion: "+ DirectorAgrupacion);
    }
}
