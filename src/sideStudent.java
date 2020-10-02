
public class sideStudent {


   static void estudiante(){
      

        while (true) {  

           System.out.println(bienvenida());
            
            byte eleccion_estudiante=resources.entrada().nextByte();
           
            if (eleccion_estudiante==5){System.exit(0);}

            if (eleccion_estudiante==3){
               verdatos();
            }

            else if (eleccion_estudiante==1){
            
            if (sideDocente.nombre[0]!=null)
            {
               if (sideDocente.cupo[0]>=1) {
                  Matricula_estudiante.DatosEstudiante();
               }else{
                  System.out.println("se acabaron los cupos");
               }
            }

            else{
               System.out.println("no hay curso para matricularse");
               resources.bienvenida();}

            }else if(eleccion_estudiante==4){resources.bienvenida();}

            else if(eleccion_estudiante==2){System.out.println("Curso: "+sideDocente.nombre[0]+"\nCupo disponibles: "+sideDocente.cupo[0]);}
      }
   }

   static void verdatos() { System.out.println(
      Matricula_estudiante.perfilEstudiante[0]!=null?
      Matricula_estudiante.perfilEstudiante[0]:"no hay datos para mostrar ,Matriculate primero"); }


    static String bienvenida(){
       String text=
      ("Bienvenido estudiante ♥ \n \n1). Matricularte \n2). ver curso \n3). ver mis datos ◕‿◕ \n4). Atras \n5). Salir");
       return text;
    }
}
