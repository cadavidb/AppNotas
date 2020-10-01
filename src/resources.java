
import java.util.Scanner;

public class resources {

   static void bienvenida(){ 
           try {
           //se pregunta si el usuario es estudiante o docente
           System.out.println("Bienvenido al Colegio Dennis Ritchie \n" +
           "Eres ? \n1). Estudiante \n2). Docente ");
           int categoria_elegida=entrada().nextInt();
           //la eleccion la manejamos en una funcion , ve abajo por favor
           eleccion(categoria_elegida);}

           //cualquier error sera manejado 
           catch (Exception e) {    
            System.out.println("ha ocurrido un error\n" + e);
           }
 
}






static void eleccion(int number){
       //si es estudiante con tranquilidad puede pasar
       if (number==1) {
       sideStudent.estudiante();
       

       // si es docente debe ingresar la clave de acceso al sistema
       //un while true para que se ejecute la pregunta hasta donde quiera el usuario     

       } else {
              while (true) {
              System.out.println("Ingresa el usuario de acceso al sistema");
              String admin=entrada().nextLine();
              System.out.println("Ingresa la clave de  acceso al sistema");
              String password=entrada().nextLine();


               if (admin.equals("admin") && password.equals("123")) {
               sideDocente docente = new sideDocente();
               docente.eleccion_docente();
               break;
          }else{
                 System.out.println("mmm te has equivocado deseas? \n" 
                 + "1.) intentarlo de nuevo \n2.) salir");
                 int intento=entrada().nextInt();
              if (intento!=1) {
                 break;
     }   
    }            
   }   
  }
 }

  static Scanner entrada(){
        Scanner entrada= new Scanner(System.in);
        return entrada;
 }
}