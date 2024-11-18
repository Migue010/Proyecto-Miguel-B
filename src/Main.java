import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        AreaBanda AB = new AreaBanda();
        AreaCuerdasPulsadas AP = new AreaCuerdasPulsadas();
        AreaCuerdasFrotadas AF = new AreaCuerdasFrotadas();
        List<AreaBanda> lstBanda = new ArrayList<AreaBanda>();
        List<AreaCuerdasPulsadas> lstCuerdas = new ArrayList<AreaCuerdasPulsadas>();
        List<AreaCuerdasFrotadas> lstFrotadas = new ArrayList<AreaCuerdasFrotadas>();

        int opc = 0;


        while (opc!=5) {

            System.out.println("BIENVENIDO A LA ESCUELA DE FORMACION MUSICAL DE GUATAVITA CUNDINAMARCA");
            System.out.println("Menu\n 1)-Inscripcion Area Banda Sinfonica \n 2)-Inscripcion Area Cuerdas Pulsadas \n 3)-Inscripcion Area cuerdas Frotadas \n 4)-Informacion Estudiantes inscritos \n 5)-Salir de la Plataforma de Inscripciones");

            opc = teclado.nextInt();

            switch (opc) {

                case 1:

                    System.out.println("Ingresa el Nombre del instrumento");
                    AB.setNombreInstrumento(teclado.next());

                    System.out.println("Ingresa el nombre del estudiante a inscribir");
                    AB.setNombreEstudiante(teclado.next());
                   // AB.setNombreEstudiante(teclado.nextLine());

                    System.out.println("Ingresa la edad del Estudiante");
                    AB.setEdad(teclado.nextInt());

                    System.out.println("Ingresa el nombre del director de la Agrupacion");
                    AB.setDirectorAgrupacion(teclado.next());

                    System.out.println("Ingresa el tipo de Banda Sinfonica  al cual pertenece el estudiante Banda infantil o Banda Mayores ");
                    AB.setTipoBanda(teclado.next());
                    AB.setTipoBanda(teclado.nextLine());

                    lstBanda.add(new AreaBanda(AB.getNombreInstrumento(),AB.getNombreEstudiante(),AB.getEdad(),AB.getDirectorAgrupacion(),AB.getTipoBanda()));

                   if(AB.getTipoBanda().equals("Banda Mayores")){
                       System.out.println("Los Horarios area Banda Mayores es:"+ Horarios.AreaBandaMayores.toString());
                   }else {
                       System.out.println("Los Horarios  Area Banda Infantil es:"+ Horarios.AreaBandaInfantil.toString());
                   }

                   AB.mostrarInfo();

                    System.out.println("Estudiante Inscrito correctamente");

                    break;

                case 2:

                    System.out.println("Ingresa el Nombre del instrumento");
                    AP.setNombreInstrumento(teclado.next());

                    System.out.println("Ingresa el nombre del estudiante a inscribir");
                    AP.setNombreEstudiante(teclado.next());
                    //AP.setNombreEstudiante(teclado.nextLine());

                    System.out.println("Ingresa la edad del Estudiante");
                    AP.setEdad(teclado.nextInt());

                    System.out.println("Ingresa el nombre del director de la Agrupacion");
                    AP.setDirectorAgrupacion(teclado.next());

                    System.out.println("Ingresa el nombre al grupo que perteneces");
                    AP.setGrupo(teclado.next());

                    lstCuerdas.add(new AreaCuerdasPulsadas(AP.getNombreInstrumento(), AP.getNombreEstudiante(), AP.getEdad(), AP.getDirectorAgrupacion(), AP.getGrupo()));

                    System.out.println("Los Horarios area cuerdas pulsadas son:"+Horarios.AreaCuerdasPulsadas.toString());
                    AP.mostrarInfo();

                    System.out.println("Estudiante Inscrito correctamente");

                    break;

                case 3:

                    System.out.println("Ingresa el Nombre del instrumento");
                    AF.setNombreInstrumento(teclado.next());

                    System.out.println("Ingresa el nombre del estudiante a inscribir");
                    AF.setNombreEstudiante(teclado.next());

                    System.out.println("Ingresa la edad del Estudiante");
                    AF.setEdad(teclado.nextInt());

                    System.out.println("Ingresa el nombre del director de la Agrupacion");
                    AF.setDirectorAgrupacion(teclado.next());

                    System.out.println("Ingresa el tamaño del instrumento");
                    AF.setTamañoInstrumento(teclado.nextInt());

                    lstFrotadas.add(new AreaCuerdasFrotadas(AF.getNombreInstrumento(),AF.getNombreEstudiante(),AF.getEdad(),AF.getTamañoInstrumento(),AF.getDirectorAgrupacion()));

                    System.out.println("Los Horarios area cuerdas pulsadas son:"+Horarios.AreaCuerdasPulsadas.toString());
                    AF.mostrarInfo();
                    System.out.println("Estudiante Inscrito correctamente");

                    break;


                case 4:

                    System.out.println("Ingresa el Nombre del estudiante que deseas buscar");
                    String verificar= teclado.next();

                    for(int i=0; i<lstBanda.size(); i++){
                        if (lstBanda.get(i).getNombreEstudiante().equals(verificar)){
                            lstBanda.get(i).mostrarInfo();
                            System.out.println("El estudiante se encuentra inscrito");
                        }
                    }

                    for(int i=0; i<lstCuerdas.size();i++){
                        if(lstCuerdas.get(i).getNombreEstudiante().equals(verificar)){
                            lstCuerdas.get(i).mostrarInfo();
                            System.out.println("El estudiante se encuentra inscrito");
                        }
                    }


                    for (int i=0; i<lstFrotadas.size();i++){
                        if(lstFrotadas.get(i).getNombreEstudiante().equals(verificar)){
                            lstFrotadas.get(i).mostrarInfo();
                            System.out.println("El estudiante se encuentra inscrito");
                        }
                    }

                    break;

            }
        }
    }
}