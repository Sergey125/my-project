
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JMenu;


public class NewJFrame extends javax.swing.JFrame {

Boolean ThreadExist = false;
    private JMenu jMenu11;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
       
    }
@SuppressWarnings("SleepWhileInLoop")

   
    private void initComponents() {

        jMenu11 = new javax.swing.JMenu();

        jMenu11.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ѕиль€рд\"");
        setForeground(new java.awt.Color(255, 102, 51));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
              
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(1, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(1, 500, Short.MAX_VALUE)
        );

        pack();
    }

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
         if (!ThreadExist)	
  {
   
   newThred Thread1= new newThred(this, evt.getX(), evt.getY()); 
   
   Thread1.start();
  
    ThreadExist = true; 
   }

    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new NewJFrame().setVisible(true);
            }
        });
    }

    private void DrawBall() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    


 
    private javax.swing.JMenu jMenu1;
   

}
