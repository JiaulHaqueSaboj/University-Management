/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSUfirstone;

/**
 *
 * @author Jim
 */
public class Intro extends javax.swing.JFrame {

    /**
     * Creates new form Intro
     */
    public Intro() {
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

        Slide3 = new javax.swing.JLabel();
        Slide2 = new javax.swing.JLabel();
        Slide1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Slide3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/slide3.png"))); // NOI18N
        Slide3.setText("jLabel2");
        getContentPane().add(Slide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -70, 1160, 740));

        Slide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/slide2.png"))); // NOI18N
        Slide2.setText("jLabel2");
        getContentPane().add(Slide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 900, 600));

        Slide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/slide1.png"))); // NOI18N
        Slide1.setText("jLabel2");
        getContentPane().add(Slide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/white.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Slide1;
    private javax.swing.JLabel Slide2;
    private javax.swing.JLabel Slide3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
