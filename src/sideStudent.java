import org.w3c.dom.Text;

public class sideStudent {


   static void estudiante(){
      

        while (true) {  

           System.out.println(bienvenida());
            
            int eleccion_estudiante=resources.entrada().nextInt();
           
            if (eleccion_estudiante==5){System.exit(0);}

            if (eleccion_estudiante==3){verdatos();}

            else if (eleccion_estudiante==1){
            
            if (sideDocente.nombre[0]!=null) {Matricula_estudiante.DatosEstudiante();}

            else{
               System.out.println("no hay curso para matricularse");
               resources.bienvenida();}

            }else if(eleccion_estudiante==4){resources.bienvenida();}

            else if(eleccion_estudiante==2){System.out.println("Curso: "+sideDocente.nombre[0]+"\nCupo disponibles: "+sideDocente.cupo[0]);}
      }
   }

   static void verdatos() {
      System.out.println(sideDocente.estudiantes[0]);
    }
    static String bienvenida(){
       String text="Bienvenido estudiante? \n \n1). Matricularte \n2). ver curso \n3). ver mis datos"+"  \n4). Atras \n5). Salir";
       
       return text;
    }
}
