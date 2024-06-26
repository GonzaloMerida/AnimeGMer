/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package main.java;

/**
 *
 * @author Gonzalo
 */
public class FavoriteScreen extends javax.swing.JDialog {

    /**
     * Creates new form FavoriteScreen
     */
    public FavoriteScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanelFavorites = new javax.swing.JPanel();
        jLabelFavorites = new javax.swing.JLabel();
        jButtonDeleteFromFav = new javax.swing.JButton();
        jButtonComment = new javax.swing.JButton();
        jButtonRating = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelMenuButtons = new javax.swing.JPanel();
        jButtonGoToPends = new javax.swing.JButton();
        jButtonGoToFavs = new javax.swing.JButton();
        jButtonGoToGeneral = new javax.swing.JButton();
        jButtonGoToDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFavorites.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFavorites.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelFavorites.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFavorites.setText("MIS FAVORITOS");
        jPanelFavorites.add(jLabelFavorites, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 16, 379, 32));

        jButtonDeleteFromFav.setText("Eliminar de mis favoritos");
        jPanelFavorites.add(jButtonDeleteFromFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, 33));

        jButtonComment.setText("Modificar comentario");
        jPanelFavorites.add(jButtonComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 159, 33));

        jButtonRating.setText("Modificar puntuación");
        jPanelFavorites.add(jButtonRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, 33));

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

        jPanelFavorites.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 810, -1));

        getContentPane().add(jPanelFavorites, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 880, 580));

        jPanelMenuButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGoToPends.setText("Ver pendientes");
        jButtonGoToPends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoToPendsActionPerformed(evt);
            }
        });
        jPanelMenuButtons.add(jButtonGoToPends, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 152, 41));

        jButtonGoToFavs.setText("Ver mis favoritos");
        jPanelMenuButtons.add(jButtonGoToFavs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 152, 41));

        jButtonGoToGeneral.setText("Ver todos");
        jPanelMenuButtons.add(jButtonGoToGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 152, 41));

        jButtonGoToDetails.setText("Ver detalles");
        jPanelMenuButtons.add(jButtonGoToDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 152, 41));

        getContentPane().add(jPanelMenuButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGoToPendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoToPendsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGoToPendsActionPerformed

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
            java.util.logging.Logger.getLogger(FavoriteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FavoriteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FavoriteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FavoriteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FavoriteScreen dialog = new FavoriteScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComment;
    private javax.swing.JButton jButtonDeleteFromFav;
    private javax.swing.JButton jButtonGoToDetails;
    private javax.swing.JButton jButtonGoToFavs;
    private javax.swing.JButton jButtonGoToGeneral;
    private javax.swing.JButton jButtonGoToPends;
    private javax.swing.JButton jButtonRating;
    private javax.swing.JLabel jLabelFavorites;
    private javax.swing.JPanel jPanelFavorites;
    private javax.swing.JPanel jPanelMenuButtons;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
