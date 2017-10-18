/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textodelimitado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author oracle
 */
public class Textodelimitado {
    /**
     * @param args the command line arguments
     */
        static String[]cod={"p1","p2","p3"};
        static String[]desc={"parafusos","cravos","tachas"};
        static double[]prezo={3,4,5};
         
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File directorio = new File("/home/oracle/NetBeansProjects/textodelimitado/archivos");
        File archivo = new File("/home/oracle/NetBeansProjects/textodelimitado/archivos/productos.txt");
        
        carpeta(directorio);
        archivo(archivo);
        escribir(archivo);
        lectura(archivo);
    }
    
    static void carpeta(File directorio){

        if(directorio.exists())
            System.out.println("Directorio existente "+directorio.getPath());
        else
            directorio.mkdir();
    }
    
    static void archivo(File archivo) throws IOException{

        if(archivo.exists())
            System.out.println("Archivo de texto existente "+archivo.getPath());
        else
            archivo.createNewFile();

    }
            
    static void escribir(File archivo){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(archivo)));
            for(int i=0;i<3;i++){
                pw.print("Codigo: "+cod[i]+"\n");
                pw.print("Desccripcion: "+desc[i]+"\n");
                pw.println("Prezo: "+prezo[i]+"€");
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Textodelimitado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    static void lectura(File archivo) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        for(int l=0;l<3;l++){
            while(br.ready()==true){
                System.out.println(""+br.readLine());
            } 
        }
        br.close();
    }
    
   
}
