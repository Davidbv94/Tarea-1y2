/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Vista.ManipulaEstudiantes;
import Vista.VentanaCurso;
/**
 *
 * @author David
 */
public class ManejadorRegistros 
{
private ManipulaEstudiantes manipulaEstudiante;
    private ArrayList<Estudiante> array;
    private Estudiante estudiante;
    private VentanaCurso ventana;
    private ArrayList<Curso> arrayCursos;
    private int numEstudiantes;
    
    public ManejadorRegistros() {
        this.manipulaEstudiante = manipulaEstudiante;
        array = new ArrayList<Estudiante>();
        arrayCursos = new ArrayList<Curso>();
        estudiante = new Estudiante();
        numEstudiantes = 0;
        this.ventana = ventana;
    }
    
    
    public void addEstudiante(Estudiante estudiante){
        try{
            verificarNombre(estudiante);
            verificarCarnet(estudiante);
            verificarCorreo(estudiante);
             array.add(estudiante);
        }catch(MyException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    public void deleteEstudiante(String carnet){
        try{
            verificarCarnet(estudiante);
        for(int i=0; i< array.size(); i++){
            if(buscarEstudiante(carnet)!= null){
                array.remove(buscarEstudiante(carnet));
            }
        }
        }catch(MyException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    public Estudiante buscarEstudiante(String carnet){
        try{
            validarCarnet(carnet);
        for(int i=0; i<array.size(); i++){
            if(array.get(i).getCarnet().equalsIgnoreCase(carnet)){
                return array.get(i);
            } 
        }
        }catch(MyException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
    
    
    public void editarNombre(String nombreNuevo){
        try{
            validarNombre(nombreNuevo);
        for(int i =0; i < array.size(); i++){
            if(array.get(i).getCarnet().equalsIgnoreCase(manipulaEstudiante.getTxtCarnet())){
            array.get(i).setNombre(nombreNuevo);
            }
        }
        }catch(MyException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
  
    public String listaEstudiantes(){
        String hilera = "";
        for(int i =0; i< array.size(); i++){
            hilera += array.get(i).toString();
        }
        return hilera;
    }
    
    public boolean verificarEstudiante(String numero){
        for (int i =0; i< array.size(); i++) {
            if(array.get(i).getCarnet().equalsIgnoreCase(numero)){
                return false;
            }
        }
        return true;
    }
    
   
    public String consultarCarnet(String carnet){
        String estudiante="";
        try{
            validarCarnet(carnet);
        for(int i =0; i< array.size(); i++){
            if(array.get(i).getCarnet().equalsIgnoreCase(carnet)){
                estudiante = array.get(i).toString();
            }
        }
        }catch(MyException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return estudiante;
    }
    
    
    public String[][] reportes(){
        String datos[][] = new String[array.size()][3];
        for(int i=0; i<array.size();i++){
            datos[i][0] = array.get(i).getNombre();
            datos[i][1] = array.get(i).getCarnet();
            datos[i][2] = array.get(i).getEmail();
            System.out.println("datos"+datos);
        }
        return datos;
        
    }
    
   
    public void verificarNombre(Estudiante nombre) throws MyException{
        Pattern pat = Pattern.compile("[A-Za-z]");
        Matcher mat = pat.matcher(nombre.getNombre());
        if(mat.find()){
           nombre.setNombre(nombre.getNombre());
        } else{
            throw new MyException("Error en el nombre");
        }
    }
    

    public void verificarCarnet(Estudiante carnet) throws MyException{
        Pattern pat = Pattern.compile("[^\\d]+[0-9]{5,6}");
        Matcher mat = pat.matcher(carnet.getCarnet());
        if(mat.find()){
            carnet.setCarnet(carnet.getCarnet());
        }else{
            throw new MyException("Error en el carnet");
        }
    }
    
    
    public void verificarCorreo(Estudiante correo) throws MyException{
        Pattern pat = Pattern.compile("^[\\\\w-]+(\\\\.[\\\\w-]+)*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(correo.getEmail());
        if(mat.find()){
            correo.setEmail(correo.getEmail());
        }else{
            throw new MyException("Error en el correo");
        }
    }
    
    public void validarCarnet(String carnet) throws MyException{
        Pattern pat = Pattern.compile("[^\\d]+[0-9]{5,6}");
        Matcher mat = pat.matcher(carnet);
        if(mat.find()){
            System.out.println("Valido");
        }else{
            throw new MyException("Error en el carnet");
        }
    }
    
    
    public void validarNombre(String nombre) throws MyException{
        Pattern pat = Pattern.compile("[A-Za-z]");
        Matcher mat = pat.matcher(nombre);
        if(mat.find()){
            System.out.println("Valido");
        }else{
            throw new MyException("Error en el nombre");
        }
    }
    
    public boolean verificarCurso(String sigla){
        for(int i=0; i<arrayCursos.size(); i++){
            if(arrayCursos.get(i).getSigla().equalsIgnoreCase(sigla)){
                return false;
            }
        }
        return true;
    }
    public void agregarCursos(Curso curso){
        arrayCursos.add(curso);
    }
    
   
    public void eliminarCurso(String sigla){
        for(int i=0;i<arrayCursos.size();i++){
            if(arrayCursos.get(i).getSigla().equalsIgnoreCase(sigla)){
                arrayCursos.remove(buscarCurso(sigla));
            }
        }
    }
   
    public Curso buscarCurso(String sigla){
        for(int i=0; i<arrayCursos.size(); i++){
            if(arrayCursos.get(i).getSigla().equalsIgnoreCase(sigla)){
                return arrayCursos.get(i);
            } 
        }
        return null;
    }
   
    public void modificarCurso(String sigla, String nombre){
        for(int i=0;i<arrayCursos.size(); i++){
                arrayCursos.get(i).setSigla(sigla);
                arrayCursos.get(i).setNombre(nombre);
        }
    }
    
    public String consultarCurso(){
        String datos="";
       
            for(int i=0;i<arrayCursos.size();i++){
                datos = arrayCursos.get(i).toString();
           
        }
        return datos;
    }
    public Curso asignarCurso(Curso e){
        if(numEstudiantes < 25){
            for(int i =0; i<arrayCursos.size();i++){
                arrayCursos.get(i).setCurso(e);
                numEstudiantes++;
            }
    } return null;
    }    
    
}
