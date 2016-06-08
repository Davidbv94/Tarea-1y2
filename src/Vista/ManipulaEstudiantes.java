/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Controlador_Estudiante;
import Modelo.Estudiante;
import Modelo.ManejadorRegistros;
/**
 *
 * @author David
 */
public class ManipulaEstudiantes extends javax.swing.JFrame
{
    private Controlador_Estudiante ce;
    private ManejadorRegistros me;
    
    public ManipulaEstudiantes() {
        initComponents();
        ce = new Controlador_Estudiante(this);
        me = new ManejadorRegistros();
        this.gUI_Botones1.agregar_evento(ce);
        this.setLocationRelativeTo(null);
        
    }

    
    public int get_CodigoPorFuente(Object obj){
        int dev = 0;
        if(this.txt_carnet.equals(obj)){
            dev = Controlador_Estudiante.CARNET;
        } else if(this.txt_correo.equals(obj)){
            dev = Controlador_Estudiante.CORREO;
        } else if(this.txt_nombre.equals(obj)){
            dev = Controlador_Estudiante.NOMBRE;
        } else{
            dev = this.gUI_Botones1.get_CodigoPorFuente(obj);
        }
        return dev;
    }
    
    public Estudiante getEstudiante(){
        Estudiante estudiante = new Estudiante(txt_nombre.getText(), txt_carnet.getText(), txt_correo.getText());
        return estudiante;
    }
    public String getTxtCarnet(){
        String numero = txt_carnet.getText();
        return numero;
    }
    public boolean txtLlenos(){
        if(txt_nombre.getText() != null){
            if(txt_carnet.getText() != null){
                if(txt_correo.getText()!= null){
                    return true;
                }
            }
        }
        return false;
    }
    public void limpiarCampos(){
        txt_nombre.setText("");
        txt_carnet.setText("");
        txt_correo.setText("");
    }
    public boolean txtCarnet(){
            if(txt_carnet.getText() != null){
                return true;    
        }
        return false;
    }
    public String getNombre(){
        String name ="";
        name = txt_nombre.getText();
        return name;
    }
     public String getCorreo(){
        String correo ="";
        correo = txt_correo.getText();
        return correo;
    }
     private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        gUI_Botones1 = new Vista.GUI_Botones();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_carnet = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_carnet = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        lbl_mensaje = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nombre.setText("Nombre: ");

        lbl_carnet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_carnet.setText("Carnet: ");

        lbl_correo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_correo.setText("Correo:");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_carnet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_correo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_carnet)
                            .addComponent(lbl_correo)
                            .addComponent(lbl_nombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txt_carnet)
                            .addComponent(txt_correo))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_carnet))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_correo)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    private Vista.GUI_Botones gUI_Botones1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_carnet;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JTextField txt_carnet;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
}