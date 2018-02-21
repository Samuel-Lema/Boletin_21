package com.datos;

import boletin_21.Boletin_21;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class guardar {
    
    static ArrayList<String> arrayGuardado =  new ArrayList<>();
    
    public static void leerDatos() throws FileNotFoundException {
        
        try {
            Scanner sc = new Scanner(new File("src/com/datos/palabras.txt"));
            
            while (sc.hasNextLine()) {
                String[] ref = sc.nextLine().split(" --> ");
                arrayGuardado.add(ref[1]);
            }
            
            sc.close();
            
        } catch(FileNotFoundException except){
            
            System.out.print("No se ha encontrado el archivo de guardado.");
        }
    }
    
    public static void guardarDatos() throws FileNotFoundException, IOException {
        
        File ruta = new File("src/com/datos/palabras.txt");
        FileWriter escribir;
        
        leerDatos();
        
        try {
            escribir = new FileWriter(ruta, false);
            int i = 1;
            
            for(String palabra: Boletin_21.array){
                
                arrayGuardado.add(palabra);
            }
            
            Collections.sort(arrayGuardado);
            
            for(String palabra: arrayGuardado){
                
                escribir.write(i + " --> " + palabra + "\n");
                i++;
            }
            
            
            
            escribir.close();
        } catch(IOException except){
            
            System.out.print("No se ha encontrado el archivo de guardado.");
        }
    }
}
