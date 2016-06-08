/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Ventana;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
/**
 *
 * @author David
 */
public class VentanaPrincipal extends javax.swing.JFrame
{
  private Controlador_Ventana controlador;
    private JMenu guardar;
    public VentanaPrincipal() {
        initComponents();
        this.controlador = new Controlador_Ventana();
        this.bn_salida.addActionListener(controlador);
        this.menuManipula.addActionListener(controlador);
        this.jmenuConsulta.addActionListener(controlador);
        this.jmenuReportes.addActionListener(controlador);
        this.jmenuCursos.addActionListener(controlador);
        this.jmenuXML.addActionListener(controlador);
        this.jmenuJSON.addActionListener(controlador);
        this.guardar = new JMenu("Guardar");
        this.setLocationRelativeTo(null);
       
    }

private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenuBar10 = new javax.swing.JMenuBar();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenuBar11 = new javax.swing.JMenuBar();
        jMenu21 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenuBar12 = new javax.swing.JMenuBar();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenuBar13 = new javax.swing.JMenuBar();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenuBar14 = new javax.swing.JMenuBar();
        jMenu27 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenuBar15 = new javax.swing.JMenuBar();
        jMenu29 = new javax.swing.JMenu();
        jMenu30 = new javax.swing.JMenu();
        lbl_principal = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        btn_salir = new javax.swing.JMenu();
        bn_salida = new javax.swing.JMenuItem();
        menu_cursos = new javax.swing.JMenu();
        menuManipula = new javax.swing.JMenuItem();
        jmenuConsulta = new javax.swing.JMenuItem();
        jmenuReportes = new javax.swing.JMenuItem();
        jmenuCursos = new javax.swing.JMenuItem();
        menuGuadar = new javax.swing.JMenu();
        jmenuXML = new javax.swing.JMenuItem();
        jmenuJSON = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar5.add(jMenu11);

        jMenu12.setText("File");
        jMenuBar6.add(jMenu12);

        jMenu13.setText("Edit");
        jMenuBar6.add(jMenu13);

        jMenu14.setText("File");
        jMenuBar7.add(jMenu14);

        jMenu15.setText("Edit");
        jMenuBar7.add(jMenu15);

        jMenu16.setText("File");
        jMenuBar8.add(jMenu16);

        jMenu17.setText("Edit");
        jMenuBar8.add(jMenu17);

        jMenu19.setText("File");
        jMenuBar10.add(jMenu19);

        jMenu20.setText("Edit");
        jMenuBar10.add(jMenu20);

        jMenu6.setText("File");
        jMenuBar9.add(jMenu6);

        jMenu18.setText("Edit");
        jMenuBar9.add(jMenu18);

        jMenu21.setText("File");
        jMenuBar11.add(jMenu21);

        jMenu22.setText("Edit");
        jMenuBar11.add(jMenu22);

        jMenu23.setText("File");
        jMenuBar12.add(jMenu23);

        jMenu24.setText("Edit");
        jMenuBar12.add(jMenu24);

        jMenu25.setText("File");
        jMenuBar13.add(jMenu25);

        jMenu26.setText("Edit");
        jMenuBar13.add(jMenu26);

        jMenu27.setText("File");
        jMenuBar14.add(jMenu27);

        jMenu28.setText("Edit");
        jMenuBar14.add(jMenu28);

        jMenu29.setText("File");
        jMenuBar15.add(jMenu29);

        jMenu30.setText("Edit");
        jMenuBar15.add(jMenu30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo.jpg"))); // NOI18N

        btn_salir.setText("Salir");

        bn_salida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        bn_salida.setText("Salir");
        bn_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_salidaActionPerformed(evt);
            }
        });
        btn_salir.add(bn_salida);

        menuPrincipal.add(btn_salir);

        menu_cursos.setText("Estudiantes");

        menuManipula.setText("Manipula Estudiantes");
        menuManipula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManipulaActionPerformed(evt);
            }
        });
        menu_cursos.add(menuManipula);

        jmenuConsulta.setText("Consulta Estudiantes");
        menu_cursos.add(jmenuConsulta);

        jmenuReportes.setText("Reporte Estudiantes");
        menu_cursos.add(jmenuReportes);

        jmenuCursos.setText("Cursos");
        jmenuCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuCursosActionPerformed(evt);
            }
        });
        menu_cursos.add(jmenuCursos);

        menuPrincipal.add(menu_cursos);

        menuGuadar.setText("Guardar");

        jmenuXML.setText("Guardar Archivo XML");
        jmenuXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuXMLActionPerformed(evt);
            }
        });
        menuGuadar.add(jmenuXML);

        jmenuJSON.setText("Guardar Archivo JSON");
        jmenuJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuJSONActionPerformed(evt);
            }
        });
        menuGuadar.add(jmenuJSON);

        menuPrincipal.add(menuGuadar);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }
    private void bn_salidaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void menuManipulaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jmenuCursosActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jmenuXMLActionPerformed(java.awt.event.ActionEvent evt) {
    
    }
    private void jmenuJSONActionPerformed(java.awt.event.ActionEvent evt) {
    
    }
    
    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    
    private javax.swing.JMenuItem bn_salida;
    private javax.swing.JMenu btn_salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar10;
    private javax.swing.JMenuBar jMenuBar11;
    private javax.swing.JMenuBar jMenuBar12;
    private javax.swing.JMenuBar jMenuBar13;
    private javax.swing.JMenuBar jMenuBar14;
    private javax.swing.JMenuBar jMenuBar15;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuBar jMenuBar9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmenuConsulta;
    private javax.swing.JMenuItem jmenuCursos;
    private javax.swing.JMenuItem jmenuJSON;
    private javax.swing.JMenuItem jmenuReportes;
    private javax.swing.JMenuItem jmenuXML;
    private javax.swing.JLabel lbl_principal;
    private javax.swing.JMenu menuGuadar;
    private javax.swing.JMenuItem menuManipula;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menu_cursos;  
}
