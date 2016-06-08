/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Controlador_Cursos;
import Controlador.Controlador_Cursos;
import Controlador.Controlador_Estudiante;
import Controlador.Controlador_Estudiante;
/**
 *
 * @author David
 */
public class GUI_Cursos  extends javax.swing.JPanel  
{
    public GUI_Cursos() {
        initComponents();
    }
    private void initComponents() {

        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_asignar = new javax.swing.JButton();

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); 
        btn_agregar.setText("Agregar");

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar.png")));
        btn_modificar.setText("Modificar");

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png")));
        btn_eliminar.setText("Eliminar");

        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); 
        btn_consultar.setText("Consultar");

        btn_asignar.setText("Asignar Curso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btn_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modificar)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addGap(18, 18, 18)
                .addComponent(btn_consultar)
                .addGap(18, 18, 18)
                .addComponent(btn_asignar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_agregar)
                        .addComponent(btn_modificar)
                        .addComponent(btn_eliminar)
                        .addComponent(btn_consultar))
                    .addComponent(btn_asignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
    }
     public void agregar_evento(Controlador_Cursos controlador){
        this.btn_agregar.addActionListener(controlador);
        this.btn_asignar.addActionListener(controlador);
        this.btn_modificar.addActionListener(controlador);
        this.btn_eliminar.addActionListener(controlador);
        this.btn_consultar.addActionListener(controlador);
    }
    public int get_CodigoPorFuente(Object obj){
        int dev = 0;
        if(this.btn_agregar.equals(obj)){
            dev = Controlador_Cursos.AGREGAR;
        } else if(this.btn_asignar.equals(obj)){
            dev = Controlador_Cursos.ASIGNAR;
        } else if(this.btn_consultar.equals(obj)){
            dev = Controlador_Cursos.CONSULTAR;
        } else if(this.btn_eliminar.equals(obj)){
            dev = Controlador_Estudiante.ELIMINAR;
        } else if(this.btn_modificar.equals(obj)){
            dev = Controlador_Cursos.MODIFICAR;
        }
        return dev;
    }

    
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_asignar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
}
