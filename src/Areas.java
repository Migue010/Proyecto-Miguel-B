abstract class Areas {
    protected String NombreInstrumento;
    protected String NombreEstudiante;
    protected int edad;

    public Areas() {
    }

    public Areas(String nombreInstrumento, String nombreEstudiante, int edad) {
        this.NombreInstrumento =nombreInstrumento;
        this.NombreEstudiante = nombreEstudiante;
        this.edad = edad;
    }

    public String getNombreInstrumento() {
        return NombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        NombreInstrumento = nombreInstrumento;
    }

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        NombreEstudiante = nombreEstudiante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del Instrumento"+NombreInstrumento + "Nombre del Estudiante"+ NombreEstudiante+"Edad del Estudiante"+edad);
    }
}
