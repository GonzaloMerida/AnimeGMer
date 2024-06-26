/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package main.java;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gonzalo
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }, scanBasePackages = "main.java")
public class AnimeScreen extends javax.swing.JFrame implements CommandLineRunner {

    @Autowired
    private AnimeRepository animeRepository;

    /**
     * Creates new form AnimeScreen
     */
    
    
    public AnimeScreen() {
        initComponents();
        initDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAnimes = new javax.swing.JPanel();
        jTextFieldBuscador = new javax.swing.JTextField();
        jLabelBuscador = new javax.swing.JLabel();
        jButtonFilter = new javax.swing.JButton();
        jButtonAddToFav = new javax.swing.JButton();
        jButtonDeleteFav = new javax.swing.JButton();
        jButtonAddToPends = new javax.swing.JButton();
        jButtonDeletePend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAnimes = new javax.swing.JTable();
        jPanelMenuButtons = new javax.swing.JPanel();
        jButtonGoToPends = new javax.swing.JButton();
        jButtonGoToFavs = new javax.swing.JButton();
        jButtonGoToGeneral = new javax.swing.JButton();
        jButtonGoToDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAnimes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelAnimes.add(jTextFieldBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 386, 20));

        jLabelBuscador.setText("Buscador:");
        jPanelAnimes.add(jLabelBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 99, 20));

        jButtonFilter.setText("Filtrar");
        jPanelAnimes.add(jButtonFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        jButtonAddToFav.setText("Añadir a Favoritos");
        jPanelAnimes.add(jButtonAddToFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jButtonDeleteFav.setText("Borrar de favorirtos");
        jPanelAnimes.add(jButtonDeleteFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        jButtonAddToPends.setText("Añadir a pendientes");
        jPanelAnimes.add(jButtonAddToPends, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, -1));

        jButtonDeletePend.setText("Eliminar de pendientes");
        jPanelAnimes.add(jButtonDeletePend, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, -1));

        jTableAnimes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableAnimes);

        jPanelAnimes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 790, 490));

        getContentPane().add(jPanelAnimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 840, 660));

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
        SpringApplication.run(AnimeScreen.class, args);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToFav;
    private javax.swing.JButton jButtonAddToPends;
    private javax.swing.JButton jButtonDeleteFav;
    private javax.swing.JButton jButtonDeletePend;
    private javax.swing.JButton jButtonFilter;
    private javax.swing.JButton jButtonGoToDetails;
    private javax.swing.JButton jButtonGoToFavs;
    private javax.swing.JButton jButtonGoToGeneral;
    private javax.swing.JButton jButtonGoToPends;
    private javax.swing.JLabel jLabelBuscador;
    private javax.swing.JPanel jPanelAnimes;
    private javax.swing.JPanel jPanelMenuButtons;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAnimes;
    private javax.swing.JTextField jTextFieldBuscador;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run(String... args) throws Exception {
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    private void createRegisters() {
        String fechaStr1 = "2013-04-07";
        String fechaStr2 = "2006-10-04";
        String fechaStr3 = "2016-04-03";
        String fechaStr4 = "2002-10-03";
        String fechaStr5 = "1999-10-20";
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        try {
            java.util.Date fechaUtil1 = formato.parse(fechaStr1);
            java.util.Date fechaUtil2 = formato.parse(fechaStr2);
            java.util.Date fechaUtil3 = formato.parse(fechaStr3);
            java.util.Date fechaUtil4 = formato.parse(fechaStr4);
            java.util.Date fechaUtil5 = formato.parse(fechaStr5);

            Date fechaSQL1 = new Date(fechaUtil1.getTime());
            Date fechaSQL2 = new Date(fechaUtil2.getTime());
            Date fechaSQL3 = new Date(fechaUtil3.getTime());
            Date fechaSQL4 = new Date(fechaUtil4.getTime());
            Date fechaSQL5 = new Date(fechaUtil5.getTime());

            Anime anime1 = new Anime("Attack on titan", "Action, Drama, Fantasy", fechaSQL1, 94, "Wit Studio", "La humanidad lucha contra titanes gigantes por su supervivencia", 9.0, null, false, false);
            Anime anime2 = new Anime("Death Note", "Mystery, Psychological, Supernatural", fechaSQL2, 37, "Madhouse", "A high school student discovers a supernatural notebook that allows him to kill anyone whose name he writes in it.", 8.5, null, false, false);
            Anime anime3 = new Anime("My Hero Academia", "Action, Comedy, Super Power", fechaSQL3, 138, "Bones", "In a world where people with superpowers are the norm, a boy without powers enrolls in a prestigious hero academy.", 8.7, null, false, false);
            Anime anime4 = new Anime("Naruto", "Action, Adventure, Martial Arts", fechaSQL4, 720, "Studio Pierrot", "Naruto Uzumaki, a young ninja with a dream of becoming the strongest ninja and leader of his village, embarks on a journey of self-discovery and friendship.", 8.3, null, false, false);
            Anime anime5 = new Anime("One Piece", "Action, Adventure, Comedy", fechaSQL5, 1101, "Toei Animation", "Monkey D. Luffy sets out on a quest to find the legendary treasure known as One Piece, encountering powerful foes and forming a diverse crew of pirates along the way.", 8.7, null, false, false);

            animeRepository.saveAll(List.of(anime1, anime2, anime3, anime4, anime5));

        } catch (ParseException ex) {
            Logger.getLogger(AnimeScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addAnimesToTable() {
        List<Anime> animes = animeRepository.findAll();
        jTableAnimes.setModel(new AnimeTableModel(animes));

        int index = 0;
        for (Anime an : animes) {
            ((AnimeTableModel) jTableAnimes.getModel()).add(an, index);
        }
    }

    private void initDB() {
        createRegisters();
        addAnimesToTable();

    }
}
