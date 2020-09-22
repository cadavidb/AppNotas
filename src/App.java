import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        String estudiantes []={"Brayan Gomez", "Juancho"};
        String consulta=JOptionPane.showInputDialog(
            "ingresa el nombre del estudiante para ver su nota del primer semestre 2020-2"
            );

            Busqueda(consulta, estudiantes);
      


        
    }

    static void Busqueda(String nombre , String [] arregloNombres){
        Boolean valor=Arrays.asList(arregloNombres).contains(nombre);
        if (valor) {
            JOptionPane.showMessageDialog(null,"ese estudiante llamado " + nombre +" existe su nota es F XD");
        } else {
            JOptionPane.showMessageDialog(null,"ese estudiante no  existe!");
            
        }
    }
}
