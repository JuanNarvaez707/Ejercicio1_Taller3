/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.io.File;

/**
 *
 * @author alvaroms
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = new File("texto.txt");
        Lectura miObjLeer = new Lectura();
        miObjLeer.lecturaArchivo(archivo);
    }
    
}
