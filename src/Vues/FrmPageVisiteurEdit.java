/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.Laboratoire;
import Entity.Secteur;
import Entity.Visiteur;
import Tools.FonctionsMetier;
import javax.swing.JOptionPane;

/**
 *
 * @author simonbelhassen
 */
public class FrmPageVisiteurEdit extends javax.swing.JFrame {

    FonctionsMetier fm = new FonctionsMetier();
    
    static String numMatricule;
    
    public FrmPageVisiteurEdit(String codeMatricule) {
        initComponents();
        numMatricule = codeMatricule;
    }

    private FrmPageVisiteurEdit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jSeparator1 = new javax.swing.JSeparator();
        btnPVESauvegarderModifs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPVENom = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPVEAdresse = new javax.swing.JTextField();
        txtPVEVille = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboPVENomSec = new javax.swing.JComboBox<>();
        cboPVENomLab = new javax.swing.JComboBox<>();
        txtPVEPrenom = new javax.swing.JTextField();
        txtPVECodeMatricule = new javax.swing.JTextField();
        jCalendarPVEDateEmbauche = new com.toedter.calendar.JCalendar();
        txtPVECodePostal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 500));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        btnPVESauvegarderModifs.setBackground(new java.awt.Color(102, 255, 51));
        btnPVESauvegarderModifs.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnPVESauvegarderModifs.setForeground(new java.awt.Color(255, 255, 255));
        btnPVESauvegarderModifs.setText("Sauvegarder les modifications");
        btnPVESauvegarderModifs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPVESauvegarderModifsMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Nom :");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Code Matricule :");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setText("Prénom :");
        jLabel3.setToolTipText("");

        txtPVENom.setEditable(false);
        txtPVENom.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setText("Adresse :");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setText("Ville :");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setText("Code Postal :");
        jLabel6.setToolTipText("");

        txtPVEAdresse.setEditable(false);
        txtPVEAdresse.setBackground(new java.awt.Color(153, 153, 153));

        txtPVEVille.setEditable(false);
        txtPVEVille.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel7.setText("Nom Laboratoire :");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setText("Date d'embauche :");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel9.setText("Nom Secteur :");
        jLabel9.setToolTipText("");

        txtPVEPrenom.setEditable(false);
        txtPVEPrenom.setBackground(new java.awt.Color(153, 153, 153));

        txtPVECodeMatricule.setEditable(false);
        txtPVECodeMatricule.setBackground(new java.awt.Color(153, 153, 153));

        jCalendarPVEDateEmbauche.setBackground(new java.awt.Color(204, 204, 255));
        jCalendarPVEDateEmbauche.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        txtPVECodePostal.setEditable(false);
        txtPVECodePostal.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPVECodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPVEVille, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPVEAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPVECodeMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPVENom, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPVEPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCalendarPVEDateEmbauche, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboPVENomSec, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cboPVENomLab, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPVESauvegarderModifs, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPVENom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPVEPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPVECodeMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(txtPVEAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPVEVille, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPVECodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboPVENomSec, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPVENomLab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(btnPVESauvegarderModifs, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCalendarPVEDateEmbauche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        txtPVECodeMatricule.setText(numMatricule);
        
        for(Secteur sec : fm.GetAllSecteurs())
        {
            String b = sec.getSecCode() + " -- " + sec.getSecNom();
            cboPVENomSec.addItem(b);
        }
        
        for(Laboratoire lab : fm.GetAllLaboratoires())
        {
            String b = lab.getLabCode() + " -- " + lab.getLabNom();
            cboPVENomLab.addItem(b);
        }
        
        Visiteur unVisiteur = fm.GetUnVisiteur(Integer.parseInt(numMatricule));
        
     
        
        if(unVisiteur == null)
        {
            JOptionPane.showMessageDialog(this, "Identifiants incorrects", "INFOS", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "OK", "INFOS", JOptionPane.INFORMATION_MESSAGE);
            txtPVENom.setText(unVisiteur.getVisNom());
            txtPVEPrenom.setText(unVisiteur.getVisPrenom());
            txtPVEAdresse.setText(unVisiteur.getVisAdresse());
            txtPVECodePostal.setText(String.valueOf(unVisiteur.getVisCodePostal()));
            txtPVEVille.setText(unVisiteur.getVisVille()); 
        }
        
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnPVESauvegarderModifsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPVESauvegarderModifsMouseClicked
        // TODO add your handling code here:
        
        fm = new FonctionsMetier();
        
        String matricule = txtPVECodeMatricule.getText();
        String nom = txtPVENom.getText();
        String prenom = txtPVEPrenom.getText();
        String adresse = txtPVEAdresse.getText();
        String codePostal = txtPVECodePostal.getText();
        String ville = txtPVEVille.getText();
        
        
        int year = jCalendarPVEDateEmbauche.getYearChooser().getYear();
        int month = jCalendarPVEDateEmbauche.getMonthChooser().getMonth() + 1;
        int day = jCalendarPVEDateEmbauche.getDayChooser().getDay();
        
        String formatDate = String.valueOf(year) + "-" + String.valueOf(month) + "-" + String.valueOf(day);
        
//        for (Secteur sec : fm.GetAllSecteurs()) 
//        {
//            String b = sec.getSecCode() + " -- " + sec.getSecNom();
//            cboPVENomSec.addItem(b);
//        }
//        
//        for (Laboratoire lab : fm.GetAllLaboratoires()) 
//        {
//            String b = lab.getLabCode() + " -- " + lab.getLabNom();
//            cboPVENomLab.addItem(b);
//        }
        
        String aa = cboPVENomSec.getSelectedItem().toString();
        String[] sec = aa.split(" -- ");
        
        String bb = cboPVENomLab.getSelectedItem().toString();
        String[] lab = bb.split(" -- ");
        
//        JOptionPane.showMessageDialog(this, Integer.parseInt(matricule));
//        JOptionPane.showMessageDialog(this, nom);
//        JOptionPane.showMessageDialog(this, prenom);
//        JOptionPane.showMessageDialog(this, adresse);
//        JOptionPane.showMessageDialog(this, Integer.parseInt(codePostal));
//        JOptionPane.showMessageDialog(this, ville);
//        JOptionPane.showMessageDialog(this, formatDate);
//        JOptionPane.showMessageDialog(this, Integer.parseInt(sec[0]));
//        JOptionPane.showMessageDialog(this, Integer.parseInt(lab[0]));
        
        fm.ModifierVisiteur(Integer.parseInt(matricule), nom, prenom, adresse, Integer.parseInt(codePostal), ville, formatDate, Integer.parseInt(sec[0]), Integer.parseInt(lab[0]));
        JOptionPane.showMessageDialog(this, "La requette a marcher. Donc va verifier la bdd. OK");
       
        FrmPageVisiteurDefault frm = new FrmPageVisiteurDefault();
        frm.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnPVESauvegarderModifsMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPageVisiteurEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPageVisiteurEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPageVisiteurEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPageVisiteurEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPageVisiteurEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPVESauvegarderModifs;
    private javax.swing.JComboBox<String> cboPVENomLab;
    private javax.swing.JComboBox<String> cboPVENomSec;
    private com.toedter.calendar.JCalendar jCalendarPVEDateEmbauche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtPVEAdresse;
    private javax.swing.JTextField txtPVECodeMatricule;
    private javax.swing.JTextField txtPVECodePostal;
    private javax.swing.JTextField txtPVENom;
    private javax.swing.JTextField txtPVEPrenom;
    private javax.swing.JTextField txtPVEVille;
    // End of variables declaration//GEN-END:variables
}
