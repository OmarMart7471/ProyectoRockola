package rockola;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MENU extends javax.swing.JFrame {
    
    private ConsultaCancion CC;
    private List<Cancion> resultados;
    private Cancion cancionActual;
    DefaultTableModel tabla = new DefaultTableModel();
    int filas;
    private ResultSet conjuntoCancion;
    public MENU() {
        initComponents();
        CC = new ConsultaCancion();
        filas = tabla.getRowCount();
        for(int i=filas-1;i>=0;i--){
            tabla.removeRow(i);}
        tabla.addColumn("ID");        
        tabla.addColumn("Nombre");        
        tabla.addColumn("Artista");        
        tabla.addColumn("Album");        
        tabla.addColumn("Año");        
        tabla.addColumn("Genero");        
        tabla.addColumn("Duracion");        
        this.jTable1.setModel(tabla);
        cargarCanciones();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ComboBoxAnio = new javax.swing.JComboBox<>();
        ID = new javax.swing.JTextField();
        CNOMBRE = new javax.swing.JTextField();
        CARTISTA = new javax.swing.JTextField();
        CALBUM = new javax.swing.JTextField();
        CGENERO = new javax.swing.JTextField();
        CDURACION = new javax.swing.JTextField();
        GUARDAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        CERRAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BotonXTodas = new javax.swing.JButton();
        BotonXGenero = new javax.swing.JButton();
        BotonXAnio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        CAMxAnio = new javax.swing.JTextField();
        BUSCARXNOMBRE = new javax.swing.JButton();
        BUSCARXANIO = new javax.swing.JButton();
        CAMPOBUSCARPORNOMBRE = new javax.swing.JTextField();
        BUSCARCANCION = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("XD");

        jLabel2.setText("NUEVA CANCION");

        jLabel3.setText("ID");

        jLabel4.setText("NOMBRE");

        jLabel5.setText("ARTISTA");

        jLabel6.setText("ALBUM");

        jLabel7.setText("AÑO");

        jLabel8.setText("GENERO");

        jLabel9.setText("DURACION");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "ARTISTA", "ALBUM", "AÑO", "GENERO", "DURACION"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));
        ComboBoxAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAnioActionPerformed(evt);
            }
        });

        ID.setEnabled(false);

        GUARDAR.setText("GUARDAR");
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });

        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        CERRAR.setText("CERRAR");
        CERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARActionPerformed(evt);
            }
        });

        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        BotonXTodas.setText("TODAS");
        BotonXTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXTodasActionPerformed(evt);
            }
        });

        BotonXGenero.setText("GENERO");
        BotonXGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXGeneroActionPerformed(evt);
            }
        });

        BotonXAnio.setText("DURACION");
        BotonXAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXAnioActionPerformed(evt);
            }
        });

        jLabel10.setText("ARTISTA");

        jLabel11.setText("AÑO");

        BUSCARXNOMBRE.setText("BUSCAR");
        BUSCARXNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARXNOMBREActionPerformed(evt);
            }
        });

        BUSCARXANIO.setText("BUSCAR");
        BUSCARXANIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARXANIOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonXAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonXGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonXTodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(CAMxAnio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BUSCARXNOMBRE, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BUSCARXANIO, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonXTodas)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCARXNOMBRE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonXGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonXAnio)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(CAMxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BUSCARXANIO)))
                .addContainerGap())
        );

        CAMPOBUSCARPORNOMBRE.setText("INGRESE EL NOMBRE");

        BUSCARCANCION.setText("BUSCAR");
        BUSCARCANCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARCANCIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CDURACION)
                            .addComponent(CGENERO)
                            .addComponent(ComboBoxAnio, 0, 143, Short.MAX_VALUE)
                            .addComponent(CALBUM)
                            .addComponent(CARTISTA)
                            .addComponent(CNOMBRE)
                            .addComponent(ID))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(GUARDAR)
                            .addGap(55, 55, 55)
                            .addComponent(LIMPIAR))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(CAMPOBUSCARPORNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BUSCARCANCION))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(ELIMINAR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ACTUALIZAR)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(CERRAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CARTISTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CALBUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CGENERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(CDURACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GUARDAR)
                            .addComponent(LIMPIAR))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CAMPOBUSCARPORNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUSCARCANCION))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ELIMINAR)
                            .addComponent(ACTUALIZAR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CERRAR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUSCARCANCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARCANCIONActionPerformed
        resultados = CC.encontrarCancion(CAMPOBUSCARPORNOMBRE.getText());
        if(resultados.size()!=0){
            JOptionPane.showMessageDialog(this, "Se encontro la cancion");
            cancionActual = resultados.get(0);
            ID.setText(""+cancionActual.getIdCancion());
            CNOMBRE.setText(cancionActual.getNombreCancion());
            CARTISTA.setText(cancionActual.getArtistaCancion());
            CALBUM.setText(cancionActual.getAlbumCancion());
            ComboBoxAnio.setSelectedItem(""+cancionActual.getYearCancion());
            CGENERO.setText(cancionActual.getGeneroCancion());
            CDURACION.setText(cancionActual.getDuracionCancion());
        }else{
            JOptionPane.showMessageDialog(this, "No se encontro la cancion");
        }
    }//GEN-LAST:event_BUSCARCANCIONActionPerformed

    private void BotonXAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXAnioActionPerformed
        cargarCancionesPorDuracion();
    }//GEN-LAST:event_BotonXAnioActionPerformed

    private void BotonXGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXGeneroActionPerformed
        cargarCancionesPorGenero();
    }//GEN-LAST:event_BotonXGeneroActionPerformed

    private void BotonXTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXTodasActionPerformed
        cargarCanciones();
    }//GEN-LAST:event_BotonXTodasActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        
        if(CNOMBRE.getText().isEmpty()||CARTISTA.getText().isEmpty()||CALBUM.getText().isEmpty()||CGENERO.getText().isEmpty()||CDURACION.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Ingrese todos los datos");
        }else{
            int resultado = CC.modificarCancion(ID.getText(), CNOMBRE.getText(), CARTISTA.getText(), CALBUM.getText(), ComboBoxAnio.getSelectedItem().toString(), CGENERO.getText(), CDURACION.getText());
        if(resultado == 1){
            JOptionPane.showMessageDialog(this, "Se actualizo correctamente");
            cargarCanciones();
        }else{
            JOptionPane.showMessageDialog(this, "No se actualizo correctamente");
        }
        }       
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void CERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERRARActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CERRARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        int resultado = CC.borrarCancion(ID.getText());
        if(resultado==1){
            JOptionPane.showMessageDialog(this, "Se elimino exitosamente");
            ID.setText("");
            CNOMBRE.setText("");
            CARTISTA.setText("");
            CALBUM.setText("");
            CGENERO.setText("");
            CDURACION.setText("");
            ComboBoxAnio.setSelectedItem("1970");
            cargarCanciones();
        }else{
            JOptionPane.showMessageDialog(this, "No se elimino");
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        ID.setText("");
        CNOMBRE.setText("");
        CARTISTA.setText("");
        CALBUM.setText("");
        CGENERO.setText("");
        CDURACION.setText("");
        ComboBoxAnio.setSelectedItem("1970");
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        
        
        if(CNOMBRE.getText().isEmpty() || CARTISTA.getText().isEmpty()||CALBUM.getText().isEmpty()||CGENERO.getText().isEmpty()||CDURACION.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Ingrese todos los datos");
        }else{
            int resultado = CC.agregarCancion(CNOMBRE.getText(), CARTISTA.getText(), CALBUM.getText(),ComboBoxAnio.getSelectedItem().toString(),CGENERO.getText(),CDURACION.getText());
        if(resultado == 1){
            JOptionPane.showMessageDialog(this, "Se agrego una cancion");
            ID.setText("");
            CNOMBRE.setText("");
            CARTISTA.setText("");
            CALBUM.setText("");
            CGENERO.setText("");
            CDURACION.setText("");
            ComboBoxAnio.setSelectedItem("1970");
            cargarCanciones();}
        else
        JOptionPane.showMessageDialog(this, "No se pudo agregar la cancion");
        }
    }//GEN-LAST:event_GUARDARActionPerformed

    private void BUSCARXNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARXNOMBREActionPerformed
            conjuntoCancion = CC.encontrarCancionArtista(jTextField7.getText());
            filas = tabla.getRowCount();
            for(int i=filas-1; i>=0;i--){
                tabla.removeRow(i);
            }
        try{
            while(conjuntoCancion.next()){
                Object dato[] = new Object[7];
                for(int i=0; i<7;i++){
                    dato[0]=conjuntoCancion.getString("IdCancion");
                    dato[1]=conjuntoCancion.getString("nombre");
                    dato[2]=conjuntoCancion.getString("artista");
                    dato[3]=conjuntoCancion.getString("album");
                    dato[4]=conjuntoCancion.getString("year");
                    dato[5]=conjuntoCancion.getString("genero");
                    dato[6]=conjuntoCancion.getString("duracion");
                    
                }tabla.addRow(dato);
                jTextField7.setText("");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_BUSCARXNOMBREActionPerformed

    private void BUSCARXANIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARXANIOActionPerformed
        conjuntoCancion = CC.encontrarCancionYear(CAMxAnio.getText());
        filas = tabla.getRowCount();
        for(int i=filas-1; i>=0; i--){
            tabla.removeRow(i);
        }
        try{
            while(conjuntoCancion.next()){
                Object dato[] = new Object[7];
                for(int i =0; i<7;i++){
                    dato[0]=conjuntoCancion.getString("IdCancion");
                    dato[1]=conjuntoCancion.getString("nombre");
                    dato[2]=conjuntoCancion.getString("artista");
                    dato[3]=conjuntoCancion.getString("album");
                    dato[4]=conjuntoCancion.getString("year");
                    dato[5]=conjuntoCancion.getString("genero");
                    dato[6]=conjuntoCancion.getString("duracion"); 
                }
                tabla.addRow(dato);
                CAMxAnio.setText("");
            }
        }catch(SQLException e){
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_BUSCARXANIOActionPerformed

    private void ComboBoxAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAnioActionPerformed
    
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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }
    
    public void cargarCanciones(){
        
        try{
            filas=tabla.getRowCount();
            for(int i =filas-1;i>=0;i--){
                tabla.removeRow(i);
            }
            CallableStatement cts = CC.conexion.prepareCall("SELECT * FROM Cancion");
            ResultSet r = cts.executeQuery();
            
            while(r.next()){
                Object dato[] = new Object[7];
                for(int i=0; i < 7;i++){
                    dato[i]=r.getString(i+1);
                }
                tabla.addRow(dato);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void cargarCancionesPorGenero(){
        
        try{
            filas=tabla.getRowCount();
            for(int i =filas-1;i>=0;i--){
                tabla.removeRow(i);
            }
            CallableStatement cts = CC.conexion.prepareCall("SELECT * FROM Cancion ORDER BY genero ASC");
            ResultSet r = cts.executeQuery();
            
            while(r.next()){
                Object dato[] = new Object[7];
                for(int i=0; i < 7;i++){
                    dato[i]=r.getString(i+1);
                }
                tabla.addRow(dato);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    
    public void cargarCancionesPorDuracion(){
        
        try{
            filas=tabla.getRowCount();
            for(int i =filas-1;i>=0;i--){
                tabla.removeRow(i);
            }
            CallableStatement cts = CC.conexion.prepareCall("SELECT * FROM Cancion ORDER BY duracion ASC");
            ResultSet r = cts.executeQuery();
            
            while(r.next()){
                Object dato[] = new Object[7];
                for(int i=0; i < 7;i++){
                    dato[i]=r.getString(i+1);
                }
                tabla.addRow(dato);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton BUSCARCANCION;
    private javax.swing.JButton BUSCARXANIO;
    private javax.swing.JButton BUSCARXNOMBRE;
    private javax.swing.JButton BotonXAnio;
    private javax.swing.JButton BotonXGenero;
    private javax.swing.JButton BotonXTodas;
    private javax.swing.JTextField CALBUM;
    private javax.swing.JTextField CAMPOBUSCARPORNOMBRE;
    private javax.swing.JTextField CAMxAnio;
    private javax.swing.JTextField CARTISTA;
    private javax.swing.JTextField CDURACION;
    private javax.swing.JButton CERRAR;
    private javax.swing.JTextField CGENERO;
    private javax.swing.JTextField CNOMBRE;
    private javax.swing.JComboBox<String> ComboBoxAnio;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JTextField ID;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
