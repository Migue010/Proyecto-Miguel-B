public enum Horarios {
    AreaBandaInfantil("Miercoles, Viernes ,Sabado","5:30 Pm","7:00 Pm","Ensayo General Banda Infantil"),
    AreaCuerdasPulsadas("Lunes,Jueves","3:00 Pm","4:00 Pm","Ensayo por tipo de Instrumento"),
    AreaCuerdasFrotadas("Martes,Jueves","5:00 Pm","6:00","Ensayo Grupo Infantil"),
    AreaBandaMayores("Viernes","7:00Pm","9:00 Pm","Ensayo General");

    private String Dia;
    private String HoraInicio;
    private String HoraFin;
    private String TipoDeEnsayo;

    Horarios(String dia, String horaInicio, String horaFin, String tipoDeEnsayo) {
        Dia = dia;
        HoraInicio = horaInicio;
        HoraFin = horaFin;
        TipoDeEnsayo = tipoDeEnsayo;
    }

    @Override
    public String toString() {
        return "Horarios{" +
                "Dia='" + Dia + '\'' +
                ", HoraInicio='" + HoraInicio + '\'' +
                ", HoraFin='" + HoraFin + '\'' +
                ", TipoDeEnsayo='" + TipoDeEnsayo + '\'' +
                '}';
    }
}
