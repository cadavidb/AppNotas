import java.time.LocalDate;

public class Matricula_estudiante {
   static boolean exito[]=new boolean[1] ;
   static void DatosEstudiante(){
      
        System.out.println("Bienvenido al curso de\n" + sideDocente.nombre[0]);

       System.out.println("Ingresa tu nombre");
        String nameStudent=resources.entrada().nextLine();

        System.out.println("Ingresa tu numero de identificacion");
        String nDocumento=resources.entrada().nextLine();

        System.out.println("Necesito tu fecha de nacimiento");

        System.out.println("Ingresa tu año de nacimiento");
        int year=resources.entrada().nextInt();

        if (nameStudent.length()>2 && fecha(year).length()>5 && nDocumento.length()==10) {
             exito[0]=true;

             sideDocente.estudiantes[0]="NOMBRE: " +
          nameStudent + "\nN°DOCUMENTO: " + (nDocumento) 
          + "\nEDAD: " + (2020-year)+" años\n";

          System.out.println("*****REGISTRO EXITOSO*****");
          sideStudent.estudiante();
     }else{
          System.out.println("#####REGISTRO FALLIDO#####");
        }
        
   
        
    }





    static String fecha(int year){
       System.out.println("Dia de nacimiento");
       int dia=resources.entrada().nextInt();
       System.out.println("Mes de nacimiento");
       int mes=resources.entrada().nextInt();
       String fecha= LocalDate.of(year, mes, dia).toString();
          return fecha;
 }
}
