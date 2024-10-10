/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author keyle
 */
public class frmFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFactura
     */
    public frmFactura() {
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

        btnFactura = new javax.swing.JButton();

        setClosable(true);
        setTitle("Facturas");

        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Seleccionar Archivo 41x38.jpg"))); // NOI18N
        btnFactura.setText("Seleccionar Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnFactura)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto","txt");
        filechooser.setFileFilter(filtro);
        String ruta = System.getProperty("user.dir");
        ruta = ruta + "\\src\\Archivos" ;
        filechooser.setCurrentDirectory(new File(ruta));
        
        int opcion = filechooser.showOpenDialog(this);
        if ( opcion == JFileChooser.APPROVE_OPTION )
            {
            String rutaarchivo = filechooser.getSelectedFile().getPath();
            
            Runtime aplicacion = Runtime.getRuntime(); 
            try
                { 
                File archivo = new File(rutaarchivo) ;
                if ( archivo.exists() )
                    {
                    aplicacion.exec("C:/Windows/System32/NOTEPAD.EXE "
                                    + archivo
                                   ); 
                    }
                }
            catch(Exception e)
                {}
            }
    }//GEN-LAST:event_btnFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    // End of variables declaration//GEN-END:variables
}
