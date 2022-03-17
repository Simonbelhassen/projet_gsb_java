/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Entity.User;
import Tools.ConnexionBDD;
import Tools.FonctionsMetier;
import javax.swing.JOptionPane;

/**
 *
 * @author dimmi
 */
public class FrmPageAccueil extends javax.swing.JFrame 
{
    FonctionsMetier fm = new FonctionsMetier();
    /**
     * Creates new form PageAccueil
     */
    public FrmPageAccueil() {
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

        jPanel1 = new javax.swing.JPanel();
        titre1 = new javax.swing.JLabel();
        titre2 = new javax.swing.JLabel();
        txtPAId = new javax.swing.JTextField();
        titre3 = new javax.swing.JLabel();
        txtPAMdp = new javax.swing.JTextField();
        btnPAConnecter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titre1.setBackground(new java.awt.Color(255, 51, 51));
        titre1.setFont(new java.awt.Font("New Peninim MT", 1, 48)); // NOI18N
        titre1.setForeground(new java.awt.Color(102, 102, 255));
        titre1.setToolTipText("");

        titre2.setBackground(new java.awt.Color(255, 51, 51));
        titre2.setFont(new java.awt.Font("New Peninim MT", 1, 190)); // NOI18N
        titre2.setText("GSB");
        titre2.setToolTipText("");

        txtPAId.setBackground(new java.awt.Color(204, 204, 204));
        txtPAId.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        txtPAId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPAId.setText("Identifiant");

        titre3.setBackground(new java.awt.Color(255, 51, 51));
        titre3.setFont(new java.awt.Font("New Peninim MT", 1, 190)); // NOI18N
        titre3.setForeground(new java.awt.Color(102, 0, 102));
        titre3.setText(".");
        titre3.setToolTipText("");

        txtPAMdp.setBackground(new java.awt.Color(204, 204, 204));
        txtPAMdp.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        txtPAMdp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPAMdp.setText("Mot de Passe");

        btnPAConnecter.setBackground(new java.awt.Color(0, 0, 0));
        btnPAConnecter.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btnPAConnecter.setForeground(new java.awt.Color(255, 255, 255));
        btnPAConnecter.setText("Se Connecter");
        btnPAConnecter.setToolTipText("");
        btnPAConnecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPAConnecterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titre1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2109, 2109, 2109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPAMdp, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(txtPAId)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(titre2)
                        .addGap(3, 3, 3)
                        .addComponent(titre3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnPAConnecter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titre2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titre3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPAId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPAMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPAConnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPAConnecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPAConnecterMouseClicked
        // TODO add your handling code here:
        if(txtPAId.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "Vous devez saisir un identifiant!!!", "ATTENTION", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPAMdp.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "Vous devez saisir un mot de passe!!!", "ATTENTION", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            User unUser = fm.GetUnUser(txtPAId.getText(), txtPAMdp.getText());
            if(unUser == null)
            {
                JOptionPane.showMessageDialog(this, "Identifiants incorrects", "INFOS", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                
                FrmPageRegionDefault frm = new FrmPageRegionDefault();
                frm.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnPAConnecterMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ConnexionBDD cnx = new ConnexionBDD();
        fm = new FonctionsMetier();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmPageAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPageAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPageAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPageAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPageAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPAConnecter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titre1;
    private javax.swing.JLabel titre2;
    private javax.swing.JLabel titre3;
    private javax.swing.JTextField txtPAId;
    private javax.swing.JTextField txtPAMdp;
    // End of variables declaration//GEN-END:variables
}
