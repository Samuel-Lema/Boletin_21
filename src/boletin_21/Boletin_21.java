package boletin_21;

import com.datos.guardar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Boletin_21 {

    public static ArrayList<String> array = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas palabras deseas introducir?"));
        String palabra = "";
        
        for(int i = 0; num > i; i++){
            
            palabra = JOptionPane.showInputDialog("Escribe la palabra nº" + (i + 1));
            array.add(palabra);
        }
        
        Collections.sort(array);
        
        System.out.println("// Palabras ordenadas alfabeticamente //");
        
        for (String object: array){
            
            System.out.println(object);
        }
        
        guardar.guardarDatos();
    }
    
}
