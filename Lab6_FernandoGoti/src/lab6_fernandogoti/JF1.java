/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_fernandogoti;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Goti
 */
public class JF1 extends javax.swing.JFrame {

    /**
     * Creates new form JF1
     */
    public JF1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lugar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        JTNOMBRE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTLUGAR = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTSEGURIDAD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JCOMBOENTRADA = new javax.swing.JComboBox<>();
        JCOMBOSALIDA = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TABPRINCIPAL = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JBCATEGORIACANCHA = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        JCOMOESTADO = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        JBCOMBORESTAURANTE = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        JCOMBOCALIFICACION = new javax.swing.JComboBox<>();
        JBOTTONLUGAR = new javax.swing.JButton();
        Carretera = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JTcodigo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTDISTANCIA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ENTRADA1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        SALIDA1 = new javax.swing.JComboBox<>();
        JBOTTONGUARDARCARRETERA = new javax.swing.JButton();
        Listar = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboopcion = new javax.swing.JComboBox<>();
        Jlist = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_lugares = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        JMLUGAR = new javax.swing.JMenuItem();
        JMCARRETERA = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MListar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        Lugar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                LugarWindowActivated(evt);
            }
        });

        jLabel1.setText("Nombre:");

        JTLUGAR.setColumns(20);
        JTLUGAR.setRows(5);
        jScrollPane1.setViewportView(JTLUGAR);

        jLabel2.setText("Lugar:");

        jLabel3.setText("Seguridad:");

        jLabel4.setText("Carretera de Entrada:");

        jLabel5.setText("Carretera de Salida:");

        jLabel6.setText("LUGAR");

        jLabel9.setText("Categoria:");

        JBCATEGORIACANCHA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Football", "Básquet", "Tenis", "Volley" }));

        jLabel10.setText("Estado:");

        JCOMOESTADO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Libre" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCOMOESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCATEGORIACANCHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JBCATEGORIACANCHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JCOMOESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        TABPRINCIPAL.addTab("Cancha", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        TABPRINCIPAL.addTab("Casa", jPanel3);

        jLabel7.setText("Categoria");

        JBCOMBORESTAURANTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "China", "Mexicana", "Italiana", "Comida Rapida" }));

        jLabel8.setText("Calificacion");

        JCOMBOCALIFICACION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCOMBORESTAURANTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCOMBOCALIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JBCOMBORESTAURANTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JCOMBOCALIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        TABPRINCIPAL.addTab("Restaurante", jPanel1);

        JBOTTONLUGAR.setText("Guardar");
        JBOTTONLUGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBOTTONLUGARMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LugarLayout = new javax.swing.GroupLayout(Lugar.getContentPane());
        Lugar.getContentPane().setLayout(LugarLayout);
        LugarLayout.setHorizontalGroup(
            LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LugarLayout.createSequentialGroup()
                .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LugarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LugarLayout.createSequentialGroup()
                                .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(JTNOMBRE)
                                    .addComponent(JTSEGURIDAD))
                                .addGap(32, 32, 32)
                                .addComponent(TABPRINCIPAL, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LugarLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel6))))
                    .addGroup(LugarLayout.createSequentialGroup()
                        .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LugarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LugarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(26, 26, 26)
                        .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCOMBOENTRADA, 0, 67, Short.MAX_VALUE)
                            .addComponent(JCOMBOSALIDA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LugarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBOTTONLUGAR)
                .addGap(158, 158, 158))
        );
        LugarLayout.setVerticalGroup(
            LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LugarLayout.createSequentialGroup()
                .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LugarLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTSEGURIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LugarLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(TABPRINCIPAL, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(JCOMBOENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBOTTONLUGAR)
                .addGap(3, 3, 3)
                .addGroup(LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(JCOMBOSALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel11.setText("Codigo:");

        jLabel12.setText("Carretera");

        jLabel13.setText("Distancia:");

        jLabel14.setText("Carretera de Entrada");

        jLabel15.setText("Carretera de Salida");

        JBOTTONGUARDARCARRETERA.setText("Guardar");
        JBOTTONGUARDARCARRETERA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBOTTONGUARDARCARRETERAMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CarreteraLayout = new javax.swing.GroupLayout(Carretera.getContentPane());
        Carretera.getContentPane().setLayout(CarreteraLayout);
        CarreteraLayout.setHorizontalGroup(
            CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarreteraLayout.createSequentialGroup()
                .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarreteraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addGroup(CarreteraLayout.createSequentialGroup()
                                    .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .addComponent(JTDISTANCIA))))
                            .addComponent(jLabel15)
                            .addGroup(CarreteraLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ENTRADA1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CarreteraLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBOTTONGUARDARCARRETERA)
                            .addComponent(SALIDA1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        CarreteraLayout.setVerticalGroup(
            CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarreteraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addGap(44, 44, 44)
                .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(JTDISTANCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ENTRADA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(SALIDA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(JBOTTONGUARDARCARRETERA)
                .addGap(36, 36, 36))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        comboopcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboopcionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout ListarLayout = new javax.swing.GroupLayout(Listar.getContentPane());
        Listar.getContentPane().setLayout(ListarLayout);
        ListarLayout.setHorizontalGroup(
            ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        ListarLayout.setVerticalGroup(
            ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(comboopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jList_lugares);

        jLabel16.setText("Lista:");

        javax.swing.GroupLayout JlistLayout = new javax.swing.GroupLayout(Jlist.getContentPane());
        Jlist.getContentPane().setLayout(JlistLayout);
        JlistLayout.setHorizontalGroup(
            JlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JlistLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        JlistLayout.setVerticalGroup(
            JlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JlistLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menu");

        jMenu4.setText("Agregar");

        JMLUGAR.setText("Lugar");
        JMLUGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMLUGARActionPerformed(evt);
            }
        });
        jMenu4.add(JMLUGAR);

        JMCARRETERA.setText("Carretera");
        JMCARRETERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMCARRETERAActionPerformed(evt);
            }
        });
        jMenu4.add(JMCARRETERA);

        jMenu1.add(jMenu4);

        jMenu3.setText("Listar");

        MListar.setText("Listar Jtable");
        MListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MListarActionPerformed(evt);
            }
        });
        jMenu3.add(MListar);

        jMenuItem1.setText("Jlist");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMCARRETERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCARRETERAActionPerformed
        // TODO add your handling code here:
        Carretera.setModal(true);
        Carretera.pack();
        Carretera.setLocationRelativeTo(this);
        Carretera.setVisible(true);
    }//GEN-LAST:event_JMCARRETERAActionPerformed

    private void JMLUGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMLUGARActionPerformed
        // TODO add your handling code here:
        Lugar.setModal(true);
        Lugar.pack();
        Lugar.setLocationRelativeTo(this);
        Lugar.setVisible(true);
    }//GEN-LAST:event_JMLUGARActionPerformed

    private void JBOTTONLUGARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBOTTONLUGARMouseClicked
        // TODO add your handling code here:
        String Nombre;
        String Direccion;
        int Nivel_Seguridad;
        Carretera carretera_entrada;
        Carretera carretera_salida;
        String Categoria_restaurantes;
        int Calificacion;
        String Categoria_canchas;
        String Estado;
        Nombre = JTNOMBRE.getText();
        Direccion = JTLUGAR.getText();
        Nivel_Seguridad = Integer.parseInt(JTSEGURIDAD.getText());
        carretera_entrada = (Carretera) JCOMBOENTRADA.getSelectedItem();
        carretera_salida = (Carretera) JCOMBOSALIDA.getSelectedItem();
        if (TABPRINCIPAL.getSelectedIndex() == 0) {
            Categoria_canchas = JBCATEGORIACANCHA.getSelectedItem().toString();
            Estado = JCOMOESTADO.getSelectedItem().toString();
            lLugar.add(new Canchas(Categoria_canchas, Estado, Nombre, Direccion, Nivel_Seguridad, carretera_entrada, carretera_salida));
            JOptionPane.showMessageDialog(this, "Agrego exitosamente");
        } else if (TABPRINCIPAL.getSelectedIndex() == 2) {
            Categoria_restaurantes = JBCOMBORESTAURANTE.getSelectedItem().toString();
            Calificacion = Integer.parseInt(JCOMBOCALIFICACION.getSelectedItem().toString());
            lLugar.add(new Restaurantes(Categoria_restaurantes, Calificacion, Nombre, Direccion, Nivel_Seguridad, carretera_entrada, carretera_salida));
            JOptionPane.showMessageDialog(this, "Agrego exitosamente");
        } else if (TABPRINCIPAL.getSelectedIndex() == 1) {
            lLugar.add(new Casa(Nombre, Direccion, Nivel_Seguridad, carretera_entrada, carretera_salida));
            JOptionPane.showMessageDialog(this, "Agrego exitosamente");
        }
        JTNOMBRE.setText("");
        JTLUGAR.setText("");
        JTSEGURIDAD.setText("");
        JCOMBOENTRADA.setSelectedIndex(-1);
        JCOMBOSALIDA.setSelectedIndex(-1);
        JBCATEGORIACANCHA.setSelectedIndex(-1);
        JCOMOESTADO.setSelectedIndex(-1);
        JBCOMBORESTAURANTE.setSelectedIndex(-1);
        JCOMBOCALIFICACION.setSelectedIndex(-1);
    }//GEN-LAST:event_JBOTTONLUGARMouseClicked

    private void JBOTTONGUARDARCARRETERAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBOTTONGUARDARCARRETERAMouseClicked
        // TODO add your handling code here:
        int Codigo;
        int Distancia;
        Lugar Carretera_inicio;
        Lugar Carretera_final;
        Codigo = Integer.parseInt(JTcodigo.getText());
        Distancia = Integer.parseInt(JTDISTANCIA.getText());
        Carretera_inicio = (Lugar)ENTRADA1.getSelectedItem();
        Carretera_final = (Lugar)SALIDA1.getSelectedItem();
        lCarretera.add(new Carretera(Codigo, Distancia, Carretera_inicio, Carretera_final));
        JOptionPane.showMessageDialog(this, "Agrego exitosamente");
        JTcodigo.setText("");
        JTDISTANCIA.setText("");
        ENTRADA1.setSelectedIndex(-1);
        SALIDA1.setSelectedIndex(-1);
    }//GEN-LAST:event_JBOTTONGUARDARCARRETERAMouseClicked

    private void LugarWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LugarWindowActivated
        // TODO add your handling code here:
        if (Lugar.isActive()) {
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Object temp : lCarretera) {
                modelo.addElement(temp);
            }
            JCOMBOENTRADA.setModel(modelo);
            JCOMBOSALIDA.setModel(modelo);
        }
    }//GEN-LAST:event_LugarWindowActivated

    private void MListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MListarActionPerformed
        // TODO add your handling code here:
        Listar.setModal(true);
        Listar.pack();//diseño 
        Listar.setLocationRelativeTo(this);//para el centor
        Listar.setVisible(true);//para que se vea
    }//GEN-LAST:event_MListarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        // TODO add your handling code here:
        
        int Posicion = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese Posicion actual :"));
            
        for (int i = 0; i < lCarretera.size(); i++) {
            if (lCarretera.size()==3){
            }
            
        }
                
                DefaultListModel Modelo = (DefaultListModel) jList_lugares.getModel();
                

        Jlist.setModal(true);
        Jlist.pack();
        Jlist.setLocationRelativeTo(this);
        Jlist.setVisible(true);
