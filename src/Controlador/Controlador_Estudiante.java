/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modelo.Estudiante;
import Modelo.ManejadorRegistros;
import Vista.ManipulaEstudiantes;
/**
 *
 * @author David
 */
public class Controlador_Estudiante implements ActionListener
{
     public static final int CARNET = 1;
    public static final int NOMBRE = 2;
    public static final int CORREO = 3;
    public static final int AGREGAR = 4;
    public static final int BUSCAR = 5;
    public static final int EDITAR = 6;
    public static final int ELIMINAR = 7;
    private ManipulaEstudiantes manipulaEstudiante;
    private ArrayList<Estudiante> array;
    private ManejadorRegistros manejo;
    
    public Controlador_Estudiante(ManipulaEstudiantes manipulaEstudiante) {
        this.manipulaEstudiante = manipulaEstudiante;
        array = new ArrayList();
        manejo = new ManejadorRegistros();
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        int codigo = this.manipulaEstudiante.get_CodigoPorFuente(e.getSource());
        switch(codigo){
            case AGREGAR:if(manipulaEstudiante.txtLlenos()){
                if(manejo.verificarEstudiante(manipulaEstudiante.getTxtCarnet())){
                manejo.addEstudiante(manipulaEstudiante.getEstudiante());
                    JOptionPane.showMessageDialog(null,"Estudiante Registrado");
                manipulaEstudiante.limpiarCampos();
            } else{
                JOptionPane.showMessageDialog(null,"Error, Estudiante ya Existente");
                manipulaEstudiante.limpiarCampos();
            }
            }
            break;
            case ELIMINAR: if(manipulaEstudiante.txtCarnet()){
               
                if(manejo.verificarEstudiante(manipulaEstudiante.getTxtCarnet())){
                JOptionPane.showMessageDialog(null,"Error, Estudiante No Existente");
                manipulaEstudiante.limpiarCampos();
               
            } else {
                manejo.deleteEstudiante(manipulaEstudiante.getTxtCarnet());
                JOptionPane.showMessageDialog(null,"Estudiante Eliminado");
                
                manipulaEstudiante.limpiarCampos();
            }
            }
            break;
            case BUSCAR: if(manipulaEstudiante.txtCarnet()){
                if(manejo.verificarEstudiante(manipulaEstudiante.getTxtCarnet())){
                JOptionPane.showMessageDialog(null,"Estudiante No Existente");
                manipulaEstudiante.limpiarCampos();
             }else{ 
                JOptionPane.showMessageDialog(null,manejo.buscarEstudiante(manipulaEstudiante.getTxtCarnet()));
              
                manipulaEstudiante.limpiarCampos();
            } 
            }
            break;
            case EDITAR: if(manipulaEstudiante.txtCarnet()){
                if(manejo.verificarEstudiante(manipulaEstudiante.getTxtCarnet())){
                JOptionPane.showMessageDialog(null,"Estudiante No Existente");
                manipulaEstudiante.limpiarCampos();
            } else if(manipulaEstudiante.txtCarnet()){
                manejo.editarNombre(JOptionPane.showInputDialog("Digite el nuevo nombre del estudiante: "));
                JOptionPane.showMessageDialog(null,"Nombre Modificado Exitosamente");
                   
                manipulaEstudiante.limpiarCampos();
            }
            }
            break;
            }
}
}
