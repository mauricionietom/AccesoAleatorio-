/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import FG.Esquema;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class DAOEsquema {
    public int idgenerado() {

        int max = 99999;
        int min = 00000;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(randomNum);
        return randomNum;
    }
    
    public void CrearArchivo(Esquema datos) throws IOException{
        
        File archivo = new File ("lectura.txt");
        FileWriter fr = new FileWriter (archivo,true);
        PrintStream output = new PrintStream(archivo);
        if(datos!=null){
         output.println(datos);
        System.out.println(datos);   
        }
        
    }
        
         public void buscar(String dato) throws FileNotFoundException, IOException{
      
        File archivo = new File("lectura.txt");
        FileReader fr = new FileReader(archivo);
        String input;
        BufferedReader bin = new BufferedReader(fr);

        while ((input = bin.readLine()) != null) {

            String[] entrada = input.split(",");

            for (int i = 0; i < entrada.length; i++) {
                if (entrada[i].equalsIgnoreCase(dato)) {
                    System.out.println("Siiii" + dato);
                    System.out.println(entrada);
                }
            }
        }
    }
         
        
}