//

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void comboopcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboopcionItemStateChanged
        // TODO add your handling code here:
        (if evt.getStateChange()==2){
            if(comboopcion.getSelectedItem().toString().equals("Restaurate")){
                DefaulTableModel modelo = new DefaulTableModel();
                
            }
            
            
        }
            
        
    }//GEN-LAST:event_comboopcionItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Carretera;
    private javax.swing.JComboBox<String> ENTRADA1;
    private javax.swing.JComboBox<String> JBCATEGORIACANCHA;
    private javax.swing.JComboBox<String> JBCOMBORESTAURANTE;
    private javax.swing.JButton JBOTTONGUARDARCARRETERA;
    private javax.swing.JButton JBOTTONLUGAR;
    private javax.swing.JComboBox<String> JCOMBOCALIFICACION;
    private javax.swing.JComboBox<String> JCOMBOENTRADA;
    private javax.swing.JComboBox<String> JCOMBOSALIDA;
    private javax.swing.JComboBox<String> JCOMOESTADO;
    private javax.swing.JMenuItem JMCARRETERA;
    private javax.swing.JMenuItem JMLUGAR;
    private javax.swing.JTextField JTDISTANCIA;
    private javax.swing.JTextArea JTLUGAR;
    private javax.swing.JTextField JTNOMBRE;
    private javax.swing.JTextField JTSEGURIDAD;
    private javax.swing.JTextField JTcodigo;
    private javax.swing.JDialog Jlist;
    private javax.swing.JDialog Listar;
    private javax.swing.JDialog Lugar;
    private javax.swing.JMenuItem MListar;
    private javax.swing.JComboBox<String> SALIDA1;
    private javax.swing.JTabbedPane TABPRINCIPAL;
    private javax.swing.JComboBox<String> comboopcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList_lugares;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    ArrayList lLugar = new ArrayList();
    ArrayList lCarretera = new ArrayList();

}
