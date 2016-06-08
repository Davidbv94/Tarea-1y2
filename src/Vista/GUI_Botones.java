/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Estudiante;
import Controlador.Controlador_Estudiante;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class GUI_Botones 
{
public GUI_Botones() {
        initComponents();
    }
private void initComponents() {

        btn_agregar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png")));
        btn_agregar.setText("Agregar");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); 
        btn_buscar.setText("Buscar");

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar.png"))); 
        btn_editar.setText("Editar");

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); 
        btn_eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_buscar)
                    .addComponent(btn_editar)
                    .addComponent(btn_eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    public void agregar_evento(Controlador_Estudiante controlador){
        this.btn_agregar.addActionListener(controlador);
        this.btn_buscar.addActionListener(controlador);
        this.btn_editar.addActionListener(controlador);
        this.btn_eliminar.addActionListener(controlador);
    }
    public int get_CodigoPorFuente(Object obj){
        int dev = 0;
        if(this.btn_agregar.equals(obj)){
            dev = Controlador_Estudiante.AGREGAR;
        } else if(this.btn_buscar.equals(obj)){
            dev = Controlador_Estudiante.BUSCAR;
        } else if(this.btn_editar.equals(obj)){
            dev = Controlador_Estudiante.EDITAR;
            
        } else if(this.btn_eliminar.equals(obj)){
            dev = Controlador_Estudiante.ELIMINAR;
        }
        return dev;
    }

    
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;

    private void setLayout(GroupLayout layout) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
