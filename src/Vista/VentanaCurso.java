/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Cursos;
import Controlador.Controlador_Cursos;
import Modelo.Curso;
import Modelo.ManejadorRegistros;
/**
 *
 * @author David
 */
public class VentanaCurso extends javax.swing.JFrame
{
     private Controlador_Cursos controlador;
    private ManejadorRegistros manejo;
    
    public VentanaCurso() {
        initComponents();
        controlador = new Controlador_Cursos(this);
        manejo = new ManejadorRegistros();
        this.gUI_Cursos1.agregar_evento(controlador);
        this.setLocationRelativeTo(null);
    }
    public int get_CodigoPorFuente(Object obj){
        int dev = 0;
        if(this.txt_creditos.equals(obj)){
            dev = Controlador_Cursos.CREDITOS;
        } else if(this.txt_sigla.equals(obj)){
            dev = Controlador_Cursos.SIGLA;
        } else if(this.txt_nombrecurso.equals(obj)){
            dev = Controlador_Cursos.NOMBRE;
        } else{
            dev = this.gUI_Cursos1.get_CodigoPorFuente(obj);
        }
        return dev;
 }
     public void limpiarCampos(){
        txt_sigla.setText("");
        txt_creditos.setText("");
        txt_nombrecurso.setText("");
    }
     public boolean txtLlenos(){
        if(txt_sigla.getText() != null){
            if(txt_creditos.getText() != null){
                if(txt_nombrecurso.getText()!= null){
                    return true;
                }
            }
        }
        return false;
    }
     public String getTxt_Sigla(){
         String sigla =  txt_sigla.getText();
         return sigla;
     }
     public String getTxt_Nombre(){
         String nombre = txt_nombrecurso.getText();
         return nombre;
     }
     public Curso getCurso(){
         Curso curso = new Curso(txt_nombrecurso.getText(), txt_sigla.getText(), Integer.parseInt(txt_creditos.getText()));
         return curso;
     }
     public boolean txtSigla(){
            if(txt_sigla.getText() != null){
                return true;    
        }
        return false;
    }
     private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombrecurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_sigla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_creditos = new javax.swing.JTextField();
        gUI_Cursos1 = new Vista.GUI_Cursos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       
        jLabel1.setText("Cursos");

       
        jLabel2.setText("Nombre del curso:");

        
        jLabel3.setText("Sigla Curso:");

       
        jLabel4.setText("Creditos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_sigla, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(gUI_Cursos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_sigla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(gUI_Cursos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    } 
    private Vista.GUI_Cursos gUI_Cursos1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_creditos;
    private javax.swing.JTextField txt_nombrecurso;
    private javax.swing.JTextField txt_sigla;
}
