/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author keyle
 */
public class frmEncomienda extends javax.swing.JInternalFrame {

private ArrayList<Integer> ListaClientes = new ArrayList<Integer>();
    private int CODcliente = 0 ;
    private String Nombre = "" ;
    
private ArrayList<Integer> ListaCODprovincias = new ArrayList<Integer>();
    
    private int CODprovincias = 0 ;
    
    private String DESprovincias = "" ;

private ArrayList<Integer> ListaCODtipopaquete = new ArrayList<Integer>();
private ArrayList<Integer> ListaPrecios = new ArrayList<Integer>();    
    private int CODtipopaquete = 0 ;
    private int Precio = 0 ;
    private int Posicion = 0 ;
    private String DEStipopaquete = "" ;
    private boolean cmbTipopaquetes = false;
    
    
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    private double Peso = 0, SubTotal = 0, Descuento = 0, Total = 0;
    private int NumFactura = 0, Monto = 0;
    
    public frmEncomienda() {
        initComponents();
        
        CargarComboClientes();
        CargarComboProvincias();
        CaragarComboTipoPaquete ();
        
        ModeloTabla.addColumn("Peso");
        ModeloTabla.addColumn("Tipo de Paquete");
        ModeloTabla.addColumn("Precio");
        ModeloTabla.addColumn("Monto");
        tablaEncomienda.setModel(ModeloTabla);
        
        TableColumnModel columnModel = tablaEncomienda.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
        
        
        
        
        
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDestinario = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbProvincia = new javax.swing.JComboBox<>();
        cmbTipoPaquete = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chkCiudadano = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtPesoKilos = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        LbLImagen = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEncomienda = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Facturacion de Encomienda ");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Limpiar 32x32.jpg"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Provincia");

        cmbTipoPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoPaqueteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tipo de Paquete");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Destinario");

        chkCiudadano.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkCiudadano.setText("Ciudadano de Oro");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Peso en Kilos ");

