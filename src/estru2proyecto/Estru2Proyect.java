/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estru2proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class Estru2Proyect extends javax.swing.JFrame {

    /**
     * Creates new form Estru2Proyect
     */
    public Estru2Proyect() {
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

        jd_Archivos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jb_Archivos1 = new javax.swing.JButton();
        jb_Campos1 = new javax.swing.JButton();
        jb_Registros1 = new javax.swing.JButton();
        jb_Indices1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jb_Archivos = new javax.swing.JButton();
        jb_Campos = new javax.swing.JButton();
        jb_Registros = new javax.swing.JButton();
        jb_Indices = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jb_Archivos1.setText("Nuevo Archivo");
        jb_Archivos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_Archivos1MouseClicked(evt);
            }
        });
        jb_Archivos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Archivos1ActionPerformed(evt);
            }
        });
        jb_Archivos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb_Archivos1KeyPressed(evt);
            }
        });

        jb_Campos1.setText("Campos");

        jb_Registros1.setText("Registros");

        jb_Indices1.setText("Indices");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_Archivos1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Campos1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Registros1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Indices1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(277, 277, 277))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jb_Archivos1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Campos1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Registros1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Indices1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout jd_ArchivosLayout = new javax.swing.GroupLayout(jd_Archivos.getContentPane());
        jd_Archivos.getContentPane().setLayout(jd_ArchivosLayout);
        jd_ArchivosLayout.setHorizontalGroup(
            jd_ArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ArchivosLayout.setVerticalGroup(
            jd_ArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Estru II");

        jPanel1.setBackground(new java.awt.Color(175, 175, 255));

        jb_Archivos.setBackground(new java.awt.Color(125, 125, 241));
        jb_Archivos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jb_Archivos.setForeground(new java.awt.Color(22, 22, 79));
        jb_Archivos.setText("Archivos");
        jb_Archivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ArchivosMouseClicked(evt);
            }
        });
        jb_Archivos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb_ArchivosKeyPressed(evt);
            }
        });

        jb_Campos.setBackground(new java.awt.Color(125, 125, 241));
        jb_Campos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jb_Campos.setForeground(new java.awt.Color(22, 22, 79));
        jb_Campos.setText("Campos");

        jb_Registros.setBackground(new java.awt.Color(125, 125, 241));
        jb_Registros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jb_Registros.setForeground(new java.awt.Color(22, 22, 79));
        jb_Registros.setText("Registros");

        jb_Indices.setBackground(new java.awt.Color(125, 125, 241));
        jb_Indices.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jb_Indices.setForeground(new java.awt.Color(22, 22, 79));
        jb_Indices.setText("Indices");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_Archivos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Campos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Indices, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(298, 298, 298))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_Archivos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Campos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Indices, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_Archivos1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb_Archivos1KeyPressed
        
    }//GEN-LAST:event_jb_Archivos1KeyPressed

    private void jb_Archivos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Archivos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_Archivos1ActionPerformed

    private void jb_Archivos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_Archivos1MouseClicked
        String nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        try {
            File archivo = new File(nombreArchivo + ".est");

            FileWriter escritor = new FileWriter(archivo);
            escritor.write("¡Hola, mundo!");
            escritor.close(); 

        } catch (IOException e) {
        }
        
        
    }//GEN-LAST:event_jb_Archivos1MouseClicked

    private void jb_ArchivosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb_ArchivosKeyPressed

    }//GEN-LAST:event_jb_ArchivosKeyPressed

    private void jb_ArchivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ArchivosMouseClicked
        this.setVisible(false);
        jd_Archivos.setModal(true);
        jd_Archivos.pack();
        jd_Archivos.setLocationRelativeTo(this);
        jd_Archivos.setVisible(true);
    }//GEN-LAST:event_jb_ArchivosMouseClicked

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
            java.util.logging.Logger.getLogger(Estru2Proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estru2Proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estru2Proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estru2Proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estru2Proyect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_Archivos;
    private javax.swing.JButton jb_Archivos1;
    private javax.swing.JButton jb_Campos;
    private javax.swing.JButton jb_Campos1;
    private javax.swing.JButton jb_Indices;
    private javax.swing.JButton jb_Indices1;
    private javax.swing.JButton jb_Registros;
    private javax.swing.JButton jb_Registros1;
    private javax.swing.JDialog jd_Archivos;
    // End of variables declaration//GEN-END:variables
}
