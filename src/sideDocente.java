


public class sideDocente {


    //arreglo estudiantes aqui se guardaran los nombres 
    static String [] estudiantes;
    //espacio para el nombre del curso
    static String [] nombre= new String [1];
    static int [] cupo=new int [1];



//preguntamos nombre y cupos para el arreglo estudiantes
static void DatosCurso(){
    System.out.println("nombre del curso:");
    String nombreCurso=resources.entrada().nextLine();
    System.out.println("ingresa el numero de cupos\npara el curso de: "+ nombreCurso );
    int cupos=resources.entrada().nextInt();
    estudiantes=new String[cupos];
    cupo[0]=cupos;
    nombre[0]=nombreCurso;
}

//ver cursos disponibles
static void verCurso(){
    System.out.println( "\nCurso de: " + nombre[0] + "\nNumero de cupos: " + cupo[0]+"\n");//estudiantes.length+"\n" );
    
}
    
//preguntamos al docente una opcion
void eleccion_docente(){
    while (true) {
        System.out.println("Bienvenido Docente que deseas realizar?\n" 
        + "1). Crear curso \n2). Ver cursos \n3). Atras \n4). salir");
        int eleccion=resources.entrada().nextInt();
        if (eleccion==4) {
            System.exit(0);
        }else{
            decision_docente(eleccion);
          }
        }
      }
    
//manejamos la decision del docente 

              
void decision_docente(int eleccion ){
//se pregunta el nombre del curso y cupos para asignar
    if (eleccion==1){
        DatosCurso();

//ver cursos agregados ... mas comodidad para el profe 
    }else if(eleccion==2){
       verCurso();
// atras 
    }else if(eleccion==3){
        // resources atras = new resources();
        resources.bienvenida();
  }
}

}
 