        txtPesoKilos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKilosKeyTyped(evt);
            }
        });

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comprar 46x46.jpg"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        LbLImagen.setBackground(new java.awt.Color(102, 255, 102));
        LbLImagen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LbLImagen.setOpaque(true);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Impresora Gris 46x46.jpg"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Total ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Descuento ");

        tablaEncomienda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEncomienda);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("SubTotal");

        txtSubtotal.setEditable(false);

        txtDescuento.setEditable(false);

        txtTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtDescuento)
                    .addComponent(txtTotal))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chkCiudadano)
                                .addComponent(cmbCliente, 0, 192, Short.MAX_VALUE)
                                .addComponent(cmbProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDestinario)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPesoKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(cmbTipoPaquete, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LbLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCiudadano)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDestinario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTipoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LbLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtPesoKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtPesoKilosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKilosKeyTyped
        char Caracter = evt.getKeyChar();
        if ( !Character.isDigit(Caracter) )
            { evt.consume(); }
    }//GEN-LAST:event_txtPesoKilosKeyTyped

    private void cmbTipoPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoPaqueteActionPerformed
         if ( cmbTipopaquetes == true )
            {
            Posicion = cmbTipoPaquete.getSelectedIndex();
            Precio = ListaPrecios.get(Posicion);            
            }
         CargaImagenTipoPaquete();
        

    
    }//GEN-LAST:event_cmbTipoPaqueteActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (! txtPesoKilos.getText().isEmpty())
            {
            Peso = Integer.parseInt( txtPesoKilos.getText() ) ;    
            Monto  = (int) (Precio * Peso) ;
            
            
            String Fila[] = new String[4];
            Fila[0] = txtPesoKilos.getText();
            Fila[1] = cmbTipoPaquete.getSelectedItem().toString();
            Fila[2] = String.valueOf(Precio);
            Fila[3] = String.valueOf(Monto);
            ModeloTabla.addRow(Fila);
            
           
            SubTotal = SubTotal + Monto ;
            Descuento = 0 ;
            boolean Ciudadanodeoro = chkCiudadano.isSelected();
            if ( Peso >= 10 )
            { 
            Descuento = 5000 ; 
            }
            
            if ( Ciudadanodeoro )
            {
            Descuento = (SubTotal - Descuento) * 0.10;
            }
             
            Total = SubTotal - Descuento ;
            
            txtSubtotal.setText(String.valueOf(SubTotal));
            txtDescuento.setText(String.valueOf(Descuento));
            txtTotal.setText(String.valueOf(Total));
            }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String destinatarioTexto = txtDestinario.getText();
        
        NumFactura = NumFactura + 1 ;

        File archivo = new File("src\\Archivos\\Factura_" + NumFactura + ".txt") ;
        FileWriter escribir  ;  
        PrintWriter linea ;     
        String Texto  ;    
        
        
        if ( archivo.exists() )
            { archivo.delete(); }
        
       
        if ( !archivo.exists() )
            {
            try 
                { archivo.createNewFile(); } 
            catch (IOException ex) 
                { Logger.getLogger(frmProvincias.class.getName()).log(Level.SEVERE, null, ex); }
            }
        
        
        try 
            {
            
            escribir = new FileWriter(archivo,true) ;
            linea = new PrintWriter(escribir);
            
           
            Texto = " ".repeat(20) + "  CACHIFLIN EXPRESS" ;
            linea.println(Texto);
            linea.println("");                    
            LocalDate FechaHoy = LocalDate.now();
            Texto = "Factura: " + NumFactura + " ".repeat(18) + "Fecha: " + FechaHoy ;
            linea.println(Texto);
            Texto = "Cliente: " + cmbCliente.getSelectedItem();
            linea.println(Texto);
            Texto = "Destinario: " + destinatarioTexto;
            linea.println(Texto);
            Texto = "-".repeat(46);
            linea.println(Texto);
            Texto = "Peso   Tipo de Paquete      Precio     Monto";
            linea.println(Texto);
            Texto = "-".repeat(46);
            linea.println(Texto);
            
            
            for (int Fila=0; Fila<ModeloTabla.getRowCount(); Fila++)
                {
                Texto = Espacios( ModeloTabla.getValueAt(Fila, 0).toString() , 10 );
                Texto = Texto + Espacios( ModeloTabla.getValueAt(Fila, 1).toString() , 20 );
                Texto = Texto + Espacios( ModeloTabla.getValueAt(Fila, 2).toString() , 11 );
                Texto = Texto + ModeloTabla.getValueAt(Fila, 3);
                linea.println(Texto);
                }
            
            Texto = "-".repeat(46);
            linea.println(Texto);
            Texto = " ".repeat(29) + "SubTotal  " + SubTotal;
            linea.println(Texto);
            Texto = " ".repeat(29) + "Descuento " + Descuento;
            linea.println(Texto);
            Texto = " ".repeat(29) + "Total     " + Total;
            linea.println(Texto);
            
            
            linea.close();
            escribir.close();
            Limpiar() ;
            }
         catch (IOException ex) 
            {
            Logger.getLogger(frmProvincias.class.getName()).log(Level.SEVERE, null, ex);
            }
         
    }//GEN-LAST:event_btnImprimirActionPerformed
        private String Espacios(String Texto, int Tamanio)
        {
        String Resultado = "" ;
        Resultado = " ".repeat(Tamanio - Texto.length()) ;
        Resultado = Texto + Resultado ;
        
        return Resultado ;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbLImagen;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkCiudadano;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProvincia;
    private javax.swing.JComboBox<String> cmbTipoPaquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEncomienda;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDestinario;
    private javax.swing.JTextField txtPesoKilos;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void CargarComboClientes() {
    File archivo = new File("src\\archivos\\Clientes.txt") ;
        FileReader leer ;   
        BufferedReader almacenamiento ; 
        String Texto  ;     
        try 
            {
            leer = new FileReader(archivo); 
            almacenamiento = new BufferedReader(leer) ;
            
            Texto = "";
            while ( Texto != null )
                {
                try 
                    {
                    Texto = almacenamiento.readLine(); 
                    if ( Texto != null )
                        {
                        SepararValoresClientes(Texto ) ;
                        ListaClientes.add(CODcliente);
                        cmbCliente.addItem(Nombre);
                        }
                    }
                catch (IOException ex) 
                    {
                    Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            try 
                {
                almacenamiento.close();
                leer.close();
                }
            catch (IOException ex) 
                {
                Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        catch (FileNotFoundException ex) 
            {
            Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    private void CargarComboProvincias() {
        File archivo = new File("src\\archivos\\Provincias.txt") ;
        FileReader leer ;   
        BufferedReader almacenamiento ; 
        String Texto  ;   
        try 
            {
            leer = new FileReader(archivo); 
            almacenamiento = new BufferedReader(leer) ;
            
            Texto = "";
            while ( Texto != null )
                {
                try 
                    {
                    Texto = almacenamiento.readLine(); 
                    if ( Texto != null )
                        {
                        SepararValoresProvincias(Texto ) ;
                        ListaCODprovincias.add(CODprovincias);
                        cmbProvincia.addItem(DESprovincias);
                        }
                    }
                catch (IOException ex) 
                    {
                    Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            try 
                {
                almacenamiento.close();
                leer.close();
                }
            catch (IOException ex) 
                {
                Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        catch (FileNotFoundException ex) 
            {
            Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void SepararValoresClientes(String Texto) 
        {
        String Vector[] = Texto.split(",");
        CODcliente = Integer.parseInt(Vector[0]);
        Nombre = Vector[1];
        }
    
    
    private void SepararValoresProvincias(String Texto) 
        {
        String Vector[] = Texto.split(",");
        CODprovincias = Integer.parseInt(Vector[0]);
        DESprovincias = Vector[1];
        }

    private void CaragarComboTipoPaquete() {
     File archivo = new File("src\\archivos\\TipodePaquetes.txt") ;
        FileReader leer ;   
        BufferedReader almacenamiento ; 
        String Texto  ;    
        try 
            {
            leer = new FileReader(archivo); 
            almacenamiento = new BufferedReader(leer) ;
            
            Texto = "";
            while ( Texto != null )
                {
                try 
                    {
                    Texto = almacenamiento.readLine(); 
                    if ( Texto != null )
                        {
                        SepararValoresTipoPaquete(Texto ) ;
                        ListaCODtipopaquete.add(CODtipopaquete);
                        cmbTipoPaquete.addItem(DEStipopaquete);
                        ListaPrecios.add(Precio);
                        }
                    }
                catch (IOException ex) 
                    {
                    Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            try 
                {
                almacenamiento.close();
                leer.close();
                }
            catch (IOException ex) 
                {
                Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        catch (FileNotFoundException ex) 
            {
            Logger.getLogger(frmEncomienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        cmbTipopaquetes = true;
        CargaImagenTipoPaquete();
    }
   
      
    private void SepararValoresTipoPaquete(String Texto) 
        {
        String Vector[] = Texto.split(",");
        CODtipopaquete = Integer.parseInt(Vector[0]);
        DEStipopaquete = Vector[1];
        Precio = Integer.parseInt(Vector[2]);
        }
    
    
    private void Limpiar () {
        
    txtDescuento.setText("");
    txtDestinario.setText("");
    txtPesoKilos.setText("");
    txtSubtotal.setText("");
    txtTotal.setText("");
    
    SubTotal = 0;
    Descuento = 0;
    Total = 0;
    
    ModeloTabla.setRowCount(0);
    cmbCliente.requestFocus();
    
    
    
    
    
    cmbCliente.requestFocus();
    
    
    
    }
    
    private void CargaImagenTipoPaquete()
        {
        String RutaImagenTipoPaquete = "src\\Imagenes\\" + cmbTipoPaquete.getSelectedItem() + ".jpeg" ;
        LbLImagen.setIcon(new ImageIcon(RutaImagenTipoPaquete));
        }

    
       
}
