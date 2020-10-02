
public class App {
<<<<<<< HEAD
   
    public static void main(String[] args) {
    //welcome at the jungle of code
    resources.bienvenida();
          
 }
=======
    public static void main(String[] args) throws Exception {
        
        String estudiantes []={"Brayan Gomez", "Juancho"};
        String consulta=JOptionPane.showInputDialog(
            "ingresa el nombre del estudiante para ver su nota del primer semestre"
            );

            Busqueda(consulta, estudiantes);
      


        
    }
//esto sirve para saber si existe un valor en un arreglo
    static void Busqueda(String nombre , String [] arregloNombres){
        Boolean valor=Arrays.asList(arregloNombres).contains(nombre);
        if (valor) {
            JOptionPane.showMessageDialog(null,"ese estudiante llamado " + nombre +" existe su nota es F XD");
        } else {
            JOptionPane.showMessageDialog(null,"ese estudiante no  existe!");
            
        }
    }
>>>>>>> ec96aedc8b13b4fd51609f0c0d2904108a10693a
}

