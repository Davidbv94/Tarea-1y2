/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Modelo.Estudiante;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class Lector 
{
private BufferedReader br;
    
    private String readFileThrows(String filepath) throws FileNotFoundException, IOException{
        br = new BufferedReader(new FileReader(filepath));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        return sb.toString();
    
    }
    
    public String readFile(String filepath){
        String dev = null;
        try {
            dev = readFileThrows(filepath);
        } catch (IOException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dev;
    }
    public ArrayList<Estudiante> readXml(String filepath){
       
        XMLDecoder d;
       ArrayList<Estudiante>  estudiantes=null;
        try {
            d = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(filepath)));
            
            estudiantes = (ArrayList<Estudiante>) d.readObject();
            d.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }

        return estudiantes;
    }
}
