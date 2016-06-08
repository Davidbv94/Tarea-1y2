/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Archivos.Escritor;
import Archivos.Lector;
import Modelo.ManejadorRegistros;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class VentanaGuardarXML extends javax.swing.JFrame
{
     Lector lector = new Lector();
    Escritor escritor = new Escritor();
    private String texto = "datos.txt";
    ManejadorRegistros manejo;
    
    public VentanaGuardarXML() {
        initComponents();
        this.setLocationRelativeTo(null);
        manejo = new ManejadorRegistros();
    }
     private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       
        jLabel1.setText("Guardar Archivo XML");

    
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btn_guardarActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaGuardarXML.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btn_guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_guardar)
                .addGap(36, 36, 36))
        );

        pack();
    }
     private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_btn_guardarActionPerformed
        if(evt.getSource() == btn_guardar){
            lector.readFile(texto);
            escritor.writeFile(texto, manejo.listaEstudiantes());
            escritor.writeFile(texto, manejo.consultarCurso());
        }
    }
     private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
}
