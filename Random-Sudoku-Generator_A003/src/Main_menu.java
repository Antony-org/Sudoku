
import java.awt.Color;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali Hassan
 */
public class Main_menu extends javax.swing.JFrame {

    /**
     * Creates new form Main_menu
     */
    public Main_menu() {
        this.getContentPane().setBackground(Color.WHITE);
       this.setExtendedState(this.MAXIMIZED_BOTH);
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

        jLabel1 = new javax.swing.JLabel();
        Start_button = new javax.swing.JButton();
        Exit_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoko");
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1925, 1025));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku-logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 120, 660, 157);

        Start_button.setBackground(new java.awt.Color(153, 0, 51));
        Start_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Start_button.setForeground(new java.awt.Color(255, 255, 255));
        Start_button.setText("Start Game");
        Start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Start_button);
        Start_button.setBounds(820, 430, 308, 75);

        Exit_button.setBackground(new java.awt.Color(153, 0, 51));
        Exit_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit_button.setForeground(new java.awt.Color(255, 255, 255));
        Exit_button.setText("Exit");
        Exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_button);
        Exit_button.setBounds(820, 550, 308, 75);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 2100, 1090);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Exit_buttonActionPerformed

    private void Start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Difficulty().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Start_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_button;
    private javax.swing.JButton Start_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
